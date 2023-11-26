package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppUserService {

    @Autowired
    private AppUserRepository appUserRep;

    public List<AppUser> getUsers() {
        return appUserRep.findAll();
    }

    public void addUser(AppUser user) {
        appUserRep.save(user);
    }
    public Optional<AppUser> byEmail(String email) {
        return appUserRep.byEmail(email);
    }

}