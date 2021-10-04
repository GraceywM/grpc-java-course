package com.github.grace.grpc.greeting.server;

import com.proto.greet.*;
import io.grpc.stub.StreamObserver;

public class GreetServiceImpl extends GreetServiceGrpc.GreetServiceImplBase {
    @Override
    public void greet(GreetRequest request, StreamObserver<GreetResponse> responseObserver) {
        //super.greet(request, responseObserver);
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

        //create the response
        String result = "Hello" + firstName;
        GreetResponse response=GreetResponse.newBuilder()
                .setResult(result)
                .build();
        //sent the response
        responseObserver.onNext(response);

        //complete the RPC call
        responseObserver.onCompleted();

    }

    @Override
    public void greetingManyTimes(GreetingManyTimesRequest request, StreamObserver<GreetingManyTimesResponse> responseObserver) {
        String firstName = request.getGreeting().getFirstName();

        try{
            for(int i=0;i<10;i++) {
                String result = "hello" + firstName + "response number" + i;
                GreetingManyTimesResponse response = GreetingManyTimesResponse.newBuilder()
                        .setResult(result)
                        .build();
                responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<LongGreetRequest> longGreet(StreamObserver<LongGreetResponse> responseObserver) {
        StreamObserver<LongGreetRequest> streamObserverOfRequest = new StreamObserver<LongGreetRequest>() {
            String result = "";

            @Override
            public void onNext(LongGreetRequest value) {
                //client sends a message
                result += "hello" + value.getGreeting().getFirstName() + "!";
            }

            @Override
            public void onError(Throwable t) {
                //client sends an error
                responseObserver.onNext(
                        LongGreetResponse.newBuilder()
                                .setResult(result)
                                .build()
                );
            }

            @Override
            public void onCompleted() {
                //client is done
                //this is when we want to return a response(responseObserver)
                responseObserver.onCompleted();
            }
        };
        return streamObserverOfRequest;
    }
}
