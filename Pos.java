import java.util.Calendar;
import java.util.Random;
import java.lang.Math;

public class Pos extends LinhaTelefonica {

	private Fatura faturas[] = new Fatura[20];

	public Pos(String numero, Cliente cliente) {
		super(numero,cliente);

	}

	public Fatura[] getFaturas() {
		return faturas;
	}

	public void setFaturas(Fatura fat) {
		for(int i = 0; i < 20; i++)
			if(faturas[i] == null)
				faturas[i] = fat;
	}
	
	public String toString() {
		String aux = "";
		aux += "Fatura : " + faturas;
		return aux;

	}

	public boolean pagarFatura() {
			
		return true;
	}

}
