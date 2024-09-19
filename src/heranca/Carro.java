package heranca;

public class Carro extends Veiculo {
	private int portas;

	public Carro(String marca, String modelo, int ano) {
		super(marca, modelo, ano);
	}
	
	public void abrirPortaMalas() {
        System.out.println("Abrindo porta-malas do carro.");
    }
	
	@Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de portas: " + portas);
    }
	
}
