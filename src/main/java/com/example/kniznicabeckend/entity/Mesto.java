package com.example.kniznicabeckend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mesto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_mesto;
    private String nome;

}
