package com.itlizesession.Repository;


import com.itlizesession.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository <Project, Integer> {

}
