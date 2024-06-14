package iPhone;

import iPhone.Internet.NavegadorInternet;
import iPhone.Musica.ReprodutorMusical;
import iPhone.Telefone.AparelhoTelefônico;

public class iPhone {
	public static void main(String[] args) {
		
		ReprodutorMusical sptfy = new ReprodutorMusical();
		sptfy.selecionarMusica("Pais e filhos (Legião Urbana)");
		sptfy.tocar();
		sptfy.pausar();
		
		AparelhoTelefônico iphone = new AparelhoTelefônico();
		iphone.ligar("69 96875812");
		iphone.atender();
		
		NavegadorInternet nvgd = new NavegadorInternet();
		nvgd.exibirPagina("open.spotify.com");
		nvgd.atualizarPagina();
		nvgd.adicionarNovaAba();
		nvgd.atualizarPagina();
	}
}
