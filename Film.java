package com.projet.Cinema.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;

public class Film {

    @Column
    private String Name;
    @Column
    private String Genre;
    @Column
    private String titre;
}
