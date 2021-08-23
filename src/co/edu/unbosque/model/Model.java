package co.edu.unbosque.model;

public class Model {

	public Model() {
	}

	public String calculo() {
		String contenido = "";

		for (int i = 0; i <= 1000; i++) {
			if (i % 28 == 0 && i % 15 == 9) {
				contenido = contenido + i + " ";
			}
		}

		return contenido;
	}
}
