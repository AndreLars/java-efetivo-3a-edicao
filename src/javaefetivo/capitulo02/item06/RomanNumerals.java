package javaefetivo.capitulo02.item06;

import java.util.regex.Pattern;

// Reusando objeto caro para melhorar o desempenho
public class RomanNumerals {
    // O desempenho pode ser melhorado e muito!
    static boolean isRomanNumeralSlow(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    // Reúso do objeto trabalhoso para melhorar o desempenho
    static boolean isRomanNumeralFast(String s) {
        return ROMAN.matcher(s).matches();
    }
}