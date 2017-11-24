/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in10s.test.com;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Administrator
 */
public class encripted {

    
    

  static String INITIALIZATIO_VECTOR = "AODVNUASDNVVAOVF";
  
  
   static String PLAIN_TEXT = "Java Code Geeks Rock!\0\0\0\0\0\0\0\0\0\0\0";

    static String ENCRYPTION_KEY = "0123456789abcdef";

    public static void main(String [] args) {

        try {

            System.out.println("Plain text:" + PLAIN_TEXT);
            encripted encr=new encripted();
            byte[] cipherText = encr.encrypt(PLAIN_TEXT, ENCRYPTION_KEY);

            System.out.print("Cipher Text:  ");

            for (int i=0; i<cipherText.length; i++)

                System.out.print( String.format("%02X ",cipherText[i]));

            System.out.println("");

            String decrypted = encr.decrypt(cipherText, ENCRYPTION_KEY);

            System.out.println("Decrypted Text: " + decrypted);

        } catch (Exception e) {

            e.printStackTrace();

        } 

    }


  public static byte[] encrypt(String plainText, String encryptionKey) throws Exception {

    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");

    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");

    cipher.init(Cipher.ENCRYPT_MODE, key,new IvParameterSpec(INITIALIZATIO_VECTOR.getBytes("UTF-8")));

    return cipher.doFinal(plainText.getBytes("UTF-8"));

  }

 

  public static String decrypt(byte[] cipherText, String encryptionKey) throws Exception{

    Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding", "SunJCE");

    SecretKeySpec key = new SecretKeySpec(encryptionKey.getBytes("UTF-8"), "AES");

    cipher.init(Cipher.DECRYPT_MODE, key,new IvParameterSpec(INITIALIZATIO_VECTOR.getBytes("UTF-8")));

    return new String(cipher.doFinal(cipherText),"UTF-8");

  }

}
