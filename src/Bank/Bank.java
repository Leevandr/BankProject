package Bank;

import User.User;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> users;

    public Bank(){
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void deposit(int accountNumber, double amount){
        for (User user : users){
            if (user.getAccountNumber() == accountNumber){
                user.deposite(amount);
                System.out.println("Deposited " + amount + " $ on " + accountNumber + " sucsess!");

            }
            System.out.println("Deposited " + amount + " $ on " + accountNumber + " failure!");
            System.out.println("Not found Account Number!");
        }
    }



}
