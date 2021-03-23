package main;

import sn.isi.dao.IUser;
import sn.isi.dao.UserImp;
import sn.isi.entities.User;

public class Main {
    public static void main(String[] args) {
        User u = new User();
        u.setId(12);
        u.setNom("NDIAYE");
        u.setPrenom("Saile");
        u.setEmail("sailendiaye96@gmail.com");
        u.setPassword("&é'(-");
        IUser iUser = new UserImp();
        iUser.add(u);
    }
}
