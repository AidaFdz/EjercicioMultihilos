package aida;

import org.xmldb.api.base.Collection;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;
import org.exist.xmldb.DatabaseImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
import org.exist.xmldb.DatabaseImpl;

public class Hilo3Doctores implements Runnable {

	private String dni;
	private String nombres;
	private String apellidos;
	private String especialidad;
	private String telefono;

	private static final String URI = "xmldb:exist://localhost:8080/exist/xmlrpc"; // Cambia localhost y el puerto según
																					// tu configuración
	private static final String DRIVER = "org.exist.xmldb.DatabaseImpl";

	@Override
	public void run() {
		try {
			// Inicialización del driver
			Class<?> cl = Class.forName(DRIVER);
			Database database = (Database) cl.newInstance();
			DatabaseManager.registerDatabase(database);

			// Conexión a la base de datos ExistDB
			Collection col = DatabaseManager.getCollection(URI, "admin", "1234");
			if (col == null) {
				System.out.println("No se pudo establecer la conexión con la base de datos.");
				return;
			}

			// Lectura del archivo de urgencias y operaciones en la base de datos
			leerArchivoYActualizarBD(col, "C:\\temp\\Clinica\\test.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void leerArchivoYActualizarBD(Collection col, String rutaArchivo) throws IOException, XMLDBException {
		BufferedReader br = null;
		try {
			// Abrir el archivo de urgencias
			br = new BufferedReader(new FileReader(rutaArchivo));
			String line;
			while ((line = br.readLine()) != null) {
				// Realizar operaciones de lectura/escritura en la base de datos
				// Por ejemplo:
				// Crear un nuevo documento XML y almacenarlo en la base de datos
				String contenidoDocumento = line; // Aquí debes procesar la línea del archivo según tu lógica
				Resource res = col.createResource(null, XMLResource.RESOURCE_TYPE);
				res.setContent(contenidoDocumento);
				col.storeResource(res);
				System.out.println("Documento almacenado en la base de datos.");
			}
		} finally {
			// Cerrar el BufferedReader
			if (br != null) {
				br.close();
			}
		}
	}

	// Métodos CRUD
	public void createDoctor(Collection col) throws XMLDBException {
		String contenidoDocumento = "<doctor><dni>" + dni + "</dni><nombres>" + nombres + "</nombres><apellidos>"
				+ apellidos + "</apellidos><especialidad>" + especialidad + "</especialidad><telefono>" + telefono
				+ "</telefono></doctor>";
		XMLResource res = (XMLResource) col.createResource(null, XMLResource.RESOURCE_TYPE);
		res.setContent(contenidoDocumento);
		col.storeResource(res);
		System.out.println("Doctor almacenado en la base de datos.");
	}

	public void readDoctor(Collection col) throws XMLDBException {
		// Implementar la lectura de un doctor en la base de datos
		// Puedes usar XPath o XQuery para realizar la consulta
	}

	public void updateDoctor(Collection col) throws XMLDBException {
		// Implementar la actualización de un doctor en la base de datos
		// Puedes usar XPath o XQuery para realizar la actualización
	}

	public void deleteDoctor(Collection col) throws XMLDBException {
		// Implementar la eliminación de un doctor en la base de datos
		// Puedes usar XPath o XQuery para realizar la eliminación
	}


}
