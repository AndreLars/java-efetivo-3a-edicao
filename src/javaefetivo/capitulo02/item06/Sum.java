package javaefetivo.capitulo02.item06;

// Absurdamente lento!
public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            // Para realizar essa operação é criada uma instancia de objeto Long todas as vezes que
            // é realizada a soma, prejudicando o desempenho
            sum += i;
        return sum;
    }
}
