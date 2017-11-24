/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutzpah;

import java.awt.BorderLayout;
import java.awt.Component;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
 
/**
*
* @author BUDDHIMA
*/
 
public class MediaPlayer extends javax.swing.JPanel {
 
public MediaPlayer(URL mediauUrl) {
 
setLayout(new BorderLayout());
 
try {
 
Player mediaPlayer=Manager.createRealizedPlayer(new MediaLocator(mediauUrl));
 
Component video=mediaPlayer.getVisualComponent();
 
Component control=mediaPlayer.getControlPanelComponent();
 
if (video!=null) {
 
add(video, BorderLayout.CENTER);          // place the video component in the panel
 
}
 
add(control, BorderLayout.SOUTH);            // place the control in  panel
 
mediaPlayer.start();
 
} catch (Exception e) {
 
}
 
}
 
public static void main(String[] args) {
 
URL mediaUrl=null;
 
try {
 
mediaUrl = (new File("E:\\Test\\DhinkaChika.mpg")).toURI().toURL();
 
} catch (MalformedURLException ex) {
 
System.out.println(ex);
 
}
 
JFrame mediaTest = new JFrame( "Movie Player" );
 
mediaTest.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 
MediaPlayer mediaPanel = new MediaPlayer( mediaUrl );
 
mediaTest.add( mediaPanel );
 
mediaTest.setSize( 352, 288 ); // set the size of the player
 
mediaTest.setLocationRelativeTo(null);
 
mediaTest.setVisible( true );
 
}
 
}