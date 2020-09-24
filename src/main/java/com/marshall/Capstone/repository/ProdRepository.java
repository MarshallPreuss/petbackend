package com.marshall.Capstone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.marshall.Capstone.model.Products;

@Repository

public interface ProdRepository extends JpaRepository<Products, Long> {
	//@Query("SELECT prod FROM products prod WHERE prod.categories LIKE (:SKey)")
	//List<Products> searchCategories (@Param("SKey") String prodSKey);
}
