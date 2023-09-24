package packBridge;

public class FrontEnd {
    public static void main(String[] args) {
        String car1 = "Porsche 911 GT3 RS";
        String car2 = "Toyota Corolla Gr";
        String car3 = "Fiat Uno";
        AbstractDevice porsche911GT3RS = new CarroEsportivo(new ImplementacaoCarroEsportivo(), car1);
        AbstractDevice toyotaCorollaGr = new CarroEsportivo4X4(new ImplementacaoCarroEsportivo(), car2);
        AbstractDevice fiatUno = new CarroComun(new ImplementacaoDeCarroComun(), car3);

        System.out.println("+------------------------------------------------------+");
        System.out.println("|                 Sistema Ativado                      |");
        System.out.println("+------------------------------------------------------+");
        fiatUno.apresentarNomeCarro();
        fiatUno.carroPadrao();
        System.out.println("+------------------------------------------------------+");
        porsche911GT3RS.apresentarNomeCarro();
        porsche911GT3RS.carroPadrao();
        System.out.println("+------------------------------------------------------+");
        toyotaCorollaGr.apresentarNomeCarro();
        toyotaCorollaGr.carroPadrao();
        System.out.println("+------------------------------------------------------+");

        //OS CARROS POSSUEM ACELERAR E FREAR, MAS POSSUEM AS ATIVIDADES RESERVADAS A ELES
    }
}
