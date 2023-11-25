package com.challenge.subOrganization;

import com.challenge.entities.SubOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubOrganizationService {
    @Autowired
    private SubOrganizationRepository subOrganizationRepository;

    public SubOrganization createSubOrganization(SubOrganization subOrganization) {
        return subOrganizationRepository.save(subOrganization);
    }

    public SubOrganization getSubOrganization(String subOrganizationId) {
        return subOrganizationRepository.getReferenceById(subOrganizationId);
    }

}
