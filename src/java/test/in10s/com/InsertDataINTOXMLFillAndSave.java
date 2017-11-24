/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.in10s.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 *
 * @author Administrator
 */
public class InsertDataINTOXMLFillAndSave {

    public static void xmlcreater() {
        try {
//            First type to convert 
//            byte[] encord = Files.readAllBytes(Paths.get("E:\\Test\\myJavaTest\\xmldata.xml"));
//            String xmldata=new String(encord,StandardCharsets.UTF_8);
//            xmldata=xmldata.replace("@CAF_NAME@", "1234");
//            FileOutputStream xmloutput=new FileOutputStream("E:\\Test\\myJavaTest\\output.xml");
//            xmloutput.write(xmldata.getBytes());
//              xmloutput.close();

            //SECOND TYPE TO CONVERT
//            FileInputStream fin = new FileInputStream("E:\\Test\\myJavaTest\\xmldata.xml");
//            BufferedReader br = new BufferedReader(new InputStreamReader(fin));
//            StringBuilder sb = new StringBuilder();
//            String line;
//            FileOutputStream xmloutput=new FileOutputStream("E:\\Test\\myJavaTest\\output.xml");
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//                sb.append('\n');
//            }
//            line=(sb.toString());
//              line=line.replace("<@CAF_NAME@>", "1234");
//            xmloutput.write(line.getBytes());
//            xmloutput.close();
//            System.out.println("successfully" + sb);
            //Third type to convert that
//            FileInputStream fin = new FileInputStream("E:\\Test\\myJavaTest\\xmldata.xml");
//            BufferedInputStream xmlout = new BufferedInputStream(fin);
//            int i=0;
//            String xml ="";
//            while ((i = xmlout.read()) != -1) {
//                xml=xml+((char) i);
//            }
//          
//            xml = xml.replace("<@CAF_NAME@>", "1234");
//            FileOutputStream xmloutput = new FileOutputStream("E:\\Test\\myJavaTest\\output.xml");
//            BufferedOutputStream set = new BufferedOutputStream(xmloutput);
//            set.write(xml.getBytes());
//            set.close();
//            set.flush();
//            xmloutput.close();
//            System.out.println("successfully" + xml);


            //Fourth type to convert that uSing SequenceInputStream
//            FileInputStream fin1 = new FileInputStream("E:\\Test\\myJavaTest\\output.xml");
//            FileInputStream fin2 = new FileInputStream("E:\\Test\\myJavaTest\\xmldata.xml");
//            FileOutputStream fout = new FileOutputStream("E:\\Test\\myJavaTest\\xml1data.xml");
//            SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
//            int i;
//            while ((i = sis.read()) != -1) {
//                fout.write(i);
//            }
//            sis.close();
//            fout.close();
//            fin1.close();
//            fin2.close();
//            System.out.println("Success..");

    //Fifth Using FileWriter and reader
      FileWriter fw=new FileWriter("D:\\testout.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    

        } catch (NullPointerException ex) {

        } catch (IOException ex) {
            System.out.println(ex);

        }
    }

    public static void main(String[] args) {
        xmlcreater();
    }
}
