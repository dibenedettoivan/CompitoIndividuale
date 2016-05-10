/**
 * 
 * @author Ivan Di Benedetto
 *
 */
public class Vernam1917 {
	/**
	 * Metodo che scorre le due stringhe e confronta carattere per carattere se corrispondono, esso fa la somma binaria dei numeri
	 * dove 1+1 da 0, 1+0 da 1 e 0+0 da 0.
	 * 
	 * @param s1 stringa binaria
	 * @param s2 stringa binaria
	 * @return ritorna il risultato del crypt
	 */
	public static String crypt(String s1, String s2){
		String out = "";		
		for(int i = 0; i < s1.length(); i++){
			if(s1.charAt(i) == s2.charAt(i)){
				out += "0";
			}
			else{
				out += "1";
			}
		}return out;
	}
	/**
	 * Metodo che scorre le due stringhe e confronta carattere per carattere se corrispondono, esso fa la sottrazione binaria dei numeri
	 * dove 1-1 da 0, 1-0 da 1 e 0-0 da 0.
	 * 
	 * @param s3 stringa binaria
	 * @param s2 stringa binatria
	 * @return ritorna il risultato del decrypt
	 */
	public static String decrypt(String s3, String s2){
		String out = "";
		for(int i = 0; i < s3.length(); i++){
			if(s3.charAt(i) == s2.charAt(i)){
				out += "0";
			}
			else{
				out += "1";
			}
		}return out;
	}
	/**
	 * Metodo main dove andranno utilizzatii metodi scritti sopra.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
			String s1 = "10000110001110101010";
			System.out.println(s1);		
			String s2 = ""; 
			/**
			 * Con questo ciclo creo una stringa di 0 e di 1 che vado a sommare con la stringa s1.
			 */
			for(int i = 0; i < s1.length(); i++){
				s2 += (int)(Math.random() * 2);
			}
			System.out.println(s2);
		
			String s3 = crypt(s1, s2);//Somma binaria
			System.out.println(s3);
			String s4 = decrypt(s3, s2);//Sottrazione binaria
			System.out.println(s4);
			System.out.println(s1.equals(s4));
	}
	
	
	
	



}
