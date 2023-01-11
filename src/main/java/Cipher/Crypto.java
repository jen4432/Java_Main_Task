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

    public static void encrypt(String key, String inputFilename, String outputFilename) {
        try {
            File inputFile = new File(inputFilename);
            File outputFile = new File(outputFilename);
            Key secretKey = new SecretKeySpec(Arrays.copyOf(key.getBytes(), 16), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = inputStream.readAllBytes();

            byte[] outputBytes;
            FileOutputStream outputStream = new FileOutputStream(outputFile);

            outputBytes = cipher.doFinal(inputBytes);
            outputStream.write(Base64.getEncoder().encode(outputBytes));
            inputStream.close();
            outputStream.close();

        }catch (Exception e){
            System.out.println("Error : " + e.toString());
        }

    }
}
