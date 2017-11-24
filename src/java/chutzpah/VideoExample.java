/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chutzpah;

import java.io.File;
import java.io.FileNotFoundException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class VideoExample {

    public static void audio() {
        try {
            File file = new File("DhinkaChika.wav");
            try {
                System.out.println(file.getCanonicalPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (FileNotFoundException e) {
            System.err.println("Put the music.wav file " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static String arg;

    public static void main(String[] args) {

        arg = "background.gif";
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        ImageIcon icon = new ImageIcon(arg);
        f.setSize(480, 360);
        f.setVisible(true);
        l.setIcon(icon);
        p.add(l);
        f.getContentPane().add(p);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        audio();

    }
}
