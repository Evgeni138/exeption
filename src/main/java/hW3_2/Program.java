package hW3_2;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        ParsData parsData = new ParsData();
        FileWrite fileWrite = new FileWrite();
        Map<String, Object> dicData = new HashMap<>();
        String path = "src/main/java/hW3_2/users/";
        StringBuilder sb = new StringBuilder();
        boolean param = true;

        while (param) {
            try {
                dicData = parsData.parsInputData();
                param = false;
            } catch (RuntimeException e) {
            }
        }

        for (String i: dicData.keySet()) {
            sb.append(dicData.get(i));
            sb.append(" ");
        }

        path += dicData.get("lastName");

        System.out.println(sb);
        fileWrite.writeData(String.valueOf(sb), path);
    }
}
