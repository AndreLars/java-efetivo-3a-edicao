package javaefetivo.capitulo02.item03.enumsingleton;

// Enum singleton: abordagem aconselhável
public enum Elvis {
    INSTANCE;

    // Repare que não pode empregá-la caso o seu singleton deva estender outra superclasse que não
    // seja Enum.
    public void leaveTheBuilding() {}
}
