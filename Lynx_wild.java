package Java_kurs.HomeWork2;
//наслідуючий клас Lynx_wild

public class Lynx_wild extends Lynx{
    private String name;

    public  Lynx_wild (String name){
        this.name = name;
    }

    public Lynx_wild(String name,String color) {
        super(color);
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
