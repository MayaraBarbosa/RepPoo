
import java.util.Calendar;
import java.util.Random;
import java.lang.Math;

public class Pre extends LinhaTelefonica{

	private Saldo saldo = new Saldo();
	
	
	public Pre(String numero, Cliente cliente, Saldo saldo) {
		super(numero,cliente);
		this.saldo = saldo;

	}

	public Saldo getSaldo() {
		return saldo;
	}

	public void setSaldo(Saldo saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		String aux = super.toString() + saldo.toString();
		return aux;
		
	}

	public boolean recarregar(float valor) {
		
		Calendar aux;
		aux = saldo.getVencimento();
		aux.add(Calendar.DATE, Utilitario.vencimentoRecarga);
		saldo.setValor(saldo.getValor() + valor);
		saldo.setVencimento(aux);
		return true;
	}
	
		
}
