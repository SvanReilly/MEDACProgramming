package pruebasDeCodigo;

import java.util.Calendar;
import java.util.Date;

public class Calculadora2 {

	public Calculadora2() {

	}

	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public int dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("El divisor no puede ser cero");
		}
		return a / b;
	}

	public void empty() {

	}

	public void infinite(int a) {

		while (true) {
			int resultado = a++;
			System.out.println(resultado);
		}
	}

	public Date addCurrentDate(int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, day);
		Date fecha = calendar.getTime();
		return fecha;
	}

}
