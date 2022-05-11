package com.company.design;

public class Encoder {

    private IEncoder iEncoder;

    public Encoder(IEncoder iEncoder) {
        // 할때마다 바꾸면 비효율적
        // this.iEncoder = new Base64Encoder();
        // this.iEncoder = new UrlEncoder();

        // DI : 외부에서 내가 사용하는 객체를 주입시켜 주는 것
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}
