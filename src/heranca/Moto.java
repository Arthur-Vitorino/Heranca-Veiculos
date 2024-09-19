package heranca;

public class Moto extends Veiculo{
	private boolean temCarenagem;
	
	public Moto(String marca, String modelo, int ano, boolean temCarenagem) {
        super(marca, modelo, ano);
        this.temCarenagem = temCarenagem;
    }
	
	public void empinar() {
        System.out.println("A moto está empinando.");
    }
	
	@Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tem carenagem: " + (temCarenagem ? "Sim" : "Não"));
    }
}
