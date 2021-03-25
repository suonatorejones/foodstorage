package com.study.foodstorage.repository;

import com.study.foodstorage.entity.FoodStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface FoodStorageRepository extends JpaRepository<FoodStorage, Long> {

    //TODO: query personalizzate

}
