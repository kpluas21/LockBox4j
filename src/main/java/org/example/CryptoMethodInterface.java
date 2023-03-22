package org.example;

public interface CryptoMethodInterface {
    public static Object encrypt(Object input, Object key) {return input;}
    public static Object decrypt(Object input, Object key) {return input;}
    public static Object generateKey(int n) {return (Integer)n;}
    
}
