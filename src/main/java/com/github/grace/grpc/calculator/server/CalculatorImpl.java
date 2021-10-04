package com.github.grace.grpc.calculator.server;

import com.proto.calculator.*;
import com.proto.greet.GreetRequest;
import com.proto.greet.GreetResponse;
import com.proto.greet.Greeting;
import io.grpc.stub.StreamObserver;

public class CalculatorImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public void sum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        SumResponse sumResponse = SumResponse.newBuilder()
                .setSumResult(request.getFirstNumber() + request.getSecondNumber())
                .build();

        responseObserver.onNext(sumResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void primeNumberDecomposition(PrimeNumberDecompositionRequest request, StreamObserver<PrimeNumberDecompositionResponse> responseObserver) {
        Integer number = request.getNumber();
        Integer divisor = 2;

        while (number > 1) {
            if (number % divisor == 0) {
                number=number/divisor;
                responseObserver.onNext(PrimeNumberDecompositionResponse.newBuilder()
                        .setPrimeFactor(divisor)
                        .build());
            } else {
                divisor = divisor + 1;
            }
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<ComputeAverageRequest> computeAverage(StreamObserver<ComputeAverageResponse> responseObserver) {
        StreamObserver<ComputeAverageRequest> request = new StreamObserver<ComputeAverageRequest>() {

            int sum=0;
            int count=0;

            @Override
            public void onNext(ComputeAverageRequest value) {
                sum+= value.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                double avg=(double) sum/count;
                responseObserver.onNext(
                        ComputeAverageResponse.newBuilder()
                        .setResult(avg)
                        .build()
                );
                responseObserver.onCompleted();
            }
        };
        return request;
    }
}
