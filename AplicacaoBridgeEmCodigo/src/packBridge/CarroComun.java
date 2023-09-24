package packBridge;

public class CarroComun extends AbstractDevice {
    protected CarroComun(InterfaceCarro implementacao, String nomeCarro) {
        super(implementacao, nomeCarro);
    }

    @Override
    public void carroPadrao() {
        System.out.println("Carro Comun: ");
        implementacao.acelerar();
        implementacao.frear();
    }
}
