package com.echomeet.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class UserService {

    private static final List<User> USERS_LIST = new ArrayList<>();

    public void register(User user) {
        if (user == null || user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        user.setStatus("online");
        USERS_LIST.add(user);
        System.out.println("Registered user: " + user); // Debug
    }

    public User login(User user) {
        if (user == null || user.getEmail() == null || user.getEmail().isEmpty()) {
            throw new RuntimeException("Invalid login request: email cannot be null or empty");
        }
        var userIndex = IntStream.range(0, USERS_LIST.size())
                .filter(i -> {
                    User u = USERS_LIST.get(i);
                    return u.getEmail() != null && u.getEmail().equals(user.getEmail());
                })
                .findAny()
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        var cUser = USERS_LIST.get(userIndex);
        if (cUser.getPassword() == null || !cUser.getPassword().equals(user.getPassword())) {
            throw new RuntimeException("Password Incorrect");
        }
        cUser.setStatus("online");
        return cUser;
    }

    public void logout(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        var userIndex = IntStream.range(0, USERS_LIST.size())
                .filter(i -> {
                    User u = USERS_LIST.get(i);
                    return u.getEmail() != null && u.getEmail().equals(email);
                })
                .findAny()
                .orElseThrow(() -> new RuntimeException("User Not Found"));
        USERS_LIST.get(userIndex).setStatus("offline");
    }

    public List<User> findAll() {
        return USERS_LIST;
    }
}