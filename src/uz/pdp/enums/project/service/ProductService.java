package uz.pdp.enums.project.service;

import uz.pdp.enums.project.Storage;
import uz.pdp.enums.project.model.Measurement;
import uz.pdp.enums.project.model.Product;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProductService {

    public static void addProduct() {
        while (true) {
            System.out.print("Mahsulot qoshish uchun nomini kiriting: ");
            Scanner scanner = new Scanner(System.in);
            String kiritilganMahsulot = scanner.nextLine();
            if (isExist(kiritilganMahsulot)) {
                System.out.println("Bu nomli mahsulot bor!");
            } else {
                System.out.println("Olchov birligini kiriting: ");
                System.out.println("1-kg,  2-dona");
                scanner = new Scanner(System.in);
                String command = scanner.nextLine();
                System.out.print("Narxini kiriting: ");
                scanner = new Scanner(System.in);
                double kiritilganNarx = scanner.nextDouble();
                BigDecimal bigDecimal = BigDecimal.valueOf(kiritilganNarx);
                if (command.equals("1") || command.equals("2")) {
                    Product product = new Product(kiritilganMahsulot, command.equals("1") ? Measurement.KG : Measurement.PIECE, bigDecimal);
                    Storage.products.add(product);
                    break;
                } else {
                    System.out.println("Xato buyruq!!!");
                }
            }
        }
    }



    public static boolean isExist(String kiritilganMahsulot){
        for (Product product : Storage.products) {
            if (product.getName().equals(kiritilganMahsulot)){
                return true;
            }
        }
        return false;
    }

    public static Product getProductForShop(){
        showProduct();
        while (true) {
            System.out.print("Mahsulot idisini kiriting: ");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            if (Storage.products.size() > command && command > 0) {
                return Storage.products.get(command-1);

            } else {
                System.out.println("Xato buyrug!!!");
            }
        }
    }

    public static void showProduct(){

        for (int i = 0; i < Storage.products.size(); i++) {
            System.out.println("Mahsulot id si: " + (i+1));
            System.out.println("Mahsulot nomi: " + Storage.products.get(i).getName());
            System.out.println("Mahsulot olchovi: " + Storage.products.get(i).getMeasurement().getUzbVersion());
            System.out.println("Mahsulot narxi: " + Storage.products.get(i).getPrice());
            System.out.println("**************************************");
        }

    }
}
