package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Mina äventyr med Java", "Alex Weström");
        myBook.getInfo();

        Car myCar = new Car("Qashqai", "Nissan", 2011);
        myCar.getVehicle();

        Animal myPet = new Dog();
        myPet.makeSound();

        Employee emp = new Employee("Kalle", 30000);
        Employee mgr = new Manager("Lena", 40000);

        emp.calculateBonus();
        mgr.calculateBonus();

        System.out.println("Kalles bonus: " + emp.calculateBonus());
        System.out.println("Lenas bonus: " +  mgr.calculateBonus());

        Calculator calculator = new Calculator();

        System.out.println("Resultate av 4.5 plus 3.2 är ");
        calculator.add(4.5, 3.2);

        int result = calculator.subtract(7, 5);
        System.out.println("Resultatet av 7 minus 2 är " + result);
    }
}