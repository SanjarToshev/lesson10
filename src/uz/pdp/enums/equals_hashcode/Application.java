package uz.pdp.enums.equals_hashcode;

public class Application {

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        String text = "text";
        String text1 = "text";
        String text2 = new String("text");

        System.out.println(a==b);

        System.out.println(text==text1);
        System.out.println(text==text2);

        System.out.println("============");
        Person ali = new Person("Ali", 30);
        Person vali = new Person("Ali", 30);
        System.out.println(ali==vali);
        System.out.println(ali==ali);

        System.out.println(ali.equals(vali));

        System.out.println(ali.equals(vali));

        System.out.println(ali.equals(null));


        System.out.println("Hash code");
        int i = ali.hashCode();
        System.out.println(i);
        System.out.println(vali.hashCode());

        User user = new User("90123456789", "MYusername", "bio",  Status.ONLINE);


    }

}
