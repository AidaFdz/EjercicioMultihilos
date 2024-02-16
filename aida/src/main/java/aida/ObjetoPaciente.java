package aida;

import java.io.File;
import java.util.StringTokenizer;

public class ObjetoPaciente {


		// Atributos
		String nombre;
		String apellido1;
		String apellido2;
		String tipo;
		String pet;
		String seguro;
		boolean vacunas;
		boolean castrado;
		String enfermedad;
		int triage;
		boolean ingreso;

		// Constructor parametrizado
		public ObjetoPaciente(String nombre, String apellido1, String apellido2, String tipo, String pet,
				String seguro, String enfermedad, int triage, boolean ingreso, boolean vacunas, boolean castrado) {
			super();
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.tipo = tipo;
			this.pet = pet;
			this.seguro = seguro;
			this.vacunas = vacunas;
			this.castrado = castrado;
			this.enfermedad = enfermedad;
			this.triage = triage;
			this.ingreso = ingreso;
		}

		/*
		 * El turrón está en el constructor por defecto. El contructor por defecto debe
		 * recuperar datos aleatorios de la "BBDD" de los clientes de la clínica y
		 * añadir enfermedad y
		 */
		public ObjetoPaciente() {

		}

		// Resuperar pacente de la BBDD. Tenemos que ser capaces de poder coger uno de
		// nuestros pacientes y añadirlo
		public static String recuperar(File File) {
			String paciente= " ";
			File test = new File("C:\\temp\\Clinica\\test.txt");
			Object line;
			StringTokenizer sTokenizer = new StringTokenizer(".");
			return paciente;
		}
		
		public static void instanciar_paciente_nuevo () {
			String arrayenfermedad []= new String [10];
			//La enfermedaad es la primra parte y la gravedad standard es la segunda
			//Enfermedades comunes a todas las especies
			arrayenfermedad [0] = "Diarrea, 1"; 
			arrayenfermedad [1] = "Salmonelosis, 2";
			arrayenfermedad [2] = "Parásitos Internos, 1";
			arrayenfermedad [3] = "Parásitos Exernos, 1";
			arrayenfermedad [4] = "Vómitos, 1";
			arrayenfermedad [5] = "Parvovirus, 2"; //Perros
			arrayenfermedad [6] = "Leishmaniosis, 3"; // Perros
			arrayenfermedad [7] = "Diarrea, 1"; // Gatos
			arrayenfermedad [8] = "Leptospirosis, 2"; // Roedores
			arrayenfermedad [9] = "Cólera aviar, 3"; //Aves
			
			//recuperar
		}
		

}
