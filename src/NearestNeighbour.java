

/**
 * Created by sbmaniac on 16.11.2016.
 */
public class NearestNeighbour {
    private int startingPointIndex;
    private int actualPointIndex;
    private int visitedPointsCount;
    private Punkt2D startingPoint;
    private Punkt2D[] citiesCoord;
    private DistanceCalculator distanceCalculator;
    private double pathLength;


    public NearestNeighbour(Punkt2D[] citiesCoord, Punkt2D startingPoint){
        this.startingPoint = startingPoint;
        this.citiesCoord = citiesCoord;
        setStartingPoint(citiesCoord);
        this.distanceCalculator = new DistanceCalculator();
        distanceCalculator.fillDistanceArray(citiesCoord);
        this.actualPointIndex = this.startingPointIndex;
        visitedPointsCount = 1;
        pathLength = 0;

        System.out.println("Stage ready");
        System.out.println("Starting from :"+ startingPoint.toString());
        System.out.println("Najkrótsza droga wynosi :" + getShortestPath());
    }


    public double getShortestPath(){


        return pathLength;
    }










    public void setStartingPoint(Punkt2D[] citiesCoord){
        for(int i=0;i<citiesCoord.length;i++){
            if(citiesCoord[i].compareTo(startingPoint)==0){
                citiesCoord[i].setStartingPoint(true);
                this.startingPointIndex = i;
                citiesCoord[i].setVisited(true);
                citiesCoord[i].setStartingPoint(true);
                System.out.println("Starting point is set");
            }
        }
    }
}
