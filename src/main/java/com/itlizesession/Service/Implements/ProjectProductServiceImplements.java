package com.itlizesession.Service.Implements;


import com.itlizesession.Entity.ProjectProduct;
import com.itlizesession.Repository.ProjectProductRepository;
import com.itlizesession.Service.ProjectProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectProductServiceImplements implements ProjectProductService {

    @Autowired
    private ProjectProductRepository repository;

    @Override
    public ProjectProduct createProjProd(ProjectProduct projectProduct) {
        return null;
    }

    @Override
    public ProjectProduct saveProjProd(ProjectProduct projectProduct) {
        return null;
    }

    @Override
    public void createProjProd() {

    }

    @Override
    public List<ProjectProduct> findAll() {
        return null;
    }

    @Override
    public ProjectProduct updateProjects(ProjectProduct projectProduct) {
        return null;
    }

    @Override
    public Optional<ProjectProduct> findByProjId(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<ProjectProduct> findByProdId(Integer id) {
        return Optional.empty();
    }

    @Override
    public void delProjProd(ProjectProduct projectProduct) {

    }

    @Override
    public void delProjProd1(ProjectProduct projectProduct) {

    }

    @Override
    public ProjectProduct save(ProjectProduct projectProduct) {
        return null;
    }
}
