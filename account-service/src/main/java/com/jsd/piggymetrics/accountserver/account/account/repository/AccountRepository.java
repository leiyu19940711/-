package com.jsd.piggymetrics.accountserver.account.account.repository;


import com.jsd.piggymetrics.accountserver.account.account.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, String> {

	Account findByName(String name);

}