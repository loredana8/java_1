package lab2.AnimalRescue;

import java.sql.SQLOutput;

public class AppMain {

    public static void main(String[] args) {
        Dog maya = new Dog();
        System.out.println(maya.color);
        maya.eat();
        maya.play();
        maya.age = 8;
        maya.name = "Lili";

        System.out.println("Pe cainele acesta il cheama " + (maya.name) + " si are " + ( maya.age) + " ani ");


        Girl ana = new Girl();
        ana.name = "Ana";
        ana.age = 20;
        ana.eyes ="blue";

        System.out.println((maya.name) + " a fost adoptata de catre " + (ana.name));
        System.out.println((ana.name) +" are " + (ana.age) + " de ani, este blonda si are ochii " + (ana.eyes));




    }

}
