package com.athena.technology.springbootwithgraphql.model.response;

import lombok.Data;


@Data
public class AccountResponse {
    private int id;
    private String email;
    private String name;
    private boolean verify;
}
