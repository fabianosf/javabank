package br.com.bank.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.bank.entity.Banco;
import br.com.bank.entity.Conta;
import br.com.bank.repository.BancoRepository;
import br.com.bank.repository.ContaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private BancoRepository bancoRepository;

	@Autowired
	private ContaRepository contaRepository;

	@Override
	public void run(String... args) throws Exception {

		Banco banco1 = new Banco();
		banco1.setNome("Itau");
		
		Banco banco2 = new Banco();
		banco2.setNome("Bradesco");		 
		
		
		Conta conta1 = new Conta();
		conta1.setDono("Maria Fernanda");
		conta1.setSaldo(0.0);

		Conta conta2 = new Conta();
		conta2.setDono("Pedro Rocha");
		conta2.setSaldo(0.0);		 
		
		conta1.setBanco(banco1);
		conta2.setBanco(banco2);
		
		banco1.getContas().add(conta1);
		banco2.getContas().add(conta2);
		
		
		bancoRepository.save(banco1);
		bancoRepository.save(banco2);
		
		contaRepository.save(conta1);
		contaRepository.save(conta2);
		
		
		
		
		
		
		
		
		
		
	}

}
