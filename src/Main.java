import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi,mukemmelSayi=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayi Gir: ");

        sayi=sc.nextInt();
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                mukemmelSayi+=i;

            }

        }
        if (sayi==mukemmelSayi){
            System.out.println(" Mukemmel sayidir: "+ mukemmelSayi);
        }else{
            System.out.println(sayi+" Mukemmel sayi degil");
        }
    }
}