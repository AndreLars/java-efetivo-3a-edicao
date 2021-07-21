package javaefetivo.capitulo02.item04;

// Classe utilitária não instanciáveis
public class UtilityClass {
    // Suprima o construtor padrão para a não instanciação
    private UtilityClass() {
        throw new AssertionError();
    }
}
