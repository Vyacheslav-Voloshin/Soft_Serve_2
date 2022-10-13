package Java_kurs.HomeWork2;

public class Lynx extends Animal{
    private String name;
    final private String color = "Orange";

    public Lynx(String name){
        this.name = name;
    }
    public Lynx(String name, String color) {
        this.name = name;
    }
    public Lynx() {
    }

    public  String getName() {
        return name;
    }
    public void setName(String value){
        name = value;
    }
    public String getColor(){
        return color;
    }
    public void sayHello(){
        System.out.println("Hello, I am an animal of class "+ getClass().getSimpleName()+ ". My name is "+ getName()+", my color "+ color);
    }

    @Override
    public void say() {
        System.out.println("Shhhh");
    }
    final void numberLegs (){
        System.out.println("Usually " + getClass().getSimpleName()+" have four legs");
    }
}
