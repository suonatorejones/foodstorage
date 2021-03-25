package com.study.foodstorage.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data //A shortcut for @ToString, @EqualsAndHashCode, @Getter on all fields, and @Setter on all non-final fields, and @RequiredArgsConstructor!
@NoArgsConstructor
@Entity
@Table(name = "foodstorage")
public class FoodStorage {

    @SequenceGenerator(
            name = "foodstorage_sequence",
            sequenceName = "foodstorage_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "foodstorage_sequence"
    )
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    public FoodStorage(Product product) {
        this.product = product;
    }
}
