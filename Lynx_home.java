package Java_kurs.HomeWork2;
//наслідуючий клас Lynx_home
public class Lynx_home extends Lynx{
    private String name;
    public  Lynx_home (String name){
        this.name = name;
    }
    public Lynx_home(String name, String color){
        super (color);
        this.name = name;
    }
    @Override
    public String getName(){
       return name;
    }

    public void setName(){
        this.name = name;
    }
}
