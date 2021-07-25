package javaefetivo.capitulo02.item02.hierarchicalbuilder;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza =
                new NyPizza.NyPizzaBuilder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.CALABRESA).addTopping(Pizza.Topping.CEBOLA).build();
        Calzone calzone = new Calzone.CalzoneBuilder().addTopping(Pizza.Topping.PRESUNTO).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
