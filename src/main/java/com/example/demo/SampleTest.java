package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SampleTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String ankit_dabhi = encodeValue("Ankit Dabhi");
        System.out.println(ankit_dabhi);
    }

    private static String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }
}
