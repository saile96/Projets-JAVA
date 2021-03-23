package sn.isi.entities;

public class Service {
    private int idService;
    private  String nomService;

    public Service() {
    }

    public Service(int idService, String nomService) {
        this.idService = idService;
        this.nomService = nomService;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public String getNomService() {
        return nomService;
    }

    public void setNomService(String nomService) {
        this.nomService = nomService;
    }


}
