package com.study.foodstorage.service;

import com.study.foodstorage.entity.FoodStorage;
import com.study.foodstorage.repository.FoodStorageRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j //logger da richiamare con 'log.*'
public class FoodStorageService {

    private final FoodStorageRepository foodStorageRepository;


    public List<FoodStorage> getAll(){
        return foodStorageRepository.findAll();
    }

    public void saveAll(List<FoodStorage> storageList){
        foodStorageRepository.saveAll(storageList);
    }

}
