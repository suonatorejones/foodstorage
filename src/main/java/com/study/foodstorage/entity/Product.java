package com.study.foodstorage.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;

    /**
     * Nome del prodotto
     */
    private String name;

    /**
     * Quantità in dispensa
     */
    private int quantity;

    /**
     * Livello di soglia per segnalazione alert
     * Valore di default impostato a 0
     */
    private int alertStock = 0;

    /**
     * Tipologia del prodotto
     */
    @Enumerated(EnumType.STRING)
    private ProductType type;

    /**
     *
     */
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shelving_id", referencedColumnName = "id")
    private Shelving shelving;

    public Product(String name, int quantity, ProductType type, Shelving shelving) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.shelving = shelving;
    }
}
