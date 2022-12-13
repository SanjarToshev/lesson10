package uz.pdp.enums.project.service;

import uz.pdp.enums.project.Storage;
import uz.pdp.enums.project.model.Product;
import uz.pdp.enums.project.model.Shop;
import uz.pdp.enums.project.model.ShopProduct;

import java.util.Scanner;

public class ShopService {

    public static void addShop() {
        System.out.println("Magazin qo'shish");
        while (true) {
            System.out.println("Magazin nomini kiriting: ");
            Scanner scanner = new Scanner(System.in);
            String shopName = scanner.nextLine();
            if (isExist(shopName)) {
                System.out.println("Bunday nomli magazin bor");
            } else {
                System.out.println("Manzilini kiriting: ");
                String address = scanner.nextLine();
                Shop shop = new Shop(address, shopName);
                Storage.shops.add(shop);
                break;
            }
        }



    }

    public static void addProductsToShop() {
        if (Storage.shops.size() > 0) {
            System.out.println("Magazinlar royxati!!!");
            for (int i = 0; i < Storage.shops.size(); i++) {
                System.out.println("Tartib raqami: " + (i+1));
                System.out.println("Magazin nomi: " + Storage.shops.get(i).getName());
                System.out.println("Magazin address: " + Storage.shops.get(i).getAddress());
                System.out.println("**********************");
            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("Magazin tartib raqamini kiriting: ");
            int command = scanner.nextInt();
            if (command < Storage.shops.size() && command > 0){
                Shop shop = Storage.shops.get(command - 1);
                Product productForShop = ProductService.getProductForShop();
                System.out.print("Miqdorini kiriting: ");
                scanner = new Scanner(System.in);
                double kiritilganMiqdor = scanner.nextDouble();


                // oldin bu produkt magazinga qoshilganmidi
                ShopProduct shopProduct = null;
                int shopProductIndex = -1;
                for (int i = 0; i < Storage.shopProducts.size(); i++) {
                    if (Storage.shopProducts.get(i).getShop().getName().equals(shop.getName())
                            && Storage.shopProducts.get(i).getProduct().getName().equals(productForShop.getName())) {
                        shopProduct = Storage.shopProducts.get(i);
                        shopProductIndex = i;
                        break;
                    }
                }
                if (shopProduct != null) {
                    shopProduct.setQuantity(shopProduct.getQuantity() + kiritilganMiqdor);
                    Storage.shopProducts.add(shopProductIndex, shopProduct);

                } else {
                    shopProduct = new ShopProduct(shop, productForShop, kiritilganMiqdor);
                    Storage.shopProducts.add(shopProduct);
                }

            }
            else {
                System.out.println("Xato tartib raqam!");
            }


        }
        else {
            System.out.println("Magazin kiritilmagan!");
        }
    }

    public static boolean isExist(String shopName) {
        for (Shop shop : Storage.shops) {
            if (shop.getName().equals(shopName)) {
                return true;
            }
        }
        return false;
    }

}
