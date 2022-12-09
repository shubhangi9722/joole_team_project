package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.ProjectProduct;
import com.itlizesession.Repositories.ProjectProductRepository;
import com.itlizesession.Services.ProjectProductService;
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
        return repository.findProjectProductByProject(projectProduct).orElse(null);
    }

    @Override
    public ProjectProduct saveProjProd(ProjectProduct projectProduct) {
        return repository.save(projectProduct);
    }

    @Override
    public void createProjProd() {
        ProjectProduct projprod = new ProjectProduct();
        projprod.setProjProdid(projprod.getProjProdid());
        repository.save(projprod);
    }

    @Override
    public List<ProjectProduct> findAll() {
        return repository.findAll();
    }

    @Override
    public ProjectProduct updateProjects(ProjectProduct projectProduct) {
        ProjectProduct upProjProd = repository.findProjectProductByProject_id(projectProduct.getProjProdid()).orElse(null);
        assert upProjProd != null;
        upProjProd.setProjProdid(projectProduct.getProjProdid());
        return repository.save(upProjProd);
    }

    @Override
    public Optional<ProjectProduct> findByProjId(Integer id) {
        return repository.findProjectProductByProject_id(id);
    }

    @Override
    public Optional<ProjectProduct> findByProdId(Integer id) {
        return repository.findProjectProductByProduct_id(id);
    }

    @Override
    public void delProjProd(ProjectProduct projectProduct) {
        ProjectProduct delProjProd = repository.findProjectProductByProject_id(projectProduct.getProject_id()).orElse(null);
        assert delProjProd != null;
        repository.deleteById(delProjProd.getProject_id());
    }

    @Override
    public void delProjProd1(ProjectProduct projectProduct) {
        ProjectProduct delProjProd1 = repository.findProjectProductByProduct_id(projectProduct.getProduct_id()).orElse(null);
        assert delProjProd1 != null;
        repository.deleteById(delProjProd1.getProduct_id());
    }

    @Override
    public ProjectProduct save(ProjectProduct projectProduct) {
        return repository.save(projectProduct);
    }
}
