package com.example.demo.core.java;

public class KeyValueMap<K, V> {

    K key;
    V value;

    public KeyValueMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <K, V> void method(KeyValueMap<K, V> kvKeyValueMap) {

    }
}
