package heranca;

public class Main {

	public static void main(String[] args) {
		Carro meuCarro = new Carro("Toyota", "Corolla", 2020);
        Moto minhaMoto = new Moto("Yamaha", "MT-07", 2021, true);

        System.out.println("Informações do Carro:");
        meuCarro.exibirInformacoes();
        meuCarro.abrirPortaMalas();
        
        System.out.println("\nInformações da Moto:");
        minhaMoto.exibirInformacoes();
        minhaMoto.empinar();
	}

}
