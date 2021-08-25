package controllers;

import models.Usuario;
import play.jobs.Job;

public class Inicializador extends Job{
	
	@Override
	public void doJob() throws Exception {
		if(Usuario.count() == 0) {
			Usuario usuario = new Usuario();
			usuario.nome = "João Helis";
			usuario.save();		
		}
	}

}
