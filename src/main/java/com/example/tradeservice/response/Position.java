package com.example.tradeservice.response;

import lombok.Value;

@Value
public class Position {
    private String SecurityCode;
    private Integer quantity;
}
