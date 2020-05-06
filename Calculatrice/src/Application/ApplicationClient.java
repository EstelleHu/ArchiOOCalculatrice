package Application;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import calculatrice.utils.ApplicationProperties;
import calculatrice.utils.ExceptionEnum;
import client.controller.CalculatriceController;
import client.service.RequeteCalculatrice;
import client.view.Interface;
import server.exception.CalculatriceException;
import server.operation.Addition;
import server.service.ServiceCalculatrice;

public class ApplicationClient {

    public static void main (String []args) {
        Interface view = new Interface();
        CalculatriceController controller = new CalculatriceController(view);
        view.setController(controller);
        //INIT LANG
        ApplicationProperties appProp;
        String lang ="EN";
        if(lang.equals("FR")) {
            appProp=ApplicationProperties.getInstance("src/client/view/messages_fr.properties");
        }else {
            appProp=ApplicationProperties.getInstance("src/client/view/messages_en.properties");
        } 
 
        // STRT SERVER 
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServiceCalculatrice.lunch();
                } catch (CalculatriceException e) {
                	System.out.println(ApplicationProperties.readProperty(ExceptionEnum.getNameFromCode((e.getCode())), e.getDefaultMessage()));
                }catch(ClassNotFoundException | IOException e ) {
                	System.out.println(e.getMessage());
                }

            }
        }).start();
        try {
            while(true) {
                view.afficher();
            }
        } catch (ClassNotFoundException | IOException | InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}