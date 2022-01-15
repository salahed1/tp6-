package ma.cigma.pfe;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.presentation.ClientController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Execution {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ClientController controller = (ClientController) context.getBean("clientController");

        Client clientForm = new Client(1, "Ayoub");
        controller.save(clientForm);

    }
}
