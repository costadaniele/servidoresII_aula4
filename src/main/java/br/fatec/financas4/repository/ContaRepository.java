package br.fatec.financas4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.fatec.financas4.model.Conta;


@Repository
public interface ContaRepository extends JpaRepository <Conta, Long> {

}