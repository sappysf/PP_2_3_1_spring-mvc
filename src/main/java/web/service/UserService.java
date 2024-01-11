package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void add(User user);
    void delete(Long id);
    void update(User user);
}
