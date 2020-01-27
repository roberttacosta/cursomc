package com.roberttacosta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberttacosta.cursomc.domain.Cliente;
import com.roberttacosta.cursomc.repositories.ClienteRepository;
import com.roberttacosta.cursomc.services.exceptions.ObjectNotFoundExcepetion;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("Objeto não encontrado! Id:"+ id + ", Tipo:" + Cliente.class.getName())) ;
	}
	
}
