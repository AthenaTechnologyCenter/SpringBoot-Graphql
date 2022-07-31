package com.athena.technology.springbootwithgraphql.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
@Accessors(chain = true)
public class Account {
    @Id
    @SequenceGenerator(name = "account_id_seq", sequenceName = "account_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_id_seq")
    private int id;
    private String email;
    private String name;
    private boolean verify = false;
}
