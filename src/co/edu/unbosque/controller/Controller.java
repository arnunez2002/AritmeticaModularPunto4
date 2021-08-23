package co.edu.unbosque.controller;

import co.edu.unbosque.model.Model;
import co.edu.unbosque.view.Vista;

public class Controller {

	private Vista vista;
	private Model model;
	public Controller () {
		vista = new Vista();
		model = new Model();
		String contenido = model.calculo();
		vista.imprimir(contenido);
	}
}
