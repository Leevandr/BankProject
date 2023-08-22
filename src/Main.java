import Bank.Bank;
import User.User;

public class Main {


    public static void main(String[] args) {
        Bank bank = new Bank();

        User user1 = new User("Poal", "Smith", 32, 14322,643.0);
        User user2 = new User("Alice", "Smith", 25, 67890, 1500.0);


        bank.addUser(user1);
        bank.addUser(user2);

        bank.deposit(14322, 70.0);
        bank.withdraw(14322, 23.4);


        bank.displayUserInfo(14322);

    }


}