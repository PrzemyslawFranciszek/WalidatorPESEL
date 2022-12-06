import java.util.Scanner;

public class PeselValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz Pesel");
        Long wprowadzPesel = scanner.nextLong();
        long[] pesel = {wprowadzPesel/10000000000l ,wprowadzPesel/1000000000l,wprowadzPesel/100000000l,wprowadzPesel/10000000l,wprowadzPesel/1000000l
                ,wprowadzPesel/100000l,wprowadzPesel/10000l,wprowadzPesel/1000l,wprowadzPesel/100l,wprowadzPesel/10l,wprowadzPesel%10};
        System.out.println(pesel);
        long[] mnoznik = {1,3,7,9,1,3,7,9,1,3};
        long suma = 0;

        //zaincicjowanie numerów PESEL
        for(int i=0; i < mnoznik.length; i++ ){
            long mnozenie = mnoznik[i]*pesel[i];
            if (mnozenie>=10){
                suma = suma + (mnozenie%10); // powyzej 9
            }else {
                suma= suma + mnozenie;
            }
        }
        if (suma>=10){
            suma = (suma%10); // powyzej 9
        }
        long sumaKontrolna = 10- suma;
        if(sumaKontrolna ==pesel[10]){
            System.out.println("Pesel Poprawny");
        }else {
            System.out.println("Pesel Niepoprawny");
        }

    }
}
