package javaefetivo.capitulo02.item02.hierarchicalbuilder;

public class Calzone extends Pizza {
    private final boolean sauceInside;

    public static class CalzoneBuilder extends Pizza.PizzaBuilder<CalzoneBuilder> {
        private boolean sauceInside = false; // Valor padrão

        public CalzoneBuilder sauceInside() {
            sauceInside = true;
            return this;
        }

        @Override
        public Calzone build() {
            return new Calzone(this);
        }

        @Override
        protected CalzoneBuilder self() {
            return this;
        }
    }

    Calzone(CalzoneBuilder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }
}
