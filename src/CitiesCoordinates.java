/**
 * Created by sbmaniac on 16.11.2016.
 */
public class CitiesCoordinates {

    Punkt2D[] citiesCoordinatesArray;

    public CitiesCoordinates(int cities) {
        citiesCoordinatesArray = new Punkt2D[cities];

        citiesCoordinatesArray[0] = new Punkt2D(1, 1);
        citiesCoordinatesArray[1] = new Punkt2D(3, 1);
        citiesCoordinatesArray[2] = new Punkt2D(5, 3);
        citiesCoordinatesArray[3] = new Punkt2D(3, 7);
        citiesCoordinatesArray[4] = new Punkt2D(1, 8);

        /*for(int i=0;i<citiesCoordinatesArray.length;i++){
            System.out.println("Podaj wspolrzedne punktu "+i);
            int tempX = reader.nextInt();
            int tempY = reader.nextInt();

            citiesCoordinatesArray[i] = new Punkt2D(tempX,tempY);
        }*/
    }
}
