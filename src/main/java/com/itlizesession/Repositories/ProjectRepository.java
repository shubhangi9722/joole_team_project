package com.itlizesession.Repositories;

import com.itlizesession.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Integer> {

}
