package com.redhat.virtdemo;

public class Greeting {

    private final Long counter;
    private final String message; 

    Greeting (Long counter, String message){
        this.counter = counter;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    
    public Long getCounter(){
        return counter; 
    }
}
