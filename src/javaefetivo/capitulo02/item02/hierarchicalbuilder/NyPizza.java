package javaefetivo.capitulo02.item02.hierarchicalbuilder;

import java.util.Objects;

public class NyPizza extends Pizza {
    public enum Size {
        SMALL,
        MEDIUM,
        LARGE
    }

    private final Size size;

    public static class NyPizzaBuilder extends Pizza.PizzaBuilder<NyPizzaBuilder> {
        private final Size size;

        public NyPizzaBuilder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected NyPizzaBuilder self() {
            return this;
        }
    }

    private NyPizza(NyPizzaBuilder builder) {
        super(builder);
        size = builder.size;
    }

    public Size getSize() {
        return size;
    }
}
