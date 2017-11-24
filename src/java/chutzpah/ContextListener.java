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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 *
 * @author Administrator
 */
public class ContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("1111111hhhhhhhhhhhhhhhh");

        try {
            //video code
//        URL mediaUrl = null;
//        try {
//            mediaUrl = (new File("E:\\pd\\me temu samjhawa ke.mp4")).toURI().toURL();
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(ContextListener.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        JFrame mediaTest = new JFrame("Movie Player");
//        System.out.println("hhhhhhhhhhhhhhhh");
//        mediaTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        VideoPlayer mediaPanel = new VideoPlayer();
//        mediaPanel.MediaPlayer(mediaUrl);
//
//    //         mediaTest.add(mediaPanel);
//        mediaTest.setSize(800, 700); // set the size of the player
//
//        mediaTest.setLocationRelativeTo(null);
//        System.out.println("2222222hhhhhhhhhhhhhhhh");
//        mediaTest.setVisible(true);
//          Audio Code
//        String arg = "background.gif";
//
//        ImageIcon icon = new ImageIcon(arg);
//        f.setSize(480, 360);
//        f.setVisible(true);
//        l.setIcon(icon);
//        p.add(l);
//        f.getContentPane().add(p);
//        f.setLocationRelativeTo(null);
//        f.setResizable(false);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        audio();

            gotoinhtm();

        } catch (IOException ex) {
            Logger.getLogger(ContextListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    
    }
   public void gotoinhtm() throws FileNotFoundException, IOException{
            FileOutputStream fout=new FileOutputStream("Chutzpah.html");    
              File htmlFile = new File("Chutzpah.html");
                  fout.write("<HTML><HEAD><TITLE>Personnel</TITLE></HEAD><BODY>".getBytes());
       fout.write("</BODY></HTML>".getBytes());
       fout.write("<iframe width=\"640\" height=\"360\" src=\"https://www.youtube.com/embed/p6D8u6lEDjQ?autoplay=1\" frameborder=\"0\" allowfullscreen></iframe>".getBytes());
             fout.close();    
             try {
            Desktop.getDesktop().browse(htmlFile.toURI());
        } catch (IOException ex) {
            Logger.getLogger(ContextListener.class.getName()).log(Level.SEVERE, null, ex);
        }
             System.out.println("success...");    
    }
    
}
