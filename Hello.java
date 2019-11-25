import java.io.*;

public class Hello {
    public static void main(String[] args) {
        String s;
        String[] cmd = {"ls", "-l"};  // curl localhost:// 
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            // do nothing
        }
    }
}
