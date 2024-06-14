package iPhone.Telefone;

public class AparelhoTelefônico {
	String numero;
	public void ligar(String numero) {
		this.numero=numero;
		System.out.println("LIGANDO PARA"+numero);
	}
	public void atender() {
		System.out.println("ATENDENDO LIGAÇÃO");
	}
	private void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}
}
