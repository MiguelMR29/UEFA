package com.uefa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uefa.entity.Jugador;
import com.uefa.repository.JugadorRepository;

@Service
public class JugadorServiceImpl implements JugadorService {
	
	@Autowired
	private JugadorRepository repository;

	@Override
	public List<Jugador> findAll() {
		return repository.findAll();
	}

	@Override
	public Jugador insertaJugador(Jugador obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<Jugador> actualizaJugador(int id, Jugador obj) {
		return repository.findById(id).map(Jugador->{
			Jugador.setNomJugador(obj.getNomJugador());
			Jugador.setValorJugador(obj.getValorJugador());
			Jugador.setPais(obj.getPais());
			return repository.save(obj);
		});
	}

}
