package aparelho.celular;
import funcoes.navegador.AtualizarPagina;
import funcoes.navegador.ExibirPagina;
import funcoes.navegador.NavegadorInternet;
import funcoes.reprodutor.ReprodutorMusical;
import funcoes.funcoesTelefonia.AparelhoTelefonico;

public class Iphone {
	public static void main(String[] args) {
		Funcionalidades fun = new Funcionalidades();
		
		NavegadorInternet navegador = fun;
		ReprodutorMusical reproduzir = fun;
		AparelhoTelefonico telefonar = fun;
		
		navegador.navegando();
		reproduzir.reprodutor_musical();
		telefonar.telefonia();
	}

}
