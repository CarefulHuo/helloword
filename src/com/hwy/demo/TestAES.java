package com.hwy.demo;

import org.springframework.util.Base64Utils;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * @Author: wangwei55
 * @Date: 19-6-6
 * @Time: 下午4:32
 * @Description:
 */
public class TestAES {
    static String keyString;
    private static final String ALGORITHM = "AES/ECB/PKCS5Padding";

    public static String generateKey(String slat){
        try {
            KeyGenerator kgen = KeyGenerator.getInstance("AES");

            kgen.init(128, new SecureRandom(slat.getBytes()));

            SecretKey secretKey = kgen.generateKey();
            byte[] enCodeFormat = secretKey.getEncoded();
            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
            return Base64Utils.encodeToString(key.getEncoded());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static byte[] encrypt(String content) {
        try {

            Cipher cipher = Cipher.getInstance(ALGORITHM);
            byte[] byteContent = content.getBytes("utf-8");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(Base64Utils.decodeFromString(keyString), "AES"));
            byte[] result = cipher.doFinal(byteContent);
            return result;

        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] decrypt(byte[] content) {
        try {
            SecretKeySpec secretKey = new SecretKeySpec(Base64Utils.decodeFromString(keyString),"AES");
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] result = cipher.doFinal(content);
            return result;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String content = "Crm20190608";
        String password = "123";
        System.out.println("加密之前：" + content);

        keyString = generateKey("12345qwert!@#$%");
        System.out.println(keyString);

        // 加密
        byte[] encrypt = TestAES.encrypt(content);
        System.out.println("加密后的内容：" + new String(encrypt));
        System.out.println("加密后的内容：" + Base64Utils.encodeToString(encrypt));

        // 解密
        byte[] decrypt = TestAES.decrypt(Base64Utils.decodeFromString(Base64Utils.encodeToString(encrypt)));
        System.out.println("解密后的内容：" + new String(decrypt));
    }
}
