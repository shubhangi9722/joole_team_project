package com.itlizesession.Services.Implements;

import com.itlizesession.Entity.TechnicalDetail;
import com.itlizesession.Repositories.TechnicalDetailRepository;
import com.itlizesession.Services.TechnicalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TechnicalDetailServiceImplements implements TechnicalDetailService {
    @Autowired
    TechnicalDetailRepository technicalDetailRepository;

    @Override
    public boolean createTechnicalDetail(TechnicalDetail technicalDetail) {
        if (technicalDetail == null) {
            System.out.println("null input");
            return false;
        }
        TechnicalDetail target = getTechnicalDetail(technicalDetail.getTechnicalDetailId());
        if (target != null) {
            System.out.println("Description already exists");
            return false;
        }
        try {
            technicalDetailRepository.save(technicalDetail);
        } catch (Exception e) {
            System.out.println("something wrong when creating: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public TechnicalDetail getTechnicalDetail(Integer technicalDetailId) {
        if (technicalDetailId == null) return null;
        Optional<TechnicalDetail> res = technicalDetailRepository.findById(technicalDetailId);
        if (res.isPresent()) {
            return res.get();
        }
        return null;
    }

    @Override
    public boolean updateTechnicalDetail(TechnicalDetail technicalDetail, Integer technicalDetailId) {
        if (technicalDetail == null || technicalDetailId == null) {
            System.out.println("null input");
            return false;
        }
        TechnicalDetail technicalDetailToUpdate = technicalDetailRepository.getById(technicalDetailId);
        if (technicalDetailToUpdate == null) {
            System.out.println("No description with id: " + technicalDetailId);
            return false;
        }
        try {
            technicalDetailToUpdate.setAirflow(technicalDetail.getAirflow());
            technicalDetailToUpdate.setPower(technicalDetail.getPower());
            technicalDetailToUpdate.setOperationVoltage(technicalDetail.getOperationVoltage());
            technicalDetailToUpdate.setFanSpeed(technicalDetail.getFanSpeed());
            technicalDetailToUpdate.setSoundAtMaxSpeed(technicalDetail.getSoundAtMaxSpeed());
            technicalDetailToUpdate.setFanSweepDiameter(technicalDetail.getFanSweepDiameter());
            technicalDetailToUpdate.setHeight(technicalDetail.getHeight());
            technicalDetailRepository.save(technicalDetailToUpdate);
        } catch (Exception e) {
            System.out.println("something wrong when updating: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteTechnicalDetail(TechnicalDetail technicalDetail) {
        if (technicalDetail == null) {
            System.out.println("null input");
            return false;
        }
        try {
            technicalDetailRepository.delete(technicalDetail);
        } catch (Exception e) {
            System.out.println("something wrong when deleting: " + e.getMessage());
            return false;
        }
        return true;
    }
}
