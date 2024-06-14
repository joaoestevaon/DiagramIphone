package iPhone.Musica;

public class ReprodutorMusical {
	String musica;
	public void tocar() {
		System.out.println("TOCANDO MÚSICA");
	}
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA");
	}
	public void selecionarMusica(String musica) {
		this.musica=musica;
		System.out.println("SELECIONANDO MUSICA:"+musica);
	}
}
