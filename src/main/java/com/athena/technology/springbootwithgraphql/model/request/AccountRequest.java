package com.athena.technology.springbootwithgraphql.model.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class AccountRequest {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String name;
    private boolean verify;
}
