package com.alura.libreriaweb;
import com.alura.libreriaweb.libreria.Libreria;
import com.alura.libreriaweb.repositorio.libro_repositorio;
import com.alura.libreriaweb.repositorio.Autor_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriawebApplication implements CommandLineRunner {
	@Autowired
	private libro_repositorio libroRepository;
	@Autowired
	private Autor_Repository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(LibreriawebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();
	}
}
