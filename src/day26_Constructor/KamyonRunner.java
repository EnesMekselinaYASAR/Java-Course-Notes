package day26_Constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1=new Kamyon();
        System.out.println("kamyon1 ozellikleri :"+kamyon1.toString());

        Kamyon kamyon2=new Kamyon("merecedes","4140",2005,50000);
        System.out.println("kamyon2 ozellikleri :"+kamyon2.toString());

        Kamyon kamyon3 = new Kamyon("MAN", "as900", 2007, 400000);
        System.out.println("kamyon 3 ozellikleri " + kamyon3);

        Kamyon kamyon4 = new Kamyon("Scania","S540");
        System.out.println("kamyon 4 ozellikleri " + kamyon4);






    }
}
