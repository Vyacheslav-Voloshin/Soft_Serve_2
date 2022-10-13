package Java_kurs.HomeWork2;
// Створюємо три обєкти, які показують,
// що вони виконують попередні задачі



public class Main {

        public static void main(String[] args){
           Lynx lynx = new Lynx("Barsik");
           lynx.sayHello();
           lynx.say();
           lynx.numberLegs();

           Lynx lh = new Lynx_home("Tuzik");
           lh.sayHello();
           lh.say();
           lh.numberLegs();

           Lynx lw = new Lynx_wild("Myrchik");
           lw.sayHello();
           lw.say();
           lw.numberLegs();

        }

    }