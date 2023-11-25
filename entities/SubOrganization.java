package com.challenge.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SubOrganization {
    @Id
    private String subOrganizationID;
    private String getSubOrganizationName;
}
