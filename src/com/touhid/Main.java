package com.touhid;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("commodore");
        System.out.println("Model is:  " + porsche.getModel());

        Account bobsAccount = new Account(); //("12345", 0.0, "Bob Brown", "myemailR@bob.com", "(087)123-4567");
        // Accessing the constructor method
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        // Another object
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@gmail.com");
        System.out.println(person3.getName());
    }
}