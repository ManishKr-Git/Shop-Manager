package com.shopmanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopmanager.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
