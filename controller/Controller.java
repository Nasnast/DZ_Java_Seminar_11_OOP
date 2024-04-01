package DZ.controller;

import DZ.Service.DataService;
import DZ.data.User;

public class Controller {
    private DataService dataService = new DataService();

    public void createUser(User user, String type) {
        dataService.createUser(user, type);
    }

    public void read(String type) {
        System.out.println(dataService.read(type));
    }

}
