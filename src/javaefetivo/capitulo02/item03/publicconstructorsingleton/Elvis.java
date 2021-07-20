package javaefetivo.capitulo02.item03.publicconstructorsingleton;

// Singleton com campo final público.
// Transformar uma classe em um singleton pode dificultar o teste dos seus clientes, porque é
// impossível substituir um singleton por implementação simulada, a menos que ela implemente uma
// interface que funcione como o seu tipo.
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    // Ressalva: Um cliente privilegiado pode invocar o construtor privado premeditadamente com o
    // auxílio do método AccessibleObject.setAccessible(). Se precisa se defender contra esse
    // ataque, modifique o construtor para ele lançar uma exceção, caso seja solicitado a criar uma
    // segunda instância.
    private Elvis() {}

    public void leaveTheBuilding() {}
}
