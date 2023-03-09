
package view;

import controller.Coac;
import model.*;

/**
 * Clase principal de las agrupaciones de carnavales. Accede al modelo y gestiona las acciones del usuario
 * @author Javier Gámez Mendoza
 * @version 1.0
 */
public class Main {
	static Coac coac = new Coac(20,10);

	/**
	 * Función principal del programa
	 * @param args Argumentos añadidos al ejecutar el programa
	 */
	public static void main(String[] args) {
		gestionPrograma();
	}

	/**
	 * Método que se encarga de derivar a las diferentes opciones del programa
	 */
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

	/**
	 * Método que ordena la lista de agrupaciones en función de la letra de la obra.
	 */
	private static void sortAgrupML() {
	}

	/**
	 * Método que ordena la lista de agrupaciones en función del autor
	 */
	private static void sortAgrupAuthor() {
	}

	/**
	 * Método que ordena la lista de agrupaciones en funcion del nombre
	 */
	private static void sortAgrupName() {
	}

	/**
	 * Método que lista todas las obras de tipo Romancero
	 */
	private static void listRomanceros() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Romancero) {
				System.out.print(a[i]);
			}
		}
	}
	/**
	 * Método que lista todas las obras de tipo Comparsa
	 */
	private static void listComparsas() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Comparsa) {
				System.out.print(a[i]);
			}
		}
	}
	/**
	 * Método que lista todas las obras de tipo Cuarteto
	 */
	private static void listCuartetos() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Cuarteto) {
				System.out.print(a[i]);
			}
		}
	}
	/**
	 * Método que lista todas las obras de tipo Coro
	 */
	private static void listCoros() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Coro) {
				System.out.print(a[i]);
			}
		}
	}
	/**
	 * Método que lista todas las obras de tipo Chirigota
	 */
	private static void listChirigotas() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] instanceof Chirigota) {
				System.out.print(a[i]);
			}
		}
	}
	/**
	 * Método que lista todas las obras de cualquier tipo
	 */
	private static void listAll() {
		Agrupacion[] a = coac.getAgrupaciones();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				System.out.print(a[i]);
			}
		}
	}

	/**
	 * Método que modifica las características de cualquier agrupación
	 */
	private static void modAgrupacion() {
	}

	/**
	 * Método que elimina agrupaciones de la lista
	 */
	private static void opcDeleteAgrupacion() {
	}

	/**
	 * Método que añade agrupaciones a la lista
	 */
	private static void addAgrupacion() {
	}

	/**
	 * Método que gestiona el submenú Integrantes
	 */
	private static void opcIntegrantes() {
		int opc;
		do {
			mostrarMenuIntegrantes();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {
			}
		} while (opc != 0);
	}

	/**
	 * Método que gestiona el submenú concurso
	 */
	private static void opcConcurso() {
		int opc;
		do {
			mostrarMenuConcurso();
			opc = Util.leerInt("Opción [0 - Volver] : ");
			switch (opc) {

			}
		} while (opc != 0);
	}

	/**
	 * Método que muestra por pantalla el menú principal
	 */
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

	/**
	 * Método que muestra por pantalla el submenú de integrantes
	 */
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

	/**
	 * Método que muestra por pantalla el submenú concurso
	 */
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

	/**
	 * Método que finaliza el programa
	 */
	private static void finDelPrograma() {
		Util.escribir("\nFin del programa.");
		System.exit(0);
	}
}
