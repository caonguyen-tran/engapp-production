package com.engapp.AdminService.dto.clone.UserClone;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class RoleClone {
    private int id;

    private String name;

    private String description;

    private Set<PermissionClone> permissions;
}
