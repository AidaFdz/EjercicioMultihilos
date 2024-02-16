package aida;

import java.util.Random;

public class ObjetoUsuario {
	// Atributos
		String nombre;
		String apellido1;
		String apellido2;
		String tipo;
		String pet;
		String seguro;
		boolean vacunas;
		boolean castrado;

		public ObjetoUsuario(String nombre, String apellido1, String apellido2, String tipo, String pet, String seguro,
				boolean vacunas, boolean castrado) {
			super();
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.tipo = tipo;
			this.pet = pet;
			this.seguro = seguro;
			this.vacunas = vacunas;
			this.castrado = castrado;
		}

		public ObjetoUsuario() {
			super();
			String arraynombres[] = new String[60];
			arraynombres[0] = "Carmen";
			arraynombres[1] = "Lorena";
			arraynombres[2] = "Lucía";
			arraynombres[3] = "Paola";
			arraynombres[4] = "Olga";
			arraynombres[5] = "Alba";
			arraynombres[6] = "Aida";
			arraynombres[7] = "Adela";
			arraynombres[8] = "Ariadna";
			arraynombres[9] = "Macarena";
			arraynombres[10] = "Rocío";
			arraynombres[11] = "Alejandra";
			arraynombres[12] = "Carla";
			arraynombres[13] = "Daniela";
			arraynombres[14] = "Socorro";
			arraynombres[15] = "Javier";
			arraynombres[16] = "Miguel";
			arraynombres[17] = "Gabriel";
			arraynombres[18] = "Rafael";
			arraynombres[19] = "Gerardo";
			arraynombres[20] = "Juan";
			arraynombres[21] = "Francisco";
			arraynombres[22] = "Jorge";
			arraynombres[23] = "Raúl";
			arraynombres[24] = "Óscar";
			arraynombres[25] = "Álvaro";
			arraynombres[26] = "David";
			arraynombres[27] = "Adrián";
			arraynombres[28] = "Pablo";
			arraynombres[29] = "Pedro";
			arraynombres[30] = "Carmela";
			arraynombres[31] = "Irene";
			arraynombres[32] = "Sofía";
			arraynombres[33] = "Francisca";
			arraynombres[34] = "Manuela";
			arraynombres[35] = "Leticia";
			arraynombres[36] = "María José";
			arraynombres[37] = "Patricia";
			arraynombres[38] = "Charo";
			arraynombres[39] = "Margarita";
			arraynombres[40] = "Pilar";
			arraynombres[41] = "Carmen María";
			arraynombres[42] = "Hiniesta";
			arraynombres[43] = "Paula";
			arraynombres[44] = "Dolores";
			arraynombres[45] = "María del Carmen";
			arraynombres[46] = "Miguel Ángel";
			arraynombres[47] = "Alejandro";
			arraynombres[48] = "Ricardo";
			arraynombres[49] = "Jorge Javier";
			arraynombres[50] = "Juan José";
			arraynombres[51] = "Cristóbal";
			arraynombres[52] = "Jesús";
			arraynombres[53] = "Jacobo";
			arraynombres[54] = "Ignacio";
			arraynombres[55] = "Sancho";
			arraynombres[56] = "Íñigo";
			arraynombres[57] = "Borja";
			arraynombres[58] = "Francisco Javier";
			arraynombres[59] = "Alberto José";

			String arrayapellidos[] = new String[40];
			arrayapellidos[0] = "González";
			arrayapellidos[1] = "Fernández";
			arrayapellidos[2] = "Naranjo";
			arrayapellidos[3] = "Pérez";
			arrayapellidos[4] = "Sánchez";
			arrayapellidos[5] = "García";
			arrayapellidos[6] = "Gómez";
			arrayapellidos[7] = "Ortíz";
			arrayapellidos[8] = "Ortega";
			arrayapellidos[9] = "Garrido";
			arrayapellidos[10] = "Leal";
			arrayapellidos[11] = "Hormigo";
			arrayapellidos[12] = "Márquez";
			arrayapellidos[13] = "Rodríguez";
			arrayapellidos[14] = "Díez";
			arrayapellidos[15] = "Gamero";
			arrayapellidos[16] = "Almena";
			arrayapellidos[17] = "Fuentes";
			arrayapellidos[18] = "Espada";
			arrayapellidos[19] = "Cano";
			arrayapellidos[20] = "Serrano";
			arrayapellidos[21] = "Humanes";
			arrayapellidos[22] = "Virlán";
			arrayapellidos[23] = "Vázquez";
			arrayapellidos[24] = "Caballero";
			arrayapellidos[25] = "Montañez";
			arrayapellidos[26] = "Arroyo";
			arrayapellidos[27] = "Parreño";
			arrayapellidos[28] = "García";
			arrayapellidos[29] = "Rolo";
			arrayapellidos[30] = "Rodríguez";
			arrayapellidos[31] = "de la Vega";
			arrayapellidos[32] = "Pérez";
			arrayapellidos[33] = "Vega";
			arrayapellidos[34] = "Delgado";
			arrayapellidos[35] = "Rubio";
			arrayapellidos[36] = "Jiménez";
			arrayapellidos[37] = "Torres";
			arrayapellidos[38] = "Vélez";
			arrayapellidos[39] = "López";

			String arraytipos[] = new String[25];
			arraytipos[0] = "Reptil, (otros)";
			arraytipos[1] = "Roedor, (otros)";
			arraytipos[2] = "Cobaya";
			arraytipos[3] = "Loro";
			arraytipos[4] = "Loro Yaco";
			arraytipos[5] = "Gato, (o. desconocido)";
			arraytipos[6] = "Perro, (PPP)";
			arraytipos[7] = "Perro, (pequeño)";
			arraytipos[8] = "Gato, (criadero)";
			arraytipos[9] = "Perro (mediano) ";
			arraytipos[10] = "Perro, (pequeño)";
			arraytipos[11] = "Perro, (mediano)";
			arraytipos[12] = "Perro, (grande)";
			arraytipos[13] = "Gato, (feral)";
			arraytipos[14] = "Papagayo";
			arraytipos[15] = "Conejo";
			arraytipos[16] = "Caballo";
			arraytipos[17] = "Hurón";
			arraytipos[18] = "Chinchilla";
			arraytipos[19] = "Agaporni";
			arraytipos[20] = "Periquito";
			arraytipos[21] = "Hamster";
			arraytipos[22] = "Tortuga";
			arraytipos[23] = "Serpiente";
			arraytipos[24] = "Nutria";

			String arraypets[] = new String[35];
			arraypets[0] = "Lola";
			arraypets[1] = "Luna";
			arraypets[2] = "Café";
			arraypets[3] = "Oreo";
			arraypets[4] = "Fujur";
			arraypets[5] = "Thor";
			arraypets[6] = "Aguachirri";
			arraypets[7] = "Gabriela";
			arraypets[8] = "Goran";
			arraypets[9] = "Lady";
			arraypets[10] = "Tequi";
			arraypets[11] = "Gordo";
			arraypets[12] = "Pelusa";
			arraypets[13] = "Punky";
			arraypets[14] = "Triana";
			arraypets[15] = "Falete";
			arraypets[16] = "Freja";
			arraypets[17] = "Ambar";
			arraypets[18] = "Neo";
			arraypets[19] = "Wheje";
			arraypets[20] = "Kala";
			arraypets[21] = "Cuqui";
			arraypets[22] = "Leo";
			arraypets[23] = "Mimi";
			arraypets[24] = "Chico";
			arraypets[25] = "Bola";
			arraypets[26] = "Moro";
			arraypets[27] = "Negri";
			arraypets[28] = "Nala";
			arraypets[29] = "Simba";
			arraypets[30] = "Peque";
			arraypets[31] = "Bu";
			arraypets[32] = "Nala";
			arraypets[33] = "Mérida";
			arraypets[34] = "Elsa";

			String arrayseguros[] = new String[10];
			arrayseguros[0] = "Terranea";
			arrayseguros[1] = "Barkibu";
			arrayseguros[2] = "Petplan";
			arrayseguros[3] = "SantéVet";
			arrayseguros[4] = "Confort";
			arrayseguros[5] = "Mascotsegur";
			arrayseguros[6] = "Mapfre";
			arrayseguros[7] = "AON";
			arrayseguros[8] = "Asisa";
			arrayseguros[9] = "Verti";

			Random rd = new Random();

			this.nombre = arraynombres[(int) Math.floor(Math.random() * (59 - 0 + 1))];
			this.apellido1 = arrayapellidos[(int) Math.floor(Math.random() * (39 - 0 + 1))];
			this.apellido2 = arrayapellidos[(int) Math.floor(Math.random() * (39 - 0 + 1))];
			// Nos creamos un random para aplicar funcion gausiana al array de animalitos
			// para la creación del fichero
			this.tipo = arraytipos[gausiana()];
			this.pet = arraypets[(int) Math.floor(Math.random() * (34 - 0 + 1))];
			this.seguro = arrayseguros[(int) Math.floor(Math.random() * (9 - 0 + 1))];
			this.vacunas = rd.nextBoolean();
			this.castrado = rd.nextBoolean();
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getPet() {
			return pet;
		}

		public void setPet(String pet) {
			this.pet = pet;
		}

		public String getSeguro() {
			return seguro;
		}

		public void setSeguro(String seguro) {
			this.seguro = seguro;
		}

		public boolean isVacunas() {
			return vacunas;
		}

		public void setVacunas(boolean vacunas) {
			this.vacunas = vacunas;
		}

		public boolean isCastrado() {
			return castrado;
		}

		public void setCastrado(boolean castrado) {
			this.castrado = castrado;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return " Nombre: " + nombre + ",  Apellido: " + apellido1 + ",  Apellido: " + apellido2 + ",  Mascota=" + tipo
					+ ",  Nombre= " + pet + ", Seguro: " + seguro + ",  Vacunas:" + vacunas + ",  Castrado: " + castrado
					+ ".";
		}

		private static int gausiana() {
			double rand = 0;
			Random gau = new Random();
			double perct = gau.nextGaussian();
			rand = (int) Math.floor(Math.random() * (24 - 0 + 1));
			rand = rand * perct;
			int devolver = (int) rand;
			if (devolver < 0) {
				devolver = devolver * (-1);
			}
			return devolver;
		}
}
