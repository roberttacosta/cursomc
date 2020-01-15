package com.roberttacosta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberttacosta.cursomc.domain.Categoria;
import com.roberttacosta.cursomc.exceptions.ObjectNotFoundExcepetion;
import com.roberttacosta.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("Objeto não encontrado! Id:"+ id + ", Tipo:" + Categoria.class.getName())) ;
	}
	
}