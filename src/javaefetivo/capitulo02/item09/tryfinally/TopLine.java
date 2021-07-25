package javaefetivo.capitulo02.item09.tryfinally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// try-finally - Não é mais a melhor maneira de fechar os recursos!
public class TopLine {
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }
}
