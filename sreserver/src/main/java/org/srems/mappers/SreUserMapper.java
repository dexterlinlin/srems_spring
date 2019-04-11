package org.srems.mappers;

import org.srems.models.Role;
import org.srems.models.SreUser;

import java.util.List;

public interface SreUserMapper {
    SreUser loadUserByUsername(String username);

    List<Role> getRolesBySreUserId(String sreUserId);
}
