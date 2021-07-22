public class Animal implements Cloneable{

    Animal(){
        System.out.println("default constructor of Animal");
    }

    Animal(String a){
        System.out.println("String constructor of animal");
    }

    void talk(){
        System.out.println("Animal talking");
    }


    public static void main(String[] args) {
//        Animal animal1=new Animal();

        Animal animal2=new Dog();

        animal2.talk();

//        Dog d = (Dog) animal1;
//        d.talk();

//        new Dog("string");

    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("default child");
    }
    Dog(String s){
        System.out.println("String constructor of dog");
    }
    void talk(){
        System.out.println("Dog talking");
    }

}

class Cat extends Animal{

    void talk(){
        System.out.println("Cat talking");
    }

}
