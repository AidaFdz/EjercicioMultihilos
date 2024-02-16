package aida;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
//import ObjetoUsuario.aida;

public class FileManagementHelpers {
	public static void main(String[] args) {
		final File File = null;
	}

	// Metodo crear un documento con datos aleatorios
	public static void rellenar(int total) {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\temp\\Clinica\\test.txt");
			pw = new PrintWriter(fichero);
			for (int i = 0; i < total; i++) {
				ObjetoUsuario usuario = new ObjetoUsuario();
				pw.println("Usuario " + i + usuario.toString());
			}
			System.out.println("Proceso de rellenado de pacientes realizado con exito.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void rellenar_doctores() throws IOException {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\temp\\Clinica\\doctores.txt");
			pw = new PrintWriter(fichero);
			for (int i = 0; i < 3; i++) {
				ObjetoUsuario usuario = new ObjetoUsuario();
				pw.println("Usuario " + i + usuario.toString());
			}
			System.out.println("Proceso de rellenado de doctores realizado con exito.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	// Metodo crear un documento con datos aleatorios recuperados de la BBDD de
	// pacientes y los metemos en urgencias
	public static void rellenar_paciente() throws IOException {
		String arrayenfermedad[] = new String[10];
		// La enfermedaad es la primra parte y la gravedad standard es la segunda
		// Enfermedades comunes a todas las especies
		arrayenfermedad[0] = "Diarrea, 1";
		arrayenfermedad[1] = "Salmonelosis, 2";
		arrayenfermedad[2] = "Parásitos Internos, 1";
		arrayenfermedad[3] = "Parásitos Exernos, 1";
		arrayenfermedad[4] = "Vómitos, 1";
		arrayenfermedad[5] = "Parvovirus, 2"; // Perros
		arrayenfermedad[6] = "Leishmaniosis, 3"; // Perros
		arrayenfermedad[7] = "Diarrea, 1"; // Gatos
		arrayenfermedad[8] = "Leptospirosis, 2"; // Roedores
		arrayenfermedad[9] = "Cólera aviar, 3"; // Aves

		// Total de pacientes que han ido a urgencias
		int pacientes = (int) (Math.random() * (5 + 1));
		// ID de la urgencia
		int cont = 0;
		File urgencias = new File("C:\\temp\\Clinica\\test.txt");
		FileWriter fichero = new FileWriter("C:\\temp\\Clinica\\test3.txt");
		PrintWriter pw = new PrintWriter(fichero);
		File archivo = null;
		FileReader fr = null;
		try (BufferedReader br = new BufferedReader(new FileReader(urgencias))) {
			String line;

			while ((line = br.readLine()) != null & pacientes > 0) {
				int enfermedad = (int) (Math.random() * (9 + 1));
				pw.println("Urgencia: " + cont + " " + (String) line + " Enfermedad: " + arrayenfermedad[enfermedad]);
				cont++;
				pacientes--;
			}
			System.out.println("Proceso de rellenado de urgencias realizado con exito.");
		} catch (IOException e) {
			System.out.println("Ha habido un problema en el proceso de rellenado de urgencias");
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
				System.out.println("Fichero cerrado con exito.");
			} catch (Exception e2) {
				System.out.println("No se ha podido cerrar el fichero de rellenar urgencias.");
				e2.printStackTrace();
			}
		}
	}

	// Método Insertar por copia
	static void copiar_documento(File origen, File destino) {
		try {
			InputStream in = new FileInputStream(origen);
			OutputStream out = new FileOutputStream(destino);

			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			System.out.println("Proceso de copia realizado con exito.");
			in.close();
			out.close();
		} catch (IOException e) {
			System.out.println("Algo ha ocurrido en la ejecición de copiar.");
			e.printStackTrace();
		}
	}

	// Método para contar palabras
	void cont_words(File archivo) {
		try {

			String linea;
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);

			int cont = 0;

			// Vamos a ir recorriendo el documento línea a línea hasta que sea null (es
			// decir, que no haya niguna más
			while ((linea = br.readLine()) != null) {

				for (int i = 0; i < linea.length(); i++) {
					if (i == 0) {
						if (linea.charAt(i) != ' ')
							cont++;
					} else {
						if (linea.charAt(i - 1) == ' ') {
							if (linea.charAt(i) != ' ') {
								cont++;
							}
						}
					}
				}
			}
			System.out.println("Son " + cont + " palabras");

			fr.close();
		} catch (IOException cont) {
			System.out.println(cont);

		}
	}

	/*
	 * Método de lectura de archivo. Hemos optado por que al usuario se le muestre
	 * el original o la copia, de modo que sea como sea pueda tener el contenido del
	 * documento
	 */
	void lectura_doc(File datos, File origen) {
		File archivoLectura = datos.exists() ? datos : origen;

		if (archivoLectura.exists()) {
			try (FileReader fr = new FileReader(archivoLectura); BufferedReader br = new BufferedReader(fr)) {
				String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
				System.out.println("Ha ocurrido un error al leer el archivo.");
				e.printStackTrace();
			}
		} else {
			System.out.println("El archivo no se encuentra. Por favor, seleccione otra opción.");
		}
	}

	/*
	 * Método de lectura de archivo. Hemos optado por que al usuario se le muestre
	 * el original o la copia, de modo que sea como sea pueda tener el contenido del
	 * documento
	 */
	void lectura_doc(File datos) {

		if (datos.exists()) {
			try (FileReader fr = new FileReader(datos); BufferedReader br = new BufferedReader(fr)) {
				String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
				System.out.println("Ha ocurrido un error al leer el archivo.");
				e.printStackTrace();
			}
		} else {
			System.out.println("El archivo no se encuentra para realizar la lectura .");
		}
	}

	// Método para mover de un sitio a otro los archivos
	void mover(File origen) {

		File destino = new File("C:\\temp\\destino.txt");
		try {
			if (destino.createNewFile()) {
				System.out.println("Archivo creado: " + destino.getName());
			} else {
				System.out.println("El archivo datos ya existe.");
			}
			// Imprimimos la ruta del archivo y hacemos un 2x1, de esta forma comprobamos
			// que esta
			// dónde está y que todo es como debe
			System.out.println("Archivo datos: " + destino.getAbsolutePath());
		}

		catch (IOException e) {
			System.out.println("Algo ha ocurrido en el proceso de creación de los archivos.");
			e.printStackTrace();
		}
		// Fin del Try-Catch de creado del archivo

		try {
			Files.move(origen.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
			System.out.println("El archivo se ha movido de forma satisfactoria.");
		} catch (IOException e) {
			System.out.println("El archivo no se ha podido mover. Error: " + e);
			e.printStackTrace();
		}
	}
}
