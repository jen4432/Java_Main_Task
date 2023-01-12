package Cipher;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import java.io.*;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class Crypto {
    private static final String ALGORITHM = "AES";

    public static void encrypt(String key, String inputFileName, String outputFileName) {
        try {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);
            Key secretKey = new SecretKeySpec(Arrays.copyOf(key.getBytes(), 16), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = inputStream.readAllBytes();

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            byte[] outputBytes;

            outputBytes = cipher.doFinal(inputBytes);
            outputStream.write(Base64.getEncoder().encode(outputBytes));
            inputStream.close();
            outputStream.close();

        }catch (Exception e){
            System.out.println("Error : " + e.toString());
        }

    }

    public static void decrypt(String key,String inputFileName,String outputFileName){
        try {
            File inputFile = new File(inputFileName);
            File outputFile = new File(outputFileName);
            Key secretKey = new SecretKeySpec(Arrays.copyOf(key.getBytes(),16),ALGORITHM);
            Cipher decryptCipher = Cipher.getInstance(ALGORITHM);
            decryptCipher.init(Cipher.DECRYPT_MODE,secretKey);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = inputStream.readAllBytes();

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            byte[] outputBytes;

            outputBytes = decryptCipher.doFinal(Base64.getDecoder().decode(inputBytes));
            outputStream.write(outputBytes);
            inputStream.close();
            outputStream.close();

        } catch (Exception e) {
            System.out.println("Error : " + e.toString());
        }

    }
}
