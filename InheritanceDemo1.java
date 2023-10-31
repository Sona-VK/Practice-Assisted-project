package assistedpracticeproject;

//Base class
class Animal {
 void eat() {
     System.out.println("Animal is eating.");
 }
}

//Derived class (inherits from Animal)
class Dog extends Animal {
 void bark() {
     System.out.println("Dog is barking.");
 }
}

public class InheritanceDemo1 {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     myDog.eat();  // Inherited method from Animal class
     myDog.bark(); // Method of Dog class
 }
}


