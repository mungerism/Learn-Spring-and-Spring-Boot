package com.utopia.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {
    @Bean
//    @Profile("prod")
    public MyMessage myMessage(@Value("${my.messageValue}") String messageString){
        MyMessage myMessage =  new MyMessage();
        myMessage.setMessageString(messageString);
        return myMessage;
    }

//    @Bean
//    @Profile("dev")
//    public MyMessage myMessageDev(){
//        MyMessage myMessage =  new MyMessage();
//        myMessage.setMessageString("This is the dev method");
//        return myMessage;
//    }
}
