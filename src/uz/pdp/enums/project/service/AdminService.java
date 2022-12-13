package uz.pdp.enums.project.service;

import uz.pdp.enums.project.model.User;

import java.util.Scanner;

public class AdminService {

    public static void openAdminConsole(User user) {
        System.out.println("Xush kelibsiz " + user.getName());
        while (true) {
            System.out.println("1 - Magazin qoshish, 2 - Mahsulotlar qoshish, 3 - Magazinga mahsulotlar qoshish, 4 - Savdolar tarixi, 0 - Chiqish");
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i == 1) {
                ShopService.addShop();
            } else if (i == 2) {
                ProductService.addProduct();
            } else if (i == 3) {
                ShopService.addProductsToShop();
            } else if (i == 4) {
                OrderService.showOrderHistory();
            } else if (i == 0) {
                break;
            } else {
                System.out.println("Xato buyruq kiritildi!");
            }
        }
    }
}
