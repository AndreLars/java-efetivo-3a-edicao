package javaefetivo.capitulo02.item05;

import java.util.Objects;

// A injeção de dependência proporciona flexibilidade e testabilidade
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
}
