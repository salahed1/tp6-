package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;

public class ClientDao implements IClientDao {
    @Override
    public boolean save(Client c) {
        System.out.println("Dao Layer !");
        return false;
    }
}
