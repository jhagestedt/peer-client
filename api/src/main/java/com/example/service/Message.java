package com.example.service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {

    private String[] value;

    public Message setValue(String[] value) {
        this.value = value;
        return this;
    }
}
