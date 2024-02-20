package aparelho.celular;
import funcoes.funcoesTelefonia.AparelhoTelefonico;
import funcoes.navegador.NavegadorInternet;
import funcoes.reprodutor.ReprodutorMusical;

public class Funcionalidades implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reprodutor_musical() {
		System.out.println("Exibindo as funcionalidades para reproduzir musica");
		
	}

	@Override
	public void navegando() {
		System.out.println("Exibindo as funcionalidades da página");
		
	}

	@Override
	public void telefonia() {
		System.out.println("Exibindo as funcionalidades do telefone");
		
	}

}
