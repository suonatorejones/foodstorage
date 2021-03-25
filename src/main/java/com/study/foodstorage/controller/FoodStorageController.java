package com.study.foodstorage.controller;

import com.study.foodstorage.entity.FoodStorage;
import com.study.foodstorage.service.FoodStorageService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "app/foodstorage") //path avvio del controller specifico
@AllArgsConstructor //fa l'autowired del service tramite costruttore
public class FoodStorageController {

    private final FoodStorageService foodStorageService;

    @GetMapping(path = "list")
    public List<FoodStorage> getAllFoodStorage(){
        return foodStorageService.getAll();
    }


}
