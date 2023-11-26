package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/")
public class AppUserController {
    private final AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @PostMapping("/addUser/")
    public void addUser(@RequestBody AppUser user) {
        appUserService.addUser(user);
    }

    @GetMapping("/listOfUsers/")
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

}