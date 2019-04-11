package org.srems.utils;

import org.springframework.security.core.context.SecurityContextHolder;
import org.srems.models.SreUser;

public class SreUserUtils {
    public static SreUser getCurrentSreUser() {
        return (SreUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
