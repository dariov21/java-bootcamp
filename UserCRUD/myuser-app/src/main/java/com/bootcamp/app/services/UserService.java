package com.bootcamp.app.services;

import com.bootcamp.app.model.User;
import java.util.List;

public interface UserService {
	
	public void addUser(User p);
    public void updateUser(User p);
    public List<User> listUsers();
    public User getUserById(int id);
    public void removeUser(int id);

}
