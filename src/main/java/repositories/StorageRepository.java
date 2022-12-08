package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.product;

import java.awt.Image;
import java.util.Optional;

public interface StorageRepository extends JpaRepository<Image,Long> {
    Optional<product>  findByName(String fileName);
}