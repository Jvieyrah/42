package com.betrybe.exercicio42.models.repositories;

import com.betrybe.exercicio42.models.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {

}
