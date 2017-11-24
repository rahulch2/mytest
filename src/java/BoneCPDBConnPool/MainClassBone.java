/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoneCPDBConnPool;

import com.mchange.v2.c3p0.impl.AuthMaskingProperties;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Administrator
 */
public class MainClassBone {

    public static Properties propertie = new Properties();

    public static void main(String[] args) {

        InputStream inpu = MainClassBone.class.getClassLoader().getResourceAsStream("BoneCPDBConn.properties");
        try {
            if (inpu != null) {
                propertie.load(inpu);
            } else {
            }

        } catch (IOException ex) {

        }

    }
}
