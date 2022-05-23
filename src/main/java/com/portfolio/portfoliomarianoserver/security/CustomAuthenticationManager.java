package com.portfolio.portfoliomarianoserver.security;

import com.portfolio.portfoliomarianoserver.dao.AutorDaoImp;
import com.portfolio.portfoliomarianoserver.models.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;


public class CustomAuthenticationManager implements AuthenticationManager {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AutorDaoImp autorDaoImp;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getPrincipal().toString();
        String password = authentication.getCredentials().toString();

         Autor autor = autorDaoImp.getAutor().get(0);

        if (!passwordEncoder.matches(password, autor.getPassword())) {
            throw new BadCredentialsException("Bad Credentials");
        }

        return new UsernamePasswordAuthenticationToken(username, password);
    }
}
