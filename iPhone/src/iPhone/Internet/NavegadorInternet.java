package iPhone.Internet;

import iPhone.iPhone;

public class NavegadorInternet extends iPhone {
	public void exibirPagina(String url) {
		conectadoInternet();
		System.out.println("EXIBINDO PÁGINA");
	}
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA JANELA");
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA");
	}
	private void conectadoInternet() {
		System.out.println("VERIFICANDO CONEXÃO DE INTERNET");
	}
	
}
