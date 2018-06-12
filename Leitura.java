import java.io.*;

public class Leitura {
	
	public String lerString(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(isr);
		String aux = "";
		try {
			aux = input.readLine();
		} catch(IOException erro) {
			System.out.println("Deu erro.");
		}
		return aux;
		}
		
		public int lerInt() {
			return Integer.parseInt(lerString());
		}
	
		public double lerDouble() {
			return Double.parseDouble(lerString());
		}
	
		public float lerFloat() {
			return Float.parseFloat(lerString());
		}
}
