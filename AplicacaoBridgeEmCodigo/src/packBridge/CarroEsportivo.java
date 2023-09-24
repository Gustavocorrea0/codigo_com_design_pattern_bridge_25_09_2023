package packBridge;

public class CarroEsportivo extends AbstractDevice {
    protected CarroEsportivo(InterfaceCarro implementacao, String nomeCarro) {
        super(implementacao, nomeCarro);
    }

    @Override
    public void carroPadrao() {
        System.out.println("Carro Esportivo: ");
        modoEsporte();
        implementacao.acelerar();
        implementacao.frear();
    }

    void modoEsporte(){
        System.out.println("Ligando Modo Esporte");
    }
}
