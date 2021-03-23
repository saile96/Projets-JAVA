package sn.isi.dao;

import sn.isi.entities.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserImp implements IUser{
    private   DB db = new DB();
    private ResultSet rs;
    private int ok;

    @Override
    public int add(User u) {
        String sql  = "INSERT INTO user VALUES(?, ?, ?, ?, ?)";
        try {
            db.initPrepa(sql);
            db.getPstm().setInt(1,u.getId());
            db.getPstm().setString(2,u.getNom());
            db.getPstm().setString(3,u.getPrenom());
            db.getPstm().setString(4,u.getEmail());
            db.getPstm().setString(5,u.getPassword());
            ok = db.executeMaj();
            db.closeConnection();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<User> liste() {
        List<User> user = new ArrayList<User>();
        String sql = "SELECT * FROM user";
        try {
            db.initPrepa(sql);
            rs = db.executeSelect();
            while (rs.next())
            {
                User u = new User();
                u.setId(rs.getInt(1));
                u.setNom(rs.getString(2));
                u.setPrenom(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setPassword(rs.getString(5));
                user.add(u);

            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public int update(User u) {
        String sql  = "UPDATE  user SET email = ? )";
        try {
            db.initPrepa(sql);
            db.getPstm().setString(1,u.getEmail());


        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return ok;
    }
}
