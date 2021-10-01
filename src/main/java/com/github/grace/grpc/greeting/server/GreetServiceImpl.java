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
}
