package User;

public class User {
    private String firstName;
    private String lastName;
    private Integer age;
    private Integer accountNumber;
    private double balance;
    //Так же добавить статус типа (Bronze,Gold,Platinum)

    public User(String firstName, String lastName, Integer age, Integer accountNumber, double balance) {
        //Инициализация переменных
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposite(double amount) {
        //Метод дающий депозит
        if (amount > 0) {
            balance += amount;
            System.out.println("Sucsess!");
            System.out.println("You deposit " + amount + "$ on your balance");
        } else {
            System.out.println("Failure!");
            System.out.println("Invalid amount");
        }
    }


    //Осуществить вывод с комиссией
    public void withdraw(double amount) {
        //Метод позволяющий выводить средства
        if (amount > 0) {
            balance -= amount;
            System.out.println("Sucsess!");
            System.out.println("You withdraw " + amount + "$ from your balance");
        } else {
            System.out.println("Failure!");
            System.out.println("Invalid amount");
        }
    }
    //Реализовать передачу денег на другой аккаунт

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void displayInfo() {
        System.out.println("Firstname: " + firstName);
        System.out.println("Lastname: " + lastName);
        System.out.println("Age: " + age);
    }


}



