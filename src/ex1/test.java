package ex1;

public class test {
    public static void main(String[] args) {
    Animal[] animals = new Animal[2];
    animals[0]=new Chicken();
    animals[1]=new Tiger();
    for (int i =0; i<animals.length;i++){
        System.out.println(animals[i].makeSound());

    if (animals[i] instanceof  Chicken) {
        Edible a = (Chicken) animals[i];
        System.out.println(a.howToEat());
    }
    }
    }
}
