package com.eliseubrito.predictGenre.service.impl;

import java.util.Optional;

import com.eliseubrito.predictGenre.model.Genre;
import com.eliseubrito.predictGenre.repository.GenreRepository;
import com.eliseubrito.predictGenre.service.PredictGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliseubrito.predictGenre.model.Cliente;
import com.eliseubrito.predictGenre.repository.ClienteRepository;
import com.eliseubrito.predictGenre.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private GenreRepository genreRepository;

	@Autowired
	private PredictGenreService predictGenreService;
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComGender(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if (clienteBd.isPresent()) {
			salvarClienteComGender(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}

	private void salvarClienteComGender(Cliente cliente) {
		// Verificar se o Gender do Cliente já existe (pelo nome).
		String nameCliente = cliente.getNome();
		Integer numero = genreRepository.countByName(nameCliente);

		if (numero == 0){
			Genre newGenre = predictGenreService.consultarGenre(nameCliente);
			genreRepository.save(newGenre);
			cliente.setGender(newGenre.getGender());
		}
		clienteRepository.save(cliente);
	}

}
