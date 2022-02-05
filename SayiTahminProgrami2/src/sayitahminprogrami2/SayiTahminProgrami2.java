package sayitahminprogrami2;

import java.util.Scanner;
import java.util.Random;
public class SayiTahminProgrami2 {
 
public static void main(String[] args) {
Scanner girdi = new Scanner(System.in); // scanner tanimlama
    Random rand = new Random(); // random tanimlama
    int rastgeleSayi = 0;
    int ustLimit = 100;
    int altLimit = 1;
    String cevap = "";
 
    do {
        rastgeleSayi = rand.nextInt(ustLimit - altLimit + 1) + altLimit;
        System.out.println("Eger tahminim tuttugun sayidan kucuksa 'k' buyukse 'b' cevap dogruysa 'd' yaziniz");
        System.out.println("Tuttugunuz sayi " + rastgeleSayi+ " mi?");
        cevap = girdi.nextLine();   
 
        if(cevap.equals("k")) {  //eger dusukse
            altLimit = rastgeleSayi + 1;
        } 
        else if(cevap.equals("b")) { //eger yuksekse
            ustLimit = rastgeleSayi - 1;
        }   
    }while(!cevap.equals("d"));
 
    girdi.close();
    System.out.println("ben kazandım :)");
}
}

