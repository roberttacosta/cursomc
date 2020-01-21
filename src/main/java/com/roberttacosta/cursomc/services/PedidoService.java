package com.roberttacosta.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberttacosta.cursomc.domain.Pedido;
import com.roberttacosta.cursomc.exceptions.ObjectNotFoundExcepetion;
import com.roberttacosta.cursomc.repositories.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;

	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("Objeto não encontrado! Id:"+ id + ", Tipo:" + Pedido.class.getName())) ;
	}
	
}
