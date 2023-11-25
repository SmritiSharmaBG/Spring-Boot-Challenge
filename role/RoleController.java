package com.challenge.role;

import com.challenge.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * CRUD for Role, Validation for delete
 */

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/role")
    private Role createRole(@RequestBody Role role) {
        return roleService.createRole(role);
    }

    @GetMapping("/role/{id}")
    private Role getRole(@PathVariable String id) {
        return roleService.getRole(id);
    }

    @PostMapping("/role/{id}")
    private Role updateRole(@PathVariable String id, @RequestBody Role role) {
        return roleService.updateRole(id, role);
    }

    @DeleteMapping("/deleteRole/{id}")
    private String deleteRole(@PathVariable String id) {
        if (roleService.deleteRole(id)) {
            return new StringBuilder("Role with id = ").append(id).append(" is deleted successfully").toString();
        } else {
            return new StringBuilder("Role with id = ").append(id).append("does not exist. Nothing to delete").toString();
        }
    }
}
