package com.challenge.entities;

import javax.persistence.*;

@Entity
@Table
public class Organization {

    @Id
    private int organizationId;
    private String organizationName;
    private String organizationDescription;

    @OneToMany
    private SubOrganization subOrganization;
}
