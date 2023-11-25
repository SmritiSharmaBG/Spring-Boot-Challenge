package com.challenge.subOrganization;

import com.challenge.entities.SubOrganization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubOrganizationRepository extends JpaRepository<SubOrganization, String> {
}
