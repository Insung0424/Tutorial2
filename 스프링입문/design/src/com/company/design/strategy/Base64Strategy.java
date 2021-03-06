package com.company.design.strategy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Strategy implements Encodingstrategy{
    @Override
    public String encode(String text) {
        return Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
    }
}
