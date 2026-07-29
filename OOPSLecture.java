// class Student {
    // properties


    // Student(){  // no-arg constructor
    //     name ="unknown";
    //     age = 0;

    //     System.out.println("we are calling constructor");

    // }
    // String course;

    // method
    // void study(){
    //     System.out.println("This student is studying");
    // }
    
    // String name;
    // int age;

//     Student(String name1, int age1){ // parameter
//         this.name = name1;
//         this.age = age1;
        

//     }

   
//     void info(){
//         System.out.println(name);
//         System.out.println(age);
//         // System.out.println(course);
//     }
// }

// Inheritance

class Animal {
    String name;

    Animal(String name){  // constructor
        this.name = name;
        System.out.println("Animal constructor");
    }

    void eat(){
        System.out.println(name + " is eating");
    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

class Dog extends Animal {

    Dog(String name, String breed){
         super(name);
        System.out.println("Dog constructor");
           
       
    }
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class OOPSLecture {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.eat();
        d1.sleep();
        d1.bark();

        // Student s1 = new Student();  // default constructor
        // Student s1 = new Student("Aman", 21);
        //     s1.info();
        // System.out.println(s1.name);
        // System.out.println(s1.age);
        // Student s2 = s1;
        // s1.name= "Aman";
        // s1.age= 21;
        // s1.course = "Java";

        // s1.study();
        // s1.info();
    


        System.out.println("Main mathod");
    }
    
}
