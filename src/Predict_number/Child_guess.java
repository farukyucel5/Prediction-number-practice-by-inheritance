package Predict_number;

import java.util.Scanner;

public class Child_guess extends Guess_number {

    public static void main(String[] args) {

        Child_guess obj=new Child_guess();
        int the_number_picked=obj.getPick();

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 1 ile 10 arasında bir sayı tahmin edin: ");

        int guess=scan.nextInt();

        int result=obj.guess_number(guess);


        if (result==0)
            System.out.println("tebrikler: tahmin ettiğim sayı: "+the_number_picked);

        else if (result==1)
            System.out.println("aklımda tumtuğım sayıdan küçük,tahmin ettiğim sayı : "+the_number_picked);

        else
            System.out.println("aklımda tumtuğım sayıdan büyük,tahmin ettiğim sayı: "+the_number_picked);

    }
}
