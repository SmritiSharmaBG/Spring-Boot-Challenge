package com.challenge.subOrganization;

import com.challenge.entities.SubOrganization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CREATE and READ
 */
@RestController
public class SubOrganizationController {
    @Autowired
    private SubOrganizationService subOrganizationService;

    @PostMapping("/subOrganization")
    public SubOrganization createSubOrganization(@RequestBody SubOrganization subOrganization) {
        return subOrganizationService.createSubOrganization(subOrganization);
    }

    @GetMapping("/subOrganization/{id}")
    public SubOrganization getOrganization(@PathVariable String id) {
        return subOrganizationService.getSubOrganization(id);
    }
}
