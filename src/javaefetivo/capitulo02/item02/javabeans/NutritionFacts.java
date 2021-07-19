package javaefetivo.capitulo02.item02.javabeans;

// Um JavaBean pode apresentar um estado parcialmente inconsistente durante sua construção.
// O padrão JavaBeans exclui a possibilidade de uma classe ser imutável.
public class NutritionFacts {
    private int servingSize; // obrigatório
    private int servings; // obrigatório
    private int calories; // opcional
    private int fat; // opcional
    private int sodium; // opcional
    private int carbohydrate; // opcional

    public NutritionFacts() {}

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodium() {
        return sodium;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
