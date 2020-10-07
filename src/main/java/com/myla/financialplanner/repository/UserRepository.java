package com.myla.financialplanner.repository;

import com.myla.financialplanner.model.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class UserRepository {

    private final Map<Long, User> userMap = new HashMap<>();

    public UserRepository() {
        userMap.put(1L, new User(1L, "Hieronim", new ArrayList<>()));
        userMap.put(2L, new User(2L, "Kunegunda", new ArrayList<>()));
        userMap.put(3L, new User(3L, "Dionizos", new ArrayList<>()));
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    public User getUserById(Long id) {
        return userMap.get(id);
    }
}
