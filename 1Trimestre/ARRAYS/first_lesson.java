package ARRAYS;

public class first_lesson {
	public static void main(String[] args) {

		/*el array comienza en la posicion 0, es decir si hay
		 * 10 datos en un array iran del 0 al 9.
		 * 
		 *  java.lang.ArrayIndexOutOfBounds = no se puede acceder al indice del array.
		 * 
		 * 
		 */
		
		int[] primerArray= {1,2,4,7,3,9};
		int[] segundoArray= new int[7]; 
		
		
		for(int i=0;i<segundoArray.length;i++) {
			segundoArray[i]=25;
			
		}
			
			
		for(int i=0; i<=primerArray.length;i++) {
			System.out.print(primerArray[i]);
			
		}
		
		
	}
}
