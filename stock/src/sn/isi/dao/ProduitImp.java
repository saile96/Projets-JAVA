package sn.isi.dao;

import sn.isi.entities.Produit;

import java.util.List;

public class ProduitImp implements  IProduit{
    private DB db = new DB();
    private int ok;
    @Override
    public int add(Produit p) {
        String sql ="INSERT INTO produit VALUES(NULL, ?, ?)";
        try {
            db.initPrepa(sql);
            db.getPstm().setString(1, p.getRef());
            db.getPstm().setString(2, p.getNom());
            db.getPstm().setString(3, p.getUser().getNom());
            ok = db.executeMaj();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Produit> liste() {
        return null;
    }

    @Override
    public int update(Produit p) {
        return 0;
    }
}
