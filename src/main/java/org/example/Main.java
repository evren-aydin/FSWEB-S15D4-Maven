package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

       // WorkintechList<String> list = new WorkintechList<>();

        //list.add("Banana");
       // list.add("Apple");
       // list.add("Cherry");
       // list.add("Cherry");
       // list.sort();
        //list.set(2,"çilek");
        //list.WorkintechList();

        convertDecimalToBinary(156);

    }
public static boolean checkForPalindrome(String text){
        String cleanText = text.replaceAll("[.,?_ -]","").toLowerCase(Locale.ENGLISH);
    System.out.println(cleanText);
    int length= cleanText.length();
    for(int i=0;i<length/2;i++){
        if(cleanText.charAt(i)!=cleanText.charAt(length-1-i)){
            return false;
        }
        }

    return true;
}
    public static String convertDecimalToBinary(int number){
        // Sayı sıfır olduğunda direkt olarak "0" döneriz
        if (number == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2; // Kalanı bul
            binaryString.append(remainder); // Kalanı ekle
            number /= 2; // Sayıyı ikiye böl
        }

        // StringBuilder kullanarak elde edilen binary string ters sıradadır, bu yüzden ters çevirmeliyiz
        return binaryString.reverse().toString();
    }

}