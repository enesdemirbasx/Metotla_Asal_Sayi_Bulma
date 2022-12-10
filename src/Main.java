import java.util.Scanner;
public class Main {
    static void asal(int a) {
            int i = 2;
            boolean asal = true;
            do {
                if (a % i == 0) {
                    System.out.println(a + " Asal sayı değildir.");
                    asal = false;
                    break;
                }
                i++;
            } while (i != (a - 1));
            if (asal == true) {
                System.out.println(a + " Asal sayıdır.");
            }
        }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int asal;
        System.out.println("ASAL SAYI BULAN PROGRAM");
        System.out.println("Programı kapatmak için 0 giriniz!!!");
        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            asal=inp.nextInt();
            if (asal==0){
                System.out.println("Sıfır asal sayı değildir.");
            }else {
                asal(asal);
            }
        }while(asal!=0);
        System.out.println("Bizi seçtiğiniz için teşekkürler :)");
    }
}