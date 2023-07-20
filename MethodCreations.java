package day02methodcreation;

public class MethodCreations {

    public static void main(String[] args) {


        System.out.println(ucSayiyiCarp(2, 1.5, 6));

        System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));



    }


    //Example 2: Uc sayıyı birbiri ile carpan bir method oluşturunuz
    public static double ucSayiyiCarp(double a, double b, double c) {

        return a * b * c;
    }

    //Example 3 : üc sayıdan ilk ikisini toplayıp ucuncu ile carpan method olusturp sonucu ekran yazdır.

    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c) {

        return (a + b) * c;
    }
}