package ru.stqa.pft.sandbox;

public class MyFirstProject {

    public static void main(String[] args) {
        hello("world");
        hello("user");


        Square s= new Square(5.0);
        System.out.println("Площадь квадрата со стороной "+ s.l + " = " +s.area()) ;


        Rectangle r= new Rectangle(5.0,7.0);
        System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и " + r.b + " = " +r. area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello," + somebody + "!");
    }



}


