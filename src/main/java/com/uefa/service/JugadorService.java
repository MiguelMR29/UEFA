package com.uefa.service;

import java.util.List;
import java.util.Optional;

import com.uefa.entity.Jugador;

public interface JugadorService {
	
	public abstract List<Jugador> findAll();
	public abstract Jugador insertaJugador(Jugador obj);
	public Optional<Jugador> buscaPorId(int id);
	public Jugador actualizaJugador(Jugador obj,Integer id);
	
}
