package packBridge;

abstract class AbstractDevice {
    protected InterfaceCarro implementacao;
    private String nomeCarro;
    protected AbstractDevice(InterfaceCarro implementacao, String nomeCarro){
        this.implementacao = implementacao;
        this.nomeCarro = nomeCarro;
    }

    public void apresentarNomeCarro(){
        System.out.println("Carro: " + nomeCarro);
    }
    public abstract void carroPadrao();
}
