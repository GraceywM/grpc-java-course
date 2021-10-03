package com.github.grace.grpc.calculator.client;

import com.proto.calculator.CalculatorServiceGrpc;
import com.proto.calculator.SumRequest;
import com.proto.calculator.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalcuatorClient {
    public static void main(String[] args) {


        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50052)
                .usePlaintext()
                .build();

        //created a calculaorservice
        CalculatorServiceGrpc.CalculatorServiceBlockingStub calculatorClient = CalculatorServiceGrpc.newBlockingStub(channel);

        SumRequest request = SumRequest.newBuilder()
                .setFirstNumber(1)
                .setSecondNumber(2)
                .build();
        //Call the RPC and get back a GreetResponse(protocol buffers)
        SumResponse response = calculatorClient.sum(request);
        System.out.println(request.getFirstNumber() + "+"+request.getSecondNumber()+"="+response.getSumResult());
        channel.shutdown();
    }
}
