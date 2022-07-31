package com.athena.technology.springbootwithgraphql.service;

import com.athena.technology.springbootwithgraphql.model.entity.Account;
import com.athena.technology.springbootwithgraphql.model.request.AccountRequest;
import com.athena.technology.springbootwithgraphql.model.request.UpdateAccountRequest;

public interface AccountService {

    Account create(AccountRequest request);

    Account update(int id, UpdateAccountRequest request);

    Account get(Integer accountId);
}
