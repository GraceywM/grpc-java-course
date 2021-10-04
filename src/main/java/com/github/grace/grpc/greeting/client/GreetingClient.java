package com.github.grace.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.greet.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
    public static void main(String[] args) {
        System.out.println("Hello I am a gRPC client");
        GreetingClient main= new GreetingClient();
        main.run();
    }

    private void run(){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051)
                .usePlaintext()
                .build();
        doSeverStreamingCall(channel);
        System.out.println("Shutting Down Channel");
        channel.shutdown();
    }
    private void doUnaryCall(ManagedChannel channel){
        //created a greetservice
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);

        //Unary
        //create a protocol buffer message
        Greeting greeting =Greeting.newBuilder()
                .setFirstName("Pikachu")
                .setLastName("Pika")
                .build();

        //do the same for a GreetRequest
        GreetRequest greetRequest = GreetRequest.newBuilder()
                .setGreeting(greeting)
                .build();
        //Call the RPC and get back a GreetResponse(protocol buffers)
       GreetResponse greetResponse = greetClient.greet(greetRequest);
        System.out.println(greetResponse.getResult());

    }

    private void doSeverStreamingCall(ManagedChannel channel){
        //created a greetservice
        GreetServiceGrpc.GreetServiceBlockingStub greetClient = GreetServiceGrpc.newBlockingStub(channel);
        //server streaming
        // we prepare the request
        GreetingManyTimesRequest greetingManyTimesRequest=GreetingManyTimesRequest.newBuilder()
                .setGreeting(Greeting.newBuilder()
                        .setFirstName("Pikachu")).
                        build();

        //we stream the response (in a blocking manner)
        greetClient.greetingManyTimes(greetingManyTimesRequest)
                .forEachRemaining(greetingManyTimesResponse -> {
                    System.out.println(greetingManyTimesResponse.getResult());
                });
    }
}
