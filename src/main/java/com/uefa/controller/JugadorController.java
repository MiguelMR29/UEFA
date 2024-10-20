package com.uefa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uefa.entity.Jugador;
import com.uefa.service.JugadorService;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
@RequestMapping("/url/jugador")
public class JugadorController {
	
	private final JugadorService service;
	
	@GetMapping("/lista")
	public List<Jugador> listaTodos() {
		return service.findAll();
	}
	
	@PostMapping("/inserta")
	public Jugador inserta(@RequestBody Jugador obj) {
		return service.insertaJugador(obj);
	}
	
	@GetMapping("/{id}")
	public Optional<Jugador> busca(@PathVariable("id") int id) {
		return service.buscaPorId(id);
	}
	
	@PutMapping("/actualiza/{id}")
	public Jugador actualiza(@RequestBody Jugador obj, @PathVariable Integer id) {
	    return service.actualizaJugador(obj, id);
	}
	
}
