
package view;

import controller.Coac;
import model.*;

public class Main {
	static Coac coac = new Coac(20,10);
	public static void main(String[] args) {
		gestionPrograma();
	}

	private static void gestionPrograma() {
		int opc;
		do {
			mostrarMenuPrincipal();
			opc = Util.leerInt("Opción [0 - Salir] : ");
			switch (opc) {
				case 1 -> opcIntegrantes();
				case 2 -> addAgrupacion();
				case 3 -> opcDeleteAgrupacion();
				case 4 -> modAgrupacion();
				case 5 -> opcConcurso();
				case 6 -> listAll();
				case 7 -> listChirigotas();
				case 8 -> listCoros();
				case 9 -> listCuartetos();
				case 10 -> listComparsas();
				case 11 -> listRomanceros();
				case 12 -> sortAgrupName();
				case 13 -> sortAgrupAuthor();
				case 14 -> sortAgrupML();
			}
		} while (opc != 0);
		finDelPrograma();
	}

	private static void sortAgrupML() {
	}

	private static void sortAgrupAuthor() {
	}

	private static void sortAgrupName() {
	}

	private static void listRomanceros() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Romancero) {
				System.out.print(a[i]);
			}
		}
	}

	private static void listComparsas() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Comparsa) {
				System.out.print(a[i]);
			}
		}
	}

	private static void listCuartetos() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Cuarteto) {
				System.out.print(a[i]);
			}
		}
	}

	private static void listCoros() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Coro) {
				System.out.print(a[i]);
			}
		}
	}

	private static void listChirigotas() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Chirigota) {
				System.out.print(a[i]);
			}
		}
	}

	private static void listAll() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print(a[i]);
			}
		}
	}

	private static void modAgrupacion() {
	}

	private static void opcDeleteAgrupacion() {
	}

	private static void addAgrupacion() {
	}

	private static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			}
		} while (opc != 0);
	}

	private static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {

			}
		} while (opc != 0);
	}

	private static void mostrarMenuPrincipal() {
		Util.escribir("\n");
		Util.escribir("╔═══════════════════════════════════╗");
		Util.escribir("║      GESTION DE AGRUPACIONES      ║");
		Util.escribir("╚═══════════════════════════════════╝");
		Util.escribir("  1. Gestión de Participantes.");
		Util.escribir("  2. Añadir una agrupación.");
		Util.escribir("  3. Eliminar una agrupación.");
		Util.escribir("  4. Editar datos de una agrupación.");
		Util.escribir("  5. Gestión del Concurso.");
		Util.escribir("Listado de agrupaciones:");
		Util.escribir("  6. Listar todas.");
		Util.escribir("  7. Listar Chirigotas.");
		Util.escribir("  8. Listar Coros.");
		Util.escribir("  9. Listar Cuartetos.");
		Util.escribir(" 10. Listar Comparsas.");
		Util.escribir(" 11. Listar Romanceros.");
		Util.escribir("Ordenar el listado:");
		Util.escribir(" 12. Ordenar por el nombre.");
		Util.escribir(" 13. Ordenar por el autor.");
		Util.escribir(" 14. Ordenar por el autor de música/letra.");
	}

	private static void mostrarMenuIntegrantes() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────────┐");
		Util.escribir("│ GESTION DE PARTICIPANTES │");
		Util.escribir("└──────────────────────────┘");
		Util.escribir("  1. Añadir un participante.");
		Util.escribir("  2. Borrar un participante.");
		Util.escribir("  3. Editar los datos de un participante.");
		Util.escribir("  4. Listar todos los participantes.");
		Util.escribir("  5. Listar agrupaciones donde es integrante.");
		Util.escribir("  6. Ordenar por el nombre.");
	}

	private static void mostrarMenuConcurso() {
		Util.escribir("\n");
		Util.escribir("┌──────────────────────┐");
		Util.escribir("│ GESTION DEL CONCURSO │");
		Util.escribir("└──────────────────────┘");
		Util.escribir("Concurso:");
		Util.escribir("  1. Va camino del Falla.");
		Util.escribir("  2. Hacen el Tipo.");
		Util.escribir("  3. Canta la Presentación.");
		Util.escribir("  4. Asignar puntos.");
		Util.escribir("Listado de agrupaciones participantes:");
		Util.escribir("  5. Listar todos.");
		Util.escribir("  6. Listar Chirigotas.");
		Util.escribir("  7. Listar Coros.");
		Util.escribir("  8. Listar Cuartetos.");
		Util.escribir("  9. Listar Comparsas.");
		Util.escribir("Ordenación del listado:");
		Util.escribir(" 10. Ordenar por puntos.");
		Util.escribir(" 11. Ordenar por el nombre.");
		Util.escribir(" 12. Ordenar por el autor.");
		Util.escribir(" 13. Ordenar por autor de música/letra.");
	}

	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
}
