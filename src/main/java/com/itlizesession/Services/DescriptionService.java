package com.itlizesession.Services;

import com.itlizesession.Entity.Description;

public interface DescriptionService {
    // create
    boolean createDescription(Description description);

    // read
    Description getDescription(Integer descriptionId);

    // update
    boolean updateDescription(Description description, Integer descriptionId);

    // delete
    boolean deleteDescription(Description description);
}
