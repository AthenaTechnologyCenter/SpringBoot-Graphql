package com.athena.technology.springbootwithgraphql.model.request;

import lombok.Data;

@Data
public class UpdateAccountRequest {
    private String email;
    private String name;
    private boolean verify;
}
