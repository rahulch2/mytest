/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutzpah;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class htmlvideo {
    
    public void gotoinhtm() throws FileNotFoundException, IOException{
            FileOutputStream fout=new FileOutputStream("Chutzpah.html");    
              File htmlFile = new File("Chutzpah.html");
                  fout.write("<HTML><HEAD><TITLE>Personnel</TITLE></HEAD><BODY>".getBytes());
  //  out.println(name + address + age);
       fout.write("</BODY></HTML>".getBytes());
       fout.write("<iframe width=\"640\" height=\"360\" src=\"https://www.youtube.com/embed/p6D8u6lEDjQ?autoplay=1\" frameborder=\"0\" allowfullscreen></iframe>".getBytes());
           //  fout.close();    
             try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Logger.getLogger(ContextListener.class.getName()).log(Level.SEVERE, null, ex);
        }
             System.out.println("success...");    
    }
    
    public static void main(String[] args) {
       htmlvideo objhtmlvideo=new htmlvideo(); 
        try {
            objhtmlvideo.gotoinhtm();
        } catch (IOException ex) {
            Logger.getLogger(htmlvideo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
