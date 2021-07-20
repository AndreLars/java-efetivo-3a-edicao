package javaefetivo.capitulo02.item03.serializablesingleton;

import java.io.Serializable;

// Para tornar serializable uma classe singleton que use qualquer uma dessas abordagens, não é
// suficiente apenas adicionar 'implements Serializable' à sua declaração. Para manter a garantia do
// singleton, declare todos os campos de instância transient e forneça um método readResolve().
public class Elvis implements Serializable {
    private static final transient Elvis INSTANCE = new Elvis();

    private Elvis() {}

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {}

    // Método readResolve que preserva adequadamente o singleton
    private Object readResolve() {
        // Retorna um Elvis verdadeiro e deixa o garbage collector cuidar do imitador de Elvis.
        return INSTANCE;
    }
}
