
package com.zmast.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zmast.poc.model.Item;



@Repository
public interface ItemRepository extends JpaRepository<Item,Long>{

}
