package Login;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 * @author Minecraft_Siha
 * Offline login class
 */

public class Offline {
    public static boolean json_exists;   //离线账号储存文件是否存在
    public static JSONObject json = null;   //json主干
    public static JSONArray accounts = null;    //存储账户的json array
    static File file = new File("offline.json");   //文件对象
    public Offline(String name_) throws JSONException, IOException {
        Create(name_);
    }
    public static String FileRead(){    //读取存档的离线账号文件
        String return_ = null;
        try{
            FileInputStream fileInputStream = new FileInputStream(file);
            byte byt[] = new byte[1024];
            int len = fileInputStream.read(byt);
            return_ = new String(byt,0,len);
        }catch (Exception e){
            System.out.println("1");
        }
        return return_;
    }
    public static void Splash() throws JSONException {    //刷新（用于其他类读取）
        if(!file.exists()){    //文件不存在
            json_exists = false;
            json = new JSONObject();
            accounts = new JSONArray();
        }else {   //存在
            json_exists = true;
            json = new JSONObject(FileRead());
            accounts = new JSONArray(String.valueOf(json.getJSONArray("names")));
        }
    }
    public static void Create(String name) throws IOException, JSONException {    //账户储存
        Splash();
        accounts.put(name);
        json.put("names", accounts);
        try{
            FileOutputStream out = new FileOutputStream(file);
            String content = String.valueOf(json);
            byte by[] = content.getBytes();
            out.write(by);
            out.close();
        }catch (Exception e){
            System.out.println("2");
        }
    }
    public static String Acc_List(){
        String n = accounts.toString().replace("[", "").replace("]", "");
        return n;
    }
}
