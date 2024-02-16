package aida;

import java.io.IOException;

public class MyMainVet {

	public static void main(String[] args) {
		// Iniciar los hilos de trabajo
		try {
			System.out.println("Iniciando documento de Doctores de Guardia");
			FileManagementHelpers.rellenar_doctores();

			System.out.println("Creando hilo de pacientes");
			Thread hilo1 = new Thread(new Hilo1Pacientes());
			System.out.println("Creando hilo de urgencias");
			Thread hilo2 = new Thread(new Hilo2Urgencias());
			System.out.println("Creando hilo de doctores de guardia");
			Thread hilo3 = new Thread(new Hilo3Doctores());

			// Iniciar los hilos
			System.out.println("Iniciando hilo de pacientes");
			hilo1.start();
			System.out.println("Iniciando hilo de urgencias");
			hilo2.start();
			System.out.println("Iniciando hilo de doctores");
			hilo3.start();

		} catch (IOException e) {
			// Manejar la excepción si no se pueden crear los doctores
			System.out.println("No se pueden crear doctores");
			e.printStackTrace();
		}
	}
}
