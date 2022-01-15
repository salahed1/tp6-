package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

public class ClientController {

    IClientService service;

    public IClientService getService() {
        return service;
    }

    public void setService(IClientService service) {
        this.service = service;
    }

    public void save(Client c) {
        System.out.println("Presentation Layer !    ");
        service.save(c);
    }

    public ClientController() {
        System.out.println("ClientController instantiated");
    }
}
