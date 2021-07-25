package javaefetivo.capitulo02.item09.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TopLineWithDefault {
    static String firstLineOfFile(String path, String defaultVal) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}
