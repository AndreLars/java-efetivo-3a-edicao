package javaefetivo.capitulo02.item02.hierarchicalbuilder;

import static javaefetivo.capitulo02.item02.hierarchicalbuilder.NyPizza.Size.SMALL;
import static javaefetivo.capitulo02.item02.hierarchicalbuilder.Pizza.Topping.*;

public class PizzaTest {
    public static void main(String[] args) {
        NyPizza pizza =
                new NyPizza.NyPizzaBuilder(SMALL).addTopping(CALABRESA).addTopping(CEBOLA).build();
        Calzone calzone = new Calzone.CalzoneBuilder().addTopping(PRESUNTO).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
