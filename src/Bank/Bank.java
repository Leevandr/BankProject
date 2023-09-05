package Bank;

import Exceptions.InvalidAccountNumberException;
import Exceptions.UserAccountNotNull;
import User.User;


import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> users;

    public Bank() {
        users = new ArrayList<>();
    }

    public void displayAllUsers(){
        System.out.println("List of all users:");
        for (User user : users) {
            user.displayInfo();
            System.out.println("--------------");
        }

    }

    public void addUser(User user) throws UserAccountNotNull {
        if (user == null) {
            throw new UserAccountNotNull("Имя не должно быть пустым!");
        }else {
            users.add(user);
        }
    }

    public void deposit(int accountNumber, double amount) throws InvalidAccountNumberException {
        boolean accountFound = false;
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.deposite(amount);
                System.out.println("Deposited " + amount + " $ on " + accountNumber + " success!");
                accountFound = true;
                break;
            }
        }
        if (!accountFound) {
            System.out.println("Account number " + accountNumber + " not found!");
            throw new InvalidAccountNumberException("Account not found");
        }
    }


    public void withdraw(int accountNumber, double amount) throws InvalidAccountNumberException {
        boolean accountFound = false;
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.withdraw(amount);
                System.out.println("Withdraw " + amount + " $ from " + accountNumber);
                accountFound = true;
                break;

            }
        }
            if (!accountFound) {
                System.out.println("Account number " + accountNumber + " not found!");
                throw new InvalidAccountNumberException("Account not found");
            }
        }

    public void displayUserInfo(int accountNumber) throws InvalidAccountNumberException {
        for (User user : users) {
            if (user.getAccountNumber() == accountNumber) {
                user.displayInfo();
                return;
            }
        }
        System.out.println("User not found!");
    }


}
