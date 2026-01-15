package Inheritance.Hierarchical_Inheritance;

public class Dogs_ extends Animals_ {
    public String breed;

    @Override  // this is known as anotations which is a good practice , but it will give us error if we use false anotations..
    public void sayHello(){  // this is known as method overriding...
        System.out.println("woof");
    }

    public void sayBye(){
        System.out.println("woof woof");
    }
}
