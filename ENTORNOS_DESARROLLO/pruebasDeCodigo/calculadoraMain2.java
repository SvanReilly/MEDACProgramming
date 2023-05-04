package pruebasDeCodigo;

public class calculadoraMain2 {

	public static void main(String[] args) {
		Calculadora2 calculadora= new Calculadora2();
		
		calculadora.empty();
		
		System.out.println(calculadora.sumar(1, 2))
		
		System.out.println(calculadora.restar(0, 0));
		
		System.out.println(calculadora.multiplicar(12, 2));
		
		System.out.println(calculadora.dividir(4, 2));
		
		System.out.println(calculadora.addCurrentDate(4));
		
		
	//	calculadora.infinite(1);		
		

		
		
	}

}
