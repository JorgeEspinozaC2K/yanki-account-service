package com.yanki.account.service.app.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yanki.account.service.app.model.YankiAccount;
import com.yanki.account.service.app.repository.YankiAccountRepository;
import com.yanki.account.service.app.service.YankiAccountService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class YankiAccountServiceImp implements YankiAccountService{
	
	@Autowired
	private YankiAccountRepository yankiAccountRepository;
	
	@Override
	public Flux<YankiAccount> findAll() {
		return yankiAccountRepository.findAll();
	}

	@Override
	public Mono<YankiAccount> findById(String id) {
		return yankiAccountRepository.findById(id);
	}

	@Override
	public Mono<YankiAccount> save(YankiAccount yankiAccount) {
		return yankiAccountRepository.save(yankiAccount);
	}

	@Override
	public Mono<Void> delete(YankiAccount yankiAccount) {
		return yankiAccountRepository.delete(yankiAccount);
	}

}
