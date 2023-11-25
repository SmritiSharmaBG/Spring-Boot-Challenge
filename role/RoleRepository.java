package com.challenge.role;

import com.challenge.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    default Role updateRole(String id, Role newRole) {
        Role existingRole = getReferenceById(id);
        existingRole.setRoleName(newRole.getRoleName());
        return save(existingRole);
    }
}
