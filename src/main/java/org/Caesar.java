package org;

import org.example.CryptoMethodInterface;

public class Caesar implements CryptoMethodInterface {

    private static String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
    
    public static String encrypt(Object input, Object key) {
        //Algorithm : Eₙ(x) = (x + n) mod 26
        String text = (String)input;
        String output = "";

        for(int i = 0; i < text.length(); i++) {
            if(Character.isLowerCase(text.charAt(i))) {
                output += lowercaseLetters.charAt((((int)text.charAt(i) - 97) + (Integer)key) % 26);
            }
            else if(Character.isUpperCase(text.charAt(i))) {
                output += uppercaseLetters.charAt((((int)text.charAt(i) - 65) + (Integer)key) % 26);
            }
            else {
                output += text.charAt(i);
            }
        }

        return output;



    }

    public static String decrypt(Object input, Object key) {
        //Algorithm : Dₙ(x) = (x - n) mod 26

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'decrypt'");
    }

    public static Integer generateKey(int n) {
        return n;
        // // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'generateKey'");
    }
    
}
