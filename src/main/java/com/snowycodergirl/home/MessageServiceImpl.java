package com.snowycodergirl.home;

public class MessageServiceImpl implements MessageService {

    @Override
    public String generateMessage() {
        return "Hello You! I've successfully used CDI!!!";
    }

}
