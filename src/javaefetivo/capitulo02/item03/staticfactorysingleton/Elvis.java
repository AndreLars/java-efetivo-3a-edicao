package javaefetivo.capitulo02.item03.staticfactorysingleton;

// Singleton com Static Factory.
// A principal vantagem da abordagem de campo público é que a API deixa bem claro que a classe é um
// singleton: o campo static public é final, portanto sempre terá a mesma referência de objeto. A
// segunda vantagem é que é mais simples.
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}
}
