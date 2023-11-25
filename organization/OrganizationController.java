package com.challenge.organization;
import com.challenge.entities.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CREATE and READ operations
 */
@RestController
public class OrganizationController {

    @Autowired
    private OrganizationService organizationService;

    @PostMapping("/organization")
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationService.createOrganization(organization);
    }

    @GetMapping("/organization/{id}")
    public Organization getOrganization(@PathVariable int id) {
        return organizationService.getOrganization(id);
    }
}
