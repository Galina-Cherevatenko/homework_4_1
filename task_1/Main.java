package homework_4.task_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String typeAnimal, nameAnimal;
    List<Animal> list = new ArrayList<>();
    List<Animal> same = new ArrayList<>();
    do
    {
        System.out.println("Введите тип животного");
        typeAnimal = in.nextLine();
        if (!typeAnimal.equals("Достаточно")){
        System.out.println("Введите имя животного");
        nameAnimal = in.nextLine();
                    switch (typeAnimal) {
                case "корова": Animal cow = new Cow(nameAnimal);
                    list.add(cow);
                    break;
                case "кошка": Animal cat = new Cat(nameAnimal);
                    list.add(cat);
                    break;
                case "собака": Animal dog = new Dog(nameAnimal);
                    list.add(dog);
                    break;
                case "змея": Animal snake = new Snake(nameAnimal);
                    list.add(snake);
                    break;
                    }
        }
    }
        while (!typeAnimal.equals("Достаточно"));

        for (int i = 0; i < list.size(); i++) {
           for (int j = i + 1; j < list.size(); j++) {
              if (list.get(i).tellMeWhoYouName().equals(list.get(j).tellMeWhoYouName())){
                  same.add(list.get(i));
                  same.add(list.get(j));}
            }
        }
        System.out.println("Одинаковые:");
        for(int i = 0; i< same.size(); i++) {
            same.get(i).tellMeWhoYouAre();

        }
    }
}

interface Animal {
    public void tellMeWhoYouAre();
    public String tellMeWhoYouName();
}
class Cow implements Animal{
    String type;
    String name;
    Cow (String name){
       this.type="корова";
       this.name=name;
    }
    public void tellMeWhoYouAre(){
        System.out.println(type+" "+name);
    }
    public String tellMeWhoYouName(){
        return name;
    }

}
class Cat implements Animal{
    String type;
    String name;
    Cat (String name){
        this.type="кошка";
        this.name=name;
    }
    public void tellMeWhoYouAre(){
        System.out.println(type+" "+name);
    }
    public String tellMeWhoYouName(){
        return name;
    }
}
class Dog implements Animal{
    String type;
    String name;
    Dog (String name){
        this.type="собака";
        this.name=name;
    }
    public void tellMeWhoYouAre(){
        System.out.println(type+" "+name);
    }
    public String tellMeWhoYouName(){
        return name;
    }
}
class Snake implements Animal{
    String type;

    String name;
    Snake (String name){
        this.type="змея";
        this.name=name;
    }
    public void tellMeWhoYouAre(){
        System.out.println(type+" "+name);
    }
    public String tellMeWhoYouName(){
        return name;
    }
}