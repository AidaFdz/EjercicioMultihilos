package aida;

import java.io.File;
//import FileManagementProject.FileManagementHelper;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Hilo1Pacientes implements Runnable{

	@Override
	public void run() {
		// vamos a generar un numero aleatorio entre 20 a 50 de casos para testear
				int rannd = (int) Math.floor(Math.random() * (50 - 0 + 20));
				File test = new File("C:\\temp\\Clinica\\test.txt");
				File test2 = new File("C:\\temp\\Clinica\\test2.txt");
				File test3 = new File("C:\\temp\\Clinica\\predefined.txt");
				FileManagementHelpers.rellenar(rannd);
				FileManagementHelpers.copiar_documento(test, test2);
	}
}