package lab2.AnimalRescue;

public class Dog {
    String name = "Maya";
    String breed = " Labrador ";
    int age = 6;
    String color = "yellow/brwn";
    float weight = 30.2f ;
    int hightInCm = 50;





    public void bark(){
        System.out.println("ham ham");
    }

    public void eat(){
        System.out.println("Eating meat");
    }

    public void sleep(){
        System.out.println("sszzzz");
    }

    public void play(){
        System.out.println("run");
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
