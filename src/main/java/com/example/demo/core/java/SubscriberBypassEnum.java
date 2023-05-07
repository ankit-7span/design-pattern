package com.example.demo.core.java;

public enum SubscriberBypassEnum {

    WHITELISTED(1),
    BLACKLISTED(2);

    private final int value;


    private SubscriberBypassEnum(int value) {
        this.value = value;
    }

    public static SubscriberBypassEnum fromId(int id) {
        for (SubscriberBypassEnum type : values()) {
            if (type.value == id) {
                return type;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
