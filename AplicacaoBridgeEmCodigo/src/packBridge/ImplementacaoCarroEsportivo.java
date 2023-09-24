package packBridge;

public class ImplementacaoCarroEsportivo implements InterfaceCarro{
    @Override
    public void acelerar() {
        System.out.println("Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Freando");
    }
}
