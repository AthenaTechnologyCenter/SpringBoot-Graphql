package com.athena.technology.springbootwithgraphql.controller;

import com.athena.technology.springbootwithgraphql.model.entity.Account;
import com.athena.technology.springbootwithgraphql.model.request.AccountRequest;
import com.athena.technology.springbootwithgraphql.model.request.UpdateAccountRequest;
import com.athena.technology.springbootwithgraphql.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class AccountController {
    private final AccountService service;

    @MutationMapping
    public Account createAccount(@Argument AccountRequest input) {
        return service.create(input);
    }

    @MutationMapping
    public Account updateAccount(@Argument int id, @Argument UpdateAccountRequest input) {
        return service.update(id, input);
    }
}

