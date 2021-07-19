package javaefetivo.capitulo02.item02.builder;

// Builder [Gangue dos Quatro 95]
// Para identificar os parâmetros inválidos o mais rápido possível, verifique a validade dos
// parâmetros nos métodos do construtor e no builder. Confira as invariantes envolvendo parâmetros
// múltiplos nos construtor chamado pelo método build. Para protegê-las contra ataques, realize as
// verificações nos campos do objeto, depois de copiar os parâmetros do builder. Se a verificação
// falhar, lance uma IllegalArgumentException, cuja mensagem detalhada indica quais parâmetros estão inválidos.
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Obrigatorios
        private final int servingSize;
        private final int servings;

        // Opcionais - inicializado para os valores padrão
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val;
            return this;
        }

        public Builder fat(int val) {
            fat = val;
            return this;
        }

        public Builder sodium(int val) {
            sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }
}
