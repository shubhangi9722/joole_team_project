package com.itlizesession.Repository;



import com.itlizesession.Entity.Description;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescriptionRepository extends JpaRepository<Description, Integer> {
}