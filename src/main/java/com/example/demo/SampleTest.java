package com.example.demo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class SampleTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*String ankit_dabhi = encodeValue("Ankit Dabhi");
        System.out.println(ankit_dabhi);*/
        String s = validateSubscriberIdentifier("0213520100997");
        System.out.println(s);

    }


    /**
     * This method is used to remove countryCode and landing zeros from subscriberIdentifier(MSISDN)
     * @param subscriberIdentifier
     * @return
     */
    private static String validateSubscriberIdentifier(String subscriberIdentifier) {
        String validatedSubscriberIdentifier = null;
        if (subscriberIdentifier != null) {
            if (subscriberIdentifier.length() > 9 && subscriberIdentifier.startsWith("213")) {
                validatedSubscriberIdentifier = subscriberIdentifier.substring(subscriberIdentifier.length() - 9);
            } else {
                if (subscriberIdentifier.startsWith("0")) {
                    validatedSubscriberIdentifier = subscriberIdentifier.replaceFirst("^0+(?!$)", "");
                } else {
                    validatedSubscriberIdentifier = subscriberIdentifier;
                }
            }
        }
        return validatedSubscriberIdentifier;
    }

    private static String encodeValue(String value) throws UnsupportedEncodingException {
        return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
    }
}
