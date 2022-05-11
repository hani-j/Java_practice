package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Encoder {

    private IEncoder iEncoder;

    // public Encoder(@Qualifier("urlEncoder") IEncoder iEncoder) {
    public Encoder(@Qualifier("base64Encoder") IEncoder iEncoder) {
        // DI : 외부에서 내가 사용하는 객체를 주입시켜 주는 것
        this.iEncoder = iEncoder;
    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
