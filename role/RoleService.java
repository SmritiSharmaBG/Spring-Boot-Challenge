package com.challenge.role;

import com.challenge.entities.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    public Role getRole(String id) {
        return roleRepository.getReferenceById(id);
    }

    public Role updateRole(String id, Role role) {
        return roleRepository.updateRole(id, role);
    }

    public boolean deleteRole(String id) {
        try {
            roleRepository.delete(getRole(id));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
