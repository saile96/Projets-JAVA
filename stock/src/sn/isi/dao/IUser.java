package sn.isi.dao;

import sn.isi.entities.User;

import java.util.List;

public interface IUser {
    public  int add(User u);
    public List<User> liste();
    public  int update(User u);
}
