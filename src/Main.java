import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int cities;
        float[][] filledDistanceArray;


        // Wczytuje ilosc miast
        System.out.println("Podaj ilosc punktow:");
        cities = reader.nextInt();

        Punkt2D[] citiesCoordinatesArray = new Punkt2D[cities];

        //TODO Rozpoczyna uzupelnianie wspolrzednych grafu

        citiesCoordinatesArray[0] = new Punkt2D(1,1);
        citiesCoordinatesArray[1] = new Punkt2D(3,1);
        citiesCoordinatesArray[2] = new Punkt2D(5,3);
        citiesCoordinatesArray[3] = new Punkt2D(3,7);
        citiesCoordinatesArray[4] = new Punkt2D(1,8);

        /*for(int i=0;i<citiesCoordinatesArray.length;i++){
            System.out.println("Podaj wspolrzedne punktu "+i);
            int tempX = reader.nextInt();
            int tempY = reader.nextInt();

            citiesCoordinatesArray[i] = new Punkt2D(tempX,tempY);
        }*/



        //Tworzy tabele odleglosci
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        filledDistanceArray=distanceCalculator.fillDistanceTab(citiesCoordinatesArray);


        // Wypisuje tabele odleglosci

        for (int i = 0; i<filledDistanceArray.length;i++){
            System.out.println();
            System.out.println("|");
            for(int j =0; j<filledDistanceArray[i].length;j++) {
                System.out.print(filledDistanceArray[i][j]+"|");
            }
        }

        //Oznacza miasto startowe

        System.out.println("Podaj miasto startowe:");






    }
}
