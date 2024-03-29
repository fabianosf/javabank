package br.com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bank.entity.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Integer>{

}
