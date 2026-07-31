// // class Student {
//     // properties


//     // Student(){  // no-arg constructor
//     //     name ="unknown";
//     //     age = 0;

//     //     System.out.println("we are calling constructor");

//     // }
//     // String course;

//     // method
//     // void study(){
//     //     System.out.println("This student is studying");
//     // }
    
//     // String name;
//     // int age;

// //     Student(String name1, int age1){ // parameter
// //         this.name = name1;
// //         this.age = age1;
        

// //     }

   
// //     void info(){
// //         System.out.println(name);
// //         System.out.println(age);
// //         // System.out.println(course);
// //     }
// // }

// // Inheritance

// class Animal {
//     String name;

//     Animal(String name){  // constructor
//         this.name = name;
//         System.out.println("Animal constructor");
//     }

//     void eat(){
//         System.out.println(name + " is eating");
//     }

//     void sleep(){
//         System.out.println(name + " is sleeping");
//     }
// }

// class Dog extends Animal {

//     Dog(String name, String breed){
//          super(name);
//         System.out.println("Dog constructor");
           
       
//     }
//     void bark(){
//         System.out.println("Dog is barking");
//     }
// }

// public class OOPSLecture {
//     public static void main(String[] args) {

//         // Dog d1 = new Dog();
//         // d1.name = "Tommy";
//         // d1.eat();
//         // d1.sleep();
//         // d1.bark();

//         // Student s1 = new Student();  // default constructor
//         // Student s1 = new Student("Aman", 21);
//         //     s1.info();
//         // System.out.println(s1.name);
//         // System.out.println(s1.age);
//         // Student s2 = s1;
//         // s1.name= "Aman";
//         // s1.age= 21;
//         // s1.course = "Java";

//         // s1.study();
//         // s1.info();
    


//         System.out.println("Main mathod");
//     }
    
// }


// class Animal {
//     String name;

    
//     void eat(){
//         System.out.println(name + " is eating");
//     }

//     void sleep(){
//         System.out.println(name + " is sleeping");
//     }
// }

// class Dog extends Animal {

   
//     void bark(){
//         System.out.println("Dog is barking");
//     }
// }

// class Cat extends Animal {

//     void meow(){
//         System.out.println("cat is meowing");
//     }
// }


// Tight coupling
// class Engine {
//     void start(){
//         System.out.println("engine started");
//     }
// }


// class ElecticEngine {
//     void start(){

//     }
// }
// class Car {
//     // Car is directly dependent on Engine
//     Engine e1 = new Engine();

//     void startCar(){
//         e1.start();

//         System.out.println("CAr started");
//     }

// }

// class petrolEngine {

// }

// class ElectricEngine {

// }

// class Car {
    
// }


// encapsulation
// final class Student {
//     String name;
//   int marks;  // beacause it is directly accessible

//     public void setMarks(int marks){  // setter method
//      if(marks >=0 && marks <=100){
//         this.marks=marks;
//      }else {
//         System.out.println("Invalid marks");
//      }

//     }
        

// }
// public int getMarks(){    // getter method
//     return marks;
// }

// }

// class BankAccount {
//     private double balance;

//     public void deposit(double amount){
//         balance +=amount;
//         System.out.println(balance);
//     }
//     public void withdraw(double amount){
//         if(amount <=balance){
//             balance -= amount;
//             System.out.println(balance);
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

public class OOPSLecture {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.startCar();

        // Student s1 = new Student();
        // s1.name = "Aisha";
        // // s1.marks = 50000;  
        // s1.setMarks(100000);

        // System.out.println(s1.name);
        // System.out.println(s1.marks);
        // BankAccount b1 = new BankAccount();
        // // b1.balance = 150;
        // b1.deposit(1000);
        // System.out.println("Current Balance "+ b1.getBalance());

        // b1.withdraw(500);
        // System.out.println("Current balance "+ b1.getBalance());


    }
}
