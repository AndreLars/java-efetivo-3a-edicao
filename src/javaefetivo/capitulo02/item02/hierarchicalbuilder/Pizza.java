package javaefetivo.capitulo02.item02.hierarchicalbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// Padrão Builder para hierarquias de classe
public abstract class Pizza {
    public enum Topping {
        PRESUNTO,
        COGUMELO,
        CEBOLA,
        PIMENTAO,
        CALABRESA
    }

    final Set<Topping> toppings;

    abstract static class PizzaBuilder<T extends PizzaBuilder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // As subclasses devem sobrescrever esse método para retornar "this"
        protected abstract T self();
    }

    Pizza(PizzaBuilder<?> builder) {
        toppings = builder.toppings.clone();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }
}
