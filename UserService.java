package com.projet.Cinema.service;

import com.projet.Cinema.model.GeneralUser;
import com.projet.Cinema.model.User;

import java.util.List;

public class UserService {
    User save(GeneralUser user);
    List<User> findAll();
    void delete(int id);
    User findOne(String username);
    User findById(int id);
    Userupdate( GeneralUser); }
}

