package br.com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bank.entity.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta,Integer>{

}
