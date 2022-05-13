package com.porfolioserver.portfolioserver.controllers;

import com.porfolioserver.portfolioserver.models.AuthenticationRequest;
import com.porfolioserver.portfolioserver.models.AuthenticationResponse;
import com.porfolioserver.portfolioserver.security.CustomAuthenticationManager;
import com.porfolioserver.portfolioserver.security.JwtUtil;
import com.porfolioserver.portfolioserver.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthenticateController {


    @Autowired
    private CustomAuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetailsService userDetailService;

    @Autowired
    private JwtUtil jwtUtil;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value="/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));
    } catch (BadCredentialsException e) {
        throw new Exception("Incorrect username or password", e);
    }

    final User userDetails = userDetailService.loadUserByUsername(authenticationRequest.getUsername());

    final String jwt = jwtUtil.generateToken(userDetails);

    return ResponseEntity.ok(new AuthenticationResponse(jwt));

    }

}
