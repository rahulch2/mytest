/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoneCPDBConnPool;

import static BoneCPDBConnPool.MainClassBone.propertie;
import com.jolbox.bonecp.BoneCP;
import java.io.FileInputStream;
import java.sql.Connection;
import javax.persistence.Cache;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

/**
 *
 * @author Administrator
 */
public class BoneCPDBPool {

    public static BoneCP connectionPool;

    public static void getConnection() {
        Connection con = null;
        if (connectionPool == null) {
            try {
                init(loadDBProperties());
            } catch (Exception ex) {

            }
        }
        if (con == null) {

        }

    }

    public static void init(JSONObject objBoneCP) {

    }

    public static JSONObject loadDBProperties() {
        JSONObject objBone=null;
        try {   
            objBone=(JSONObject) JSONSerializer.toJSON(propertie);
        } catch (Exception ex) {

        }
        return objBone;
    }

}
