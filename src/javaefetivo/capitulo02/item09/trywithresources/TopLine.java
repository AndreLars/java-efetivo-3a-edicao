package javaefetivo.capitulo02.item09.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// try-with-resources - a melhor maneira de fechar os recursos!
public class TopLine {
    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }
    }
}
