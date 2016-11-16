import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int cities;

        System.out.println("Podaj ilosc punktow:");
        cities = reader.nextInt();

        CitiesCoordinates citiesCoordinates = new CitiesCoordinates(cities);


        //Oznacza miasto startowe

        System.out.println("Podaj miasto startowe:");




    }
}
