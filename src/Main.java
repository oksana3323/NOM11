import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account();
        account1.balance = 200;
        account1.name = "oksana";
        Account account2 = new Account();
        account2.balance = 1000

        ;
        account2.name = "aika";
        Account account3 = new Account();
        account3.balance = 250;
        account3.name = "kanykey";

        Account [] accounts = {account1,account2,account3};
        while (true){

        System.out.println("""
                1 karyz
                2 get all
                3 beruu
                """);
        switch (scanner.nextInt()) {
            case 1:
                String d = scanner.nextLine();
                System.out.println("kim alat");
                String name = scanner.nextLine();
                for (Account account : accounts) {
                    if (account.name.equalsIgnoreCase(name)) {
                        System.out.println(" price");
                        account.withdrawal(scanner.nextInt());
                    }
                }
                break;
            case 2:
                for (Account account:accounts){
                    System.out.println(account.getInfo());
                }
                break;
            case 3:
                String d3 = scanner.nextLine();
                System.out.println("kim alat");
                String namew = scanner.nextLine();
                for (Account account : accounts) {
                    if (account.name.equalsIgnoreCase(namew)) {
                        System.out.println(" price");
                        account.deposit(scanner.nextInt());
                    }
                }
                break;

        }


        }






    }
}