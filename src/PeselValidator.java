import java.util.Scanner;

public class PeselValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz Pesel");
        Long wprowadzPesel = scanner.nextLong();

        int[] pesel = {9,0,0,2,2,7,6,8,1,1,3};
        int[] mnoznik = {1,3,7,9,1,3,7,9,1,3};
        int suma = 0;

        //zaincicjowanie numerów PESEL
        for(int i=0; i < mnoznik.length; i++ ){
            int mnozenie = mnoznik[i]*pesel[i];
            if (mnozenie>=10){
                suma = suma + (mnozenie%10); // powyzej 9
            }else {
                suma= suma + mnozenie;
            }
        }
        if (suma>=10){
            suma = (suma%10); // powyzej 9
        }
        int sumaKontrolna = 10- suma;
        if(sumaKontrolna ==pesel[10]){
            System.out.println("Pesel Poprawny");
        }else {
            System.out.println("Pesel Niepoprawny");
        }

    }
}
