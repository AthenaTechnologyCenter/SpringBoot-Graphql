package com.athena.technology.springbootwithgraphql.repository;

import com.athena.technology.springbootwithgraphql.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}
