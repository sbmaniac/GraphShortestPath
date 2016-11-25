import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Punkt2D startingPoint ;
        int x,y;

        int cities;

       /* System.out.println("Podaj ilosc punktow:");
        cities = reader.nextInt();*/    // automatyczna lista punktow
        cities = 5;
        CitiesCoordinates citiesCoordinates = new CitiesCoordinates(cities);


        //Oznacza miasto startowe

        System.out.println("Podaj miasto startowe:");
        x = reader.nextInt();
        y = reader.nextInt();
        startingPoint = new Punkt2D(x,y);

        NearestNeighbour nearestNeighbour = new NearestNeighbour(citiesCoordinates.getCitiesCoordinatesArray(),startingPoint);




    }
}
