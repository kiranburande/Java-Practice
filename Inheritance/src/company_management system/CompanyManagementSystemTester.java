package com.practice;

class Employee
{
    String name;
     int id;

    public Employee(String name, int id)
    {
        super();
        this.name = name;
        this.id = id;
    }
    public void  displayInfo()
    {
        System.out.println("Name :"+this.name);
        System.out.println("Id :"+this.id);
    }
     
}

class Manager extends Employee
{
    private String department;
    public Manager(String name, int id, String department)
    {
        super(name,id);
        this.department = department;
    }
    void manageTeam()
    {
         System.out.println("Name :"+super.name);
         System.out.println("Department :"+this.department);
    }
}

class SeniorManager extends Manager
{
    int numTeams;
    public SeniorManager(String name, int id,String department, int numTeams)
    {
        super(name,id,department);
        this.numTeams = numTeams;
    }
    void handleMultipleTeams()
    {
         System.out.println("Number of teams :"+this.numTeams);
    }
}

public class CompanyManagementSystemTester

{
    public static void main(String [] args)
    {
         SeniorManager seniorManager = new SeniorManager("John",1002,"HR Department",3); 

         seniorManager.displayInfo();
         seniorManager.manageTeam();
         seniorManager.handleMultipleTeams();

    }
}



/* OnlineShoppingSystemTester
Problem: Online Shopping System

You are building an Online Shopping System, and you need to create a class hierarchy to represent different types of products that customers can purchase. You will be implementing a set of classes that model the products and their attributes. The focus of this problem is to demonstrate the use of inheritance and method overriding in Java.

Follow the provided code as a base, and create the necessary classes to satisfy the requirements below:

  Create a class named Product:

    It should have protected instance variables name (String) and price (double).
    Implement a constructor that initializes the name and price.
    Define a method displayInfo() that prints the product's name and price.
    Define a method calculateTotalCost(int quantity) that calculates and returns the total cost of purchasing a given quantity of the product.

  Create a subclass named Electronics:
    Extend the Product class.

    Add a private instance variable brand (String).
    Implement a constructor that takes name, price, and brand as parameters and initializes the superclass constructor.
    Define a method displayInfo() method to additionally print the product's brand.

  Create another subclass named Clothing:
    Extend the Product class.

    Add a private instance variable size (String).
    Implement a constructor that takes name, price, and size as parameters and initializes the superclass constructor.
    Define a method displayInfo() method to additionally print the product's size.

  Create a class named OnlineShoppingSystemTester (as provided in the code):

    In the main method, create instances of both Electronics and Clothing with appropriate values.
    Print information about each product, including their specific attributes.
    Calculate and print the total cost for a given quantity of each product.

Your task is to implement the required classes based on the provided problem description. This will help you practice inheritance concepts. */