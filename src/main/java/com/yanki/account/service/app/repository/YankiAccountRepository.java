package com.yanki.account.service.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.yanki.account.service.app.model.YankiAccount;

public interface YankiAccountRepository extends ReactiveMongoRepository<YankiAccount, String> {

}
