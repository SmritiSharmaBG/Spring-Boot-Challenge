package com.challenge.organization;

import com.challenge.entities.Organization;
import com.challenge.organization.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {
    @Autowired
    private OrganizationRepository organizationRepository;

    public Organization createOrganization(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization getOrganization(int id) {
        return organizationRepository.getReferenceById(id);
    }
}
