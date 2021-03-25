package com.study.foodstorage.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "shelving")
public class Shelving {

    @SequenceGenerator(
            name = "shelving_sequence",
            sequenceName = "shelving_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "shelving_sequence"
    )
    private Long id;

    private String name;
    private int shelf;

    public Shelving(String name, int shelf) {
        this.name = name;
        this.shelf = shelf;
    }
}
