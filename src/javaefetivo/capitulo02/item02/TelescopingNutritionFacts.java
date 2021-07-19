package javaefetivo.capitulo02.item02;

// Padrão telescoping constructor - não é escalável!
public class TelescopingNutritionFacts {
    private final int servingSize; // obrigatório
    private final int servings; // obrigatório
    private final int calories; // opcional
    private final int fat;
    private final int sodium; // opcional
    private final int carbohydrate; // opcional

    public TelescopingNutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public TelescopingNutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public TelescopingNutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public TelescopingNutritionFacts(
            int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public TelescopingNutritionFacts(
            int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
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

// O padrão telescoping constructor funciona, mas é difícil escrever o código do cliente quando se
// tem muitos parâmetros, e é ainda mais difícil ler.
