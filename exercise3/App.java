

import cat.Cat;
import dog.Dog;

public class App {
    public static void main(String[] args) throws Exception{

        Cat myCat = new Cat();
       

        myCat.meow();
        System.out.println("Tail Length:"+ myCat.tailLength);
        System.out.println("Fur Color:" + myCat.furColor);

        Dog myDog = new Dog();

        myDog.bark();
        System.out.println("Dog Size:" + myDog.dogSize);
        System.out.println("Dog Behavior:" + myDog.dogBehavior);
    }
}
