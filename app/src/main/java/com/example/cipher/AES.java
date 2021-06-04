package com.example.cipher;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.login.LoginException;

public class AES {
    public static void main(String[] args) throws LoginException, NoSuchFieldException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        int KeyNotNull = 1;
        String s = "hello world";
        SecretKey keyAES;
        Cipher cipher1 = Cipher.getInstance("AES");
        if (KeyNotNull==1){
            keyAES = new SecretKeySpec("Bar12345Bar12345".getBytes(),"AES");
        } else {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");
            kgen.init(128);
            keyAES = kgen.generateKey();
        }
        String m1, m2;
        cipher1.init(Cipher.ENCRYPT_MODE, keyAES);
        byte[] bytes = cipher1.doFinal(s.getBytes());
        m1 = bytes.toString();
        System.out.println(m1);
        for(byte b: bytes){
            System.out.println(b);
        }
        System.out.println();
        Cipher descriptCipher = Cipher.getInstance("AES");
        descriptCipher.init(Cipher.DECRYPT_MODE,keyAES);
        byte[] descriptedBytes = descriptCipher.doFinal(bytes);
        m2 = bytes.toString();
        System.out.println(m2);
        for (byte b: descriptedBytes){
            System.out.println((char) b);
        }
    }
}