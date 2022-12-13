package uz.pdp.enums.project.service;

import uz.pdp.enums.project.model.User;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static uz.pdp.enums.project.Storage.users;

public class LoginService {


    public static User signIn() {
        System.out.print("Loginni kiriting: ");
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public static void signUp() {
        while (true) {
            System.out.println("Isminggizni kiriting: ");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            System.out.println("Loginni kiriting: ");
            String login = scanner.nextLine();
            if (isExist(login)) {
                System.out.println("Bu user oldin royxatdan otgan");
            } else {
                User newUser = new User(name, BigDecimal.valueOf(100000), login);
                users.add(newUser);
                System.out.println("Muvaffaqiayatli royxatdan otdingiz");
                break;
            }
        }
    }

    private static boolean isExist(String login) {
        Predicate<User> loginPredicate = user -> user.getLogin().equals(login);
        Stream<User> stream = users.stream();
        User user = stream
                .filter(loginPredicate)
                .findFirst().orElse(null);
        return user != null;
    }
}
