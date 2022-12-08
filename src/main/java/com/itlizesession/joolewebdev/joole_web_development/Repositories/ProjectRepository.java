package com.itlizesession.joolewebdev.joole_web_development.Repositories;

import com.itlizesession.joolewebdev.joole_web_development.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project, Integer> {

}
