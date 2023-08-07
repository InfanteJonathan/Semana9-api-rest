package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final InstrumentoRepository repository;

	@Autowired
	public DatabaseLoader(InstrumentoRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Instrumento("Guitarra", "Cuerda", "de cuerdas templadas"));
		this.repository.save(new Instrumento("flauta", "viento", "de viento en metal"));
		this.repository.save(new Instrumento("teclado", "teclas", "sonido electronico"));
		this.repository.save(new Instrumento("violin", "Cuerda", "de madera de sauce"));
	}
}