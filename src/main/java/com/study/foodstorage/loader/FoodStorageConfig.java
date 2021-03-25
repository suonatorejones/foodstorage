package com.study.foodstorage.loader;

import com.study.foodstorage.entity.FoodStorage;
import com.study.foodstorage.entity.Product;
import com.study.foodstorage.entity.ProductType;
import com.study.foodstorage.entity.Shelving;
import com.study.foodstorage.repository.FoodStorageRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class FoodStorageConfig {

    /**
     * inizializzazione db per test
     */
    @Bean
    CommandLineRunner commandLineRunner(FoodStorageRepository repository){
        return args -> {

            Shelving A1 = new Shelving("A", 1);
            Shelving A2 = new Shelving("A", 2);
            Shelving A3 = new Shelving("A", 3);
            Shelving B1 = new Shelving("B", 1);
            Shelving B2 = new Shelving("B", 2);
            Shelving B3 = new Shelving("B", 3);

            Product alfa = new Product("dash liquido", 2, ProductType.OTHER, A1);
            Product beta = new Product("datterini pelati", 12, ProductType.FOOD, B1);
            Product gamma = new Product("latte", 6, ProductType.FOOD, B2);

            FoodStorage food_1 = new FoodStorage(alfa);
            FoodStorage food_2 = new FoodStorage(beta);
            FoodStorage food_3 = new FoodStorage(gamma);

            repository.saveAll(Arrays.asList(food_1,food_2,food_3));
        };
    }
}
