package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //Object Nasıl oluşturulru?
        //1)Class ismini yazınız          2)Objeye bir isim veriniz   3)=      4)new keywordunu kullan        5)Class ismi parantezle beraber(Constructor)
                 Car                                myHonda            =               new                                  Car();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda

        myHonda.hareketEt();
        myHonda.dur();

        MethodCreations obj= new MethodCreations();
    }


    public void hareketEt() {
        System.out.println("Honda güzel hareket eder...");
    }

    public void dur() {
        System.out.println("Honda güvenli durur...");
    }


    }