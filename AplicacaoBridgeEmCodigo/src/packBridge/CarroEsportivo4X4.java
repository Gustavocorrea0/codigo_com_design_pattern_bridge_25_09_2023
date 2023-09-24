package packBridge;

public class CarroEsportivo4X4 extends AbstractDevice {
    protected CarroEsportivo4X4(InterfaceCarro implementacao, String nomeCarro) {
        super(implementacao, nomeCarro);
    }


    @Override
    public void carroPadrao() {
        System.out.println("Carro Esportivo 4X4: ");
        ligar4X4();
        implementacao.acelerar();
        implementacao.frear();
    }

    void ligar4X4(){
        System.out.println("Ligando 4x4");
    }
}
