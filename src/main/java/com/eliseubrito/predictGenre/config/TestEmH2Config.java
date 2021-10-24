package com.eliseubrito.predictGenre.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import com.eliseubrito.predictGenre.repository.ClienteRepository;
import com.eliseubrito.predictGenre.repository.GenreRepository;
import com.eliseubrito.predictGenre.model.Genre;
import com.eliseubrito.predictGenre.model.Cliente;

import java.util.Arrays;

@Configuration
@Profile("testEmH2")
public class TestEmH2Config implements CommandLineRunner {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public void run(String... args) throws Exception {
        Genre c1 = new Genre("eliseu", "male", 0.99, 436);
        Genre c2 = new Genre("peter", "male", 0.99, 165452);
        Genre c3 = new Genre("maria", "female", 0.98, 334287);
        Cliente u1 = new Cliente(1L, "Eliseu", "male");
        Cliente u2 = new Cliente(2L, "Maria", "female");
        genreRepository.saveAll(Arrays.asList(c1,c2,c3));
        clienteRepository.saveAll(Arrays.asList(u1, u2));
    }

}
