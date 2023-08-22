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
                return;

            }
            System.out.println("Deposited " + amount + " $ on " + accountNumber + " failure!");
            return;
        }
        System.out.println("Not found Account Number!");
    }

    public void withdraw(int accountNumber, double amount){
        for (User user : users){
            if (user.getAccountNumber() == accountNumber){
                user.withdraw(amount);
                System.out.println("Withdraw " + amount + " $ from " + accountNumber + " sucsess!");
                return;

            }
            System.out.println("Withdraw " + amount + " $ from " + accountNumber + " failure!");
            return;
        }
        System.out.println("Not found Account Number!");
    }

    public void displayUserInfo(int accountNumber){
        for (User user : users){
            if (user.getAccountNumber() == accountNumber){
                user.displayInfo();
                return;
            }
        }
        System.out.println("User not found!");
    }



}
