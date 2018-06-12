/**
 * @(#)Leitura.java
 *
 *
 * @author Diego Vilella Rodrigues
 * @version 1.00 2015/10/6
 */

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