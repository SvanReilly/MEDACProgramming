package tableGames;

import java.util.Scanner;

public class treRAaya {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[][] table = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };
		boolean win = false;
		int i = 0;
		char mark = ' ';
		String victoria = "";
		String mostrarA = "|";
		String mostrarB = "|";
		String mostrarC = "|";
		for (int j = 0; j < table.length; j++) {
			for (int k = 0; k < table.length; k++)
				mostrarA += (table[j = 0][k]) + "|";
			for (int k = 0; k < table.length; k++)
				mostrarB += (table[j = 1][k]) + "|";
			for (int k = 0; k < table.length; k++)
				mostrarC += (table[j = 2][k]) + "|";
			System.out.println(" " + mostrarA + " \n " + mostrarB + " \n " + mostrarC);
		}

		do {
			for (i = 0; i < 9 || win; i++) {
				if (i % 2 == 0) {
					mark = 'O';
				} else {
					mark = 'X';
				}
				if(i==9) {
					win =true;
					System.out.println("Draw");
					break;
				}System.out.println(i);
				System.out.println("Turno de " + mark + " \nDonde poner?");
				String inser = sc.next();
				if (inser.equalsIgnoreCase("a")) {
					if (table[0][0] == 'O' || table[0][0] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[0][0] = mark;
					}
				} else if (inser.equalsIgnoreCase("b")) {
					if (table[0][1] == 'O' || table[0][1] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[0][1] = mark;
					}

				} else if (inser.equalsIgnoreCase("c")) {
					if (table[0][2] == 'O' || table[0][2] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[0][2] = mark;
					}
				} else if (inser.equalsIgnoreCase("d")) {
					if (table[1][0] == 'O' || table[1][0] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[1][0] = mark;
					}
				} else if (inser.equalsIgnoreCase("e")) {
					if (table[1][1] == 'O' || table[1][1] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[1][1] = mark;
					}
				} else if (inser.equalsIgnoreCase("f")) {
					if (table[1][2] == 'O' || table[1][2] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[1][2] = mark;
					}
				} else if (inser.equalsIgnoreCase("g")) {
					if (table[2][0] == 'O' || table[2][0] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[2][0] = mark;
					}
				} else if (inser.equalsIgnoreCase("h")) {
					if (table[2][1] == 'O' || table[2][1] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[2][1] = mark;
					}
				} else if (inser.equalsIgnoreCase("i")) {
					if (table[2][2] == 'O' || table[2][2] == 'X') {
						System.out.println("La casilla ya ha sido utilizada");
						i = i - 1;
					} else {
						table[2][2] = mark;
					}
				}

				else {
					System.out.println("La letra no se encuentra en el tablero");
					i = i - 1;
				}
				if (table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O'
						|| table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O'
						|| table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O'
						|| table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O'
						|| table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O'
						|| table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O'
						|| table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O'
						|| table[0][2] == 'O' && table[1][1] == 'O' && table[2][0] == 'O') {
					win = true;
					victoria = "Jugador O ha ganado";
					break;
				}
				if (table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X'
						|| table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X'
						|| table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X'
						|| table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X'
						|| table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X'
						|| table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X'
						|| table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X'
						|| table[0][2] == 'X' && table[1][1] == 'X' && table[2][0] == 'X') {
					win = true;
					victoria = "Jugador X ha ganado";
					break;
				}
				String mostrar1 = "|";
				String mostrar2 = "|";
				String mostrar3 = "|";
				for (int j = 0; j < table.length; j++) {
					for (int k = 0; k < table.length; k++)
						mostrar1 += (table[j = 0][k]) + "|";
					for (int k = 0; k < table.length; k++)
						mostrar2 += (table[j = 1][k]) + "|";
					for (int k = 0; k < table.length; k++)
						mostrar3 += (table[j = 2][k]) + "|";
					System.out.println(" " + mostrar1 + " \n " + mostrar2 + " \n " + mostrar3);
				}

			}

		} while (win == false);
		System.out.println("Fin del juego! " + victoria);
		String mostrar1 = "|";
		String mostrar2 = "|";
		String mostrar3 = "|";
		for (int j = 0; j < table.length; j++) {
			for (int k = 0; k < table.length; k++)
				mostrar1 += (table[j = 0][k]) + "|";
			for (int k = 0; k < table.length; k++)
				mostrar2 += (table[j = 1][k]) + "|";
			for (int k = 0; k < table.length; k++)
				mostrar3 += (table[j = 2][k]) + "|";
			System.out.println(" " + mostrar1 + " \n " + mostrar2 + " \n " + mostrar3);
		}

	}
}
