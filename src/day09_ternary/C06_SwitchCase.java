package day09_ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin
        hafta ici veya hafta sonu oldugunu yazdirin.
         */

        String input="Cumartesi";
        input=input.toLowerCase();

        switch (input) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz");

        }
    }
}
