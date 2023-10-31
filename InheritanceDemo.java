package assistedpracticeproject;
//Interface 1
interface Swimmer {
 void swim();
}

//Interface 2
interface Flyer {
 void fly();
}

//Class implementing both interfaces
class Duck implements Swimmer, Flyer {
 public void swim() {
     System.out.println("Duck can swim.");
 }

 public void fly() {
     System.out.println("Duck can fly.");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {
     Duck myDuck = new Duck();
     myDuck.swim();
     myDuck.fly();
 }

}
