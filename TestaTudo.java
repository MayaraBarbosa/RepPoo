import java.util.Calendar;
import java.lang.Math;

public class TestaTudo{
	public static void main (String[] args){
		
		int inicio, fim;
		float custo;
		
		String conteudo = "BOA NOITE!" ;

		custo = (float)Math.ceil((double)conteudo.length() / Utilitario.comprimentoChamadaTexto) * Utilitario.custoChamadaTexto;
		
		System.out.println(custo);
		System.out.println(conteudo.length());
		System.out.println(Utilitario.comprimentoChamadaTexto);
		System.out.println(Utilitario.custoChamadaTexto);
		
		//Texto t = new Texto(1,c,l,Utilitario.custoChamadaTexto,"boa noite");
		//c.add(Calendar.DATE, Utilitario.vencimentoRecarga);
		
		//System.out.println(c.getTime());
	}
}