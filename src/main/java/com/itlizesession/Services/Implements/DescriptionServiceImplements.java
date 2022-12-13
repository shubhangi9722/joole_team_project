package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.Description;
import com.itlizesession.Repositories.DescriptionRepository;
import com.itlizesession.Services.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DescriptionServiceImplements implements DescriptionService {
    @Autowired
    private DescriptionRepository descriptionRepository;

    @Override
    public boolean createDescription(Description description) {
        if (description == null) {
            System.out.println("null input");
            return false;
        }
        Description target = getDescription(description.getDescriptionId());
        if (target != null) {
            System.out.println("Description already exists");
            return false;
        }
        try {
            descriptionRepository.save(description);
        } catch (Exception e) {
            System.out.println("something wrong when creating: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public Description getDescription(Integer descriptionId) {
        if (descriptionId == null) return null;
        Optional<Description> res = descriptionRepository.findById(descriptionId);
        if (res.isPresent()) {
            return res.get();
        }
        return null;
    }

    @Override
    public boolean updateDescription(Description description, Integer descriptionId) {
        if (description == null || descriptionId == null) {
            System.out.println("null input");
            return false;
        }
        Description descriptionToUpdate = descriptionRepository.getById(descriptionId);
        if (descriptionToUpdate == null) {
            System.out.println("No description with id: " + descriptionId);
            return false;
        }
        try {
            descriptionToUpdate.setManufacturer(description.getManufacturer());
            descriptionToUpdate.setSeries(description.getSeries());
            descriptionToUpdate.setModel(description.getModel());
            descriptionRepository.save(descriptionToUpdate);
        } catch (Exception e) {
            System.out.println("something wrong when updating: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteDescription(Description description) {
        if (description == null) {
            System.out.println("null input");
            return false;
        }
        try {
            descriptionRepository.delete(description);
        } catch (Exception e) {
            System.out.println("something wrong when deleting: " + e.getMessage());
            return false;
        }
        return true;
    }
}
