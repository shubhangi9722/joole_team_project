package com.itlizesession.Services;

import com.itlizesession.Entity.TechnicalDetail;

public interface TechnicalDetailService {
    boolean createTechnicalDetail(TechnicalDetail technicalDetail);

    // read
    TechnicalDetail getTechnicalDetail(Integer technicalDetailId);

    // update
    boolean updateTechnicalDetail(TechnicalDetail description, Integer technicalDetailId);

    // delete
    boolean deleteTechnicalDetail(TechnicalDetail technicalDetail);
}
