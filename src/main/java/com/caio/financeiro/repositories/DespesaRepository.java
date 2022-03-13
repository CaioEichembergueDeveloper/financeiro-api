package com.caio.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caio.financeiro.domain.Categoria;

@Repository
public interface DespesaRepository extends JpaRepository<Categoria, Integer>{

}
