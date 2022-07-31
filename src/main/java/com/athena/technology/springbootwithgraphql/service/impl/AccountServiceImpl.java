package com.athena.technology.springbootwithgraphql.service.impl;

import com.athena.technology.springbootwithgraphql.model.entity.Account;
import com.athena.technology.springbootwithgraphql.model.request.AccountRequest;
import com.athena.technology.springbootwithgraphql.model.request.UpdateAccountRequest;
import com.athena.technology.springbootwithgraphql.repository.AccountRepository;
import com.athena.technology.springbootwithgraphql.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;

    @Override
    public Account create(AccountRequest request) {
        // mapping request to entity by mapstruct
        var account = new Account().setName(request.getName()).setEmail(request.getEmail()).setVerify(request.isVerify());
        // save entity then response
        return repository.save(account);
    }

    @Override
    public Account update(int id, UpdateAccountRequest request) {
        // find account by id
        var account = repository.findById(id).orElseThrow(() -> new RuntimeException("account is not found"));
        // mapping account request to entity
        if (request.getEmail() != null && !request.getEmail().trim().equals("")) {
            account.setEmail(request.getEmail());
        }
        if (request.getName() != null && !request.getEmail().trim().equals("")) {
            account.setEmail(request.getEmail());
        }
        return repository.save(account);
    }

    @Override
    public Account get(Integer accountId) {
        return null;
    }
}
