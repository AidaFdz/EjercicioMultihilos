package aida;

import org.xmldb.api.base.*;
import org.xmldb.api.modules.*;
import org.xmldb.api.*;
import org.exist.xmldb.DatabaseImpl;

public class ExistDBConnection {


	    private static final String URI = "xmldb:exist://localhost:8080/exist/xmlrpc"; // Hemos dejado el Host por defecto
	    private static final String DRIVER = "org.exist.xmldb.DatabaseImpl";

	    @SuppressWarnings("deprecation")
		public static void main(String[] args) {
	        try {
	            // Inicialización del driver
	            Class<?> cl = Class.forName(DRIVER);
	            Database database = (Database) cl.newInstance();
	            DatabaseManager.registerDatabase(database);

	            // Establecer conexión
	            Collection col = DatabaseManager.getCollection(URI, "admin", "1234"); 
	            if (col == null) {
	                System.out.println("No se pudo establecer la conexión.");
	            } else {
	                System.out.println("Conexión exitosa.");
	                
	                // Aquí puedes realizar operaciones con la base de datos
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
