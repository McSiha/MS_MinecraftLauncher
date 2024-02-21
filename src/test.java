import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
    static JSONObject jo;
    public static void main(String[] args) throws JSONException{
        String s[] = {"123", "xbdskj"};
        ArrayList t = new ArrayList();
        ArrayList a = new ArrayList();
        jo = new JSONObject();
        t.add("sb");
        t.add("kunkun");
        t.add(s);
        jo.put("key", t);
        jo.put("x", "kun");
        a.add(jo.getString("x"));
        jo.put("sb", a);
        System.out.println(jo);
        System.out.println(a);
    }
}
