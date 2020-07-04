package com.jatin.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jatin.ecommerce.entity.ProductCategory;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
// collectionResourceRel represents the name of JSON entry
@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
