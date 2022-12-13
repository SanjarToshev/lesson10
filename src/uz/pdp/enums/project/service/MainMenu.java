package uz.pdp.enums.project.service;

import uz.pdp.enums.project.model.User;

import java.math.BigDecimal;
import java.util.Scanner;

import static uz.pdp.enums.project.Storage.users;

public class MainMenu {


    public static void start() {
        System.out.println("Welcome to magazin");
        User admin = new User("Adminbek", BigDecimal.ZERO, "admin");
        users.add(admin);

        while (true) {
            System.out.println("1 - Kirish, 2 - Royxatdan o'tish, 0 - Chiqish");
            Scanner scanner =  new Scanner(System.in);
            int command = scanner.nextInt();
            if (command == 1) {
                // login metod
                User user = LoginService.signIn();
                if (user == null) {
                    // agar null kelsa login xato
                    System.out.println("Login xato");
                } else {
                    // null bolmasa yoki admin, yoki oddiy user
                    if (user.getLogin().equals("admin")) {
                        // admin part
                        AdminService.openAdminConsole(user);
                    } else {
                        // user part

                    }
                }
            } else if (command == 2) {
                LoginService.signUp();
            } else if (command == 0) {
                break;
            } else {
                System.out.println("Xato buyruq kiritildli");
            }

        }




    }
}
