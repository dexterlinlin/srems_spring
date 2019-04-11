package org.srems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.srems.mappers.SreUserMapper;
import org.srems.models.SreUser;

@Service
@Transactional
public class SreService implements UserDetailsService {
    @Autowired
    SreUserMapper sreUserMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SreUser sreUser = sreUserMapper.loadUserByUsername(s);
        if(null == sreUser)
        {
            throw new UsernameNotFoundException(s);
        }
        return sreUser;
    }
}
