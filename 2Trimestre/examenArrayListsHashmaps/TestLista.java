package examenArrayListsHashmaps;

import java.util.Scanner;

public class TestLista {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CantanteFamoso MichaelJackson = new CantanteFamoso("Michael Jackson", 1500000000, "Pop");
		CantanteFamoso Joji = new CantanteFamoso("Joji", 1500000, "Soul");
		CantanteFamoso Sade = new CantanteFamoso("Sade", 60000000, "Soul");
		CantanteFamoso BobMarley = new CantanteFamoso("Bob Marley",250000000, "Reggae");
		CantanteFamoso FreddieMercury = new CantanteFamoso("Freddie Mercury", 300000000, "Rock");
		CantanteFamoso KendrickLamar = new CantanteFamoso("Kendrick Lamar", 9500000, "Hip-Hop");
		CantanteFamoso JoeyBada$$ = new CantanteFamoso("Joey Bada$$", 790000, "Hip-Hop");

		ListaCantantesFamosos registroCantantes = new ListaCantantesFamosos();
		registroCantantes.anadirCantante(MichaelJackson);
		registroCantantes.anadirCantante(Joji);
		registroCantantes.anadirCantante(Sade);
		registroCantantes.anadirCantante(BobMarley);
		registroCantantes.anadirCantante(FreddieMercury);
		registroCantantes.anadirCantante(KendrickLamar);
		registroCantantes.anadirCantante(JoeyBada$$);

		System.out.println("Todos los cantantes registrados: \n");
		registroCantantes.mostrarCantantes();

		registroCantantes.borrarCantante(FreddieMercury);
		registroCantantes.borrarCantante(Joji);
		registroCantantes.borrarCantante(KendrickLamar);
		registroCantantes.borrarCantante(JoeyBada$$);

		String rockSingers = registroCantantes.buscarPorGenero("Rock");
		System.out.println("Cantantes de rock:\n" + rockSingers.toString());

		String hipHopSingers = registroCantantes.buscarPorGenero("Hip-Hop");
		System.out.println("Cantantes de Hip-Hop:\n" + hipHopSingers.toString());

		String soulSingers = registroCantantes.buscarPorGenero("Soul");
		System.out.println("Cantantes de Soul:\n" + soulSingers.toString());

	}
}
