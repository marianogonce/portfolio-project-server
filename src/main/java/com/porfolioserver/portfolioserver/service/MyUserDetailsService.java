package com.porfolioserver.portfolioserver.service;

import com.porfolioserver.portfolioserver.dao.AutorDaoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private AutorDaoImp autorDaoImp;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        if (Objects.equals(username, autorDaoImp.getAutor().get(0).getUsername())) {
            return new User(autorDaoImp.getAutor().get(0).getUsername(),autorDaoImp.getAutor().get(0).getPassword(), new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("El usuario no se encuentra registrado");
        }
    }
}
