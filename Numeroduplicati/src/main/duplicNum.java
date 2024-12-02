package main;
public class duplicNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeri = {4, 3, 2, 7, 8, 2, 3, 1};// Dichiarazione dell'array
		for(int i = 0; i < numeri.length; i++) { 
			//il primo for itera su tutti gli elementi dell'arra
			for( int x = 1+ i; x < numeri.length; x++ ) {
				// nel secondo for, confronta l'elemento corrente [i] con quelli successivi [x]; 
				 
				if( numeri[i]==numeri[x]) //controlla se due numeri sono uguali se true viene stampato
					System.out.println("numeri Dup:" + numeri[i]);
			}
			
		}
	
		
	}
	
}
			
