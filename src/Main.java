import Login.Offline;
import org.json.JSONException;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

import static Login.Offline.*;

public class Main {
    public static String LAUNCHER_VERSION = "alpha 0.1.0 indev";
    public static String MC_PATH = "D:\\Minecraft\\.minecraft\\";
    public static String JAVA_PATH = "\"C:\\Users\\DELL\\.gradle\\jdks\\jdk-17.0.3+7\\bin\\java.exe\"";
    public static String JAVA_LIB_PATH = "\"" + MC_PATH + "versions\\1.20.1-Fabric 0.14.22\\1.20.1-Fabric 0.14.22-natives\"";
    public static String LAUNCHER_BRAND = "\"" + MC_PATH + "libraries\\com\\github\\oshi\\oshi-core\\6.2.2\\oshi-core-6.2.2.jar;" +MC_PATH + "libraries\\com\\google\\code\\gson\\gson\\2.10\\gson-2.10.jar;" +MC_PATH + "libraries\\com\\google\\guava\\failureaccess\\1.0.1\\failureaccess-1.0.1.jar;" +MC_PATH + "libraries\\com\\google\\guava\\guava\\31.1-jre\\guava-31.1-jre.jar;" +MC_PATH + "libraries\\com\\ibm\\icu\\icu4j\\71.1\\icu4j-71.1.jar;" +MC_PATH + "libraries\\com\\mojang\\authlib\\4.0.43\\authlib-4.0.43.jar;" +MC_PATH + "libraries\\com\\mojang\\blocklist\\1.0.10\\blocklist-1.0.10.jar;" +MC_PATH + "libraries\\com\\mojang\\brigadier\\1.1.8\\brigadier-1.1.8.jar;" +MC_PATH + "libraries\\com\\mojang\\datafixerupper\\6.0.8\\datafixerupper-6.0.8.jar;" +MC_PATH + "libraries\\com\\mojang\\logging\\1.1.1\\logging-1.1.1.jar;" +MC_PATH + "libraries\\com\\mojang\\patchy\\2.2.10\\patchy-2.2.10.jar;" +MC_PATH + "libraries\\com\\mojang\\text2speech\\1.17.9\\text2speech-1.17.9.jar;" +MC_PATH + "libraries\\commons-codec\\commons-codec\\1.15\\commons-codec-1.15.jar;" +MC_PATH + "libraries\\commons-io\\commons-io\\2.11.0\\commons-io-2.11.0.jar;" +MC_PATH + "libraries\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar;" +MC_PATH + "libraries\\io\\netty\\netty-buffer\\4.1.82.Final\\netty-buffer-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-codec\\4.1.82.Final\\netty-codec-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-common\\4.1.82.Final\\netty-common-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-handler\\4.1.82.Final\\netty-handler-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-resolver\\4.1.82.Final\\netty-resolver-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-transport-classes-epoll\\4.1.82.Final\\netty-transport-classes-epoll-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-transport-native-unix-common\\4.1.82.Final\\netty-transport-native-unix-common-4.1.82.Final.jar;" +MC_PATH + "libraries\\io\\netty\\netty-transport\\4.1.82.Final\\netty-transport-4.1.82.Final.jar;" +MC_PATH + "libraries\\it\\unimi\\dsi\\fastutil\\8.5.9\\fastutil-8.5.9.jar;" +MC_PATH + "libraries\\net\\java\\dev\\jna\\jna-platform\\5.12.1\\jna-platform-5.12.1.jar;" +MC_PATH + "libraries\\net\\java\\dev\\jna\\jna\\5.12.1\\jna-5.12.1.jar;" +MC_PATH + "libraries\\net\\sf\\jopt-simple\\jopt-simple\\5.0.4\\jopt-simple-5.0.4.jar;" +MC_PATH + "libraries\\org\\apache\\commons\\commons-compress\\1.21\\commons-compress-1.21.jar;" +MC_PATH + "libraries\\org\\apache\\commons\\commons-lang3\\3.12.0\\commons-lang3-3.12.0.jar;" +MC_PATH + "libraries\\org\\apache\\httpcomponents\\httpclient\\4.5.13\\httpclient-4.5.13.jar;" +MC_PATH + "libraries\\org\\apache\\httpcomponents\\httpcore\\4.4.15\\httpcore-4.4.15.jar;" +MC_PATH + "libraries\\org\\apache\\logging\\log4j\\log4j-api\\2.19.0\\log4j-api-2.19.0.jar;" +MC_PATH + "libraries\\org\\apache\\logging\\log4j\\log4j-core\\2.19.0\\log4j-core-2.19.0.jar;" +MC_PATH + "libraries\\org\\apache\\logging\\log4j\\log4j-slf4j2-impl\\2.19.0\\log4j-slf4j2-impl-2.19.0.jar;" +MC_PATH + "libraries\\org\\joml\\joml\\1.10.5\\joml-1.10.5.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1-natives-windows.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1-natives-windows-arm64.jar;" +MC_PATH + "libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1-natives-windows-x86.jar;" +MC_PATH + "libraries\\org\\slf4j\\slf4j-api\\2.0.1\\slf4j-api-2.0.1.jar;" +MC_PATH + "libraries\\net\\fabricmc\\tiny-mappings-parser\\0.3.0+build.17\\tiny-mappings-parser-0.3.0+build.17.jar;" +MC_PATH + "libraries\\net\\fabricmc\\sponge-mixin\\0.12.5+mixin.0.8.5\\sponge-mixin-0.12.5+mixin.0.8.5.jar;" +MC_PATH + "libraries\\net\\fabricmc\\tiny-remapper\\0.8.2\\tiny-remapper-0.8.2.jar;" +MC_PATH + "libraries\\net\\fabricmc\\access-widener\\2.1.0\\access-widener-2.1.0.jar;" +MC_PATH + "libraries\\org\\ow2\\asm\\asm\\9.5\\asm-9.5.jar;" +MC_PATH + "libraries\\org\\ow2\\asm\\asm-analysis\\9.5\\asm-analysis-9.5.jar;" +MC_PATH + "libraries\\org\\ow2\\asm\\asm-commons\\9.5\\asm-commons-9.5.jar;" +MC_PATH + "libraries\\org\\ow2\\asm\\asm-tree\\9.5\\asm-tree-9.5.jar;" +MC_PATH + "libraries\\org\\ow2\\asm\\asm-util\\9.5\\asm-util-9.5.jar;" +MC_PATH + "libraries\\net\\fabricmc\\intermediary\\1.20.1\\intermediary-1.20.1.jar;" +MC_PATH + "libraries\\net\\fabricmc\\fabric-loader\\0.14.22\\fabric-loader-0.14.22.jar;" +MC_PATH + "versions\\1.20.1-Fabric 0.14.22\\1.20.1-Fabric 0.14.22.jar\"";
    public static String TMP_DIR = "\"C:\\Users\\DELL\\AppData\\Roaming\\PCL\"";
    public static String JAVA_WRAPPER = "\"C:\\Users\\DELL\\AppData\\Roaming\\PCL\\JavaWrapper.jar\"";
    public static String PLAYER_NAME;
    public static String VERSION = "\"1.20.1-Fabric 0.14.22\"";
    public static String GAME_DIR = "\"" +MC_PATH + "versions\\1.20.1-Fabric 0.14.22\"";
    public static String ASSETS_DIR = "\"" +MC_PATH + "assets\"";
    public static String Launch_Command = JAVA_PATH +
            " -XX:+UseG1GC -XX:-UseAdaptiveSizePolicy -XX:-OmitStackTraceInFastThrow -Dfml.ignoreInvalidMinecraftCertificates=True -Dfml.ignorePatchDiscrepancies=True -Dlog4j2.formatMsgNoLookups=true -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump -Djava.library.path=" +
            JAVA_LIB_PATH + " -Djna.tmpdir=" + JAVA_LIB_PATH + " -Dorg.lwjgl.system.SharedLibraryExtractPath=" + JAVA_LIB_PATH + " -Dio.netty.native.workdir="
            + JAVA_LIB_PATH + " -Dminecraft.launcher.brand=PCL -Dminecraft.launcher.version=313 -cp " + LAUNCHER_BRAND + " -DFabricMcEmu=net.minecraft.client.main.Main -Xmn256m -Xmx3174m -Dlog4j2.formatMsgNoLookups=true --add-exports cpw.mods.bootstraplauncher/cpw.mods.bootstraplauncher=ALL-UNNAMED -Doolloo.jlw.tmpdir="
            + TMP_DIR + " -jar " + JAVA_WRAPPER  + " net.fabricmc.loader.impl.launch.knot.KnotClient --username " + PLAYER_NAME + " --version "
            + VERSION + " --gameDir " + GAME_DIR + " --assetsDir " + ASSETS_DIR + " --assetIndex 5 --uuid d879c3e7acb940efade68a6780eba495 --accessToken eyJraXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX4xYsY --clientId ${clientid} --xuid ${auth_xuid} --userType msa --versionType \"MS_MinecraftLauncher\" --width 854 --height 480";

    public static String jvm_command = System.getProperty("vm.function");
    public static void Launch(){
        System.out.println("OK");
        try {
            Process process = Runtime.getRuntime().exec(Launch_Command);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String content = br.readLine();
            while (content != null) {
                System.out.println("t");
                System.out.println(content);
                content = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Login() throws JSONException, IOException {
        String x;
        System.out.println("请输入操作编号：");
        System.out.println("1，注册");
        System.out.println("2，登录");
        Scanner xi = new Scanner(System.in);
        x = xi.next();
        if(Objects.equals(x, "1")){
            Scanner sc = new Scanner(System.in);
            new Offline(sc.next());
        }else {
            Splash();
            if(new File("offline.json").exists()){
                System.out.println("你拥有许多用户名，请输入你要使用的");
                System.out.println("名称列表：");
            }else {
                System.out.println("你还没有用户名，去注册一个吧！");
                Scanner sc = new Scanner(System.in);
                new Offline(sc.next());
            }
            System.out.println(Acc_List());
            Scanner n = new Scanner(System.in);
            String data = n.next();
            for(int i = 0;i < accounts.length();i++){
                if(Objects.equals(accounts.get(i), data)){
                    PLAYER_NAME = data;
                    System.out.println("OK");
                    break;
                }
            }
            if (Objects.equals(PLAYER_NAME, "Minecraft_Siha")){
                System.out.println("未发现用户名");
            }
        }
    }
    //读取jvm参数启动
    public static void JvmReader() throws JSONException, IOException {
            switch (jvm_command){
                case "Launch":
                    Launch();
                case "Login":
                    Login();
            }

    }
    public static void main(String[] args) throws JSONException, IOException {
        if (!Objects.equals(null, jvm_command)){JvmReader();}
        System.out.println(jvm_command);;
        JvmReader();
        String OS =System.getProperty("os.name");
        if(Objects.equals(OS, "Windows 11")) System.out.println("Win11也有用这个的一天啊！");
        System.out.println("Welcome to Minecraft_Siha_Launcher" + " " + LAUNCHER_VERSION);
        do {
            System.out.println("请输入操作编号：");
            System.out.println("1, MC, 启动！！！");
            System.out.println("2, 登录 / 创建账号");
            Scanner s = new Scanner(System.in);
            String c = s.next();   //操作编号
            switch (c) {
                case "1":
                    System.out.println("跳转...");
                    Launch();
                case "2":
                    Login();
            }
        } while (true);



    }

}
