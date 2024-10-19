package com.uefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uefa.entity.Jugador;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
}
