package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public class ClientService implements IClientService {

    IClientDao dao;

    public IClientDao getDao() {
        return dao;
    }

    public void setDao(IClientDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean save(Client c) {
        System.out.println("Service Layer !");
        return dao.save(c);
    }
}
