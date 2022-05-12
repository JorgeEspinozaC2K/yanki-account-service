package com.yanki.account.service.app.service;

import com.yanki.account.service.app.model.YankiAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface YankiAccountService {
	
	public Flux<YankiAccount> findAll();
	
	public Mono<YankiAccount> findById(String id);
	
	public Mono<YankiAccount> save(YankiAccount yankiAccount);
	
	public Mono<Void> delete(YankiAccount yankiAccount);
	
}
