package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.product;

public interface product_repository extends JpaRepository<product, Long>{

}
