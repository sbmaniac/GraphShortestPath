

/**
 * Created by sbmaniac on 16.11.2016.
 */
public class NearestNeighbour {
    private int startingPointIndex;
    private int actualPointIndex;
    private  int nextPointIndex;
    private int visitedPointsCount;
    private Punkt2D startingPoint;
    private Punkt2D actualPoint;
    private Punkt2D nextPoint;
    private Punkt2D[] citiesCoord;
    private DistanceCalculator distanceCalculator;
    private double pathLength;



    public NearestNeighbour(Punkt2D[] citiesCoord, Punkt2D startingPoint){
        this.startingPoint = startingPoint;
        this.actualPoint = startingPoint;
        this.citiesCoord = citiesCoord;
        setStartingPoint(citiesCoord);
        this.distanceCalculator = new DistanceCalculator();
        distanceCalculator.fillDistanceArray(citiesCoord);
        distanceCalculator.printFilledDistanceArray();
        this.actualPointIndex = this.startingPointIndex;
        this.startingPoint.setVisited(true);
        this.startingPoint.setStartingPoint(true);
        visitedPointsCount = 1;
        pathLength = 0;

        System.out.println("Stage ready");
        System.out.println("Starting from :"+ startingPoint.toString());
        System.out.println("Najkrótsza droga wynosi :" + getShortestPath());
    }


    public double getShortestPath(){
        System.out.println("Looking for shortest path started");
        System.out.println("Actual path: "+pathLength);
        do{
            double tempDistanceBetweenTwoPoints = 0;
            for(int i=0; i < citiesCoord.length; i ++){
                nextPoint = citiesCoord[i];
                if(actualPointIndex != i && visitedPointsCount<=citiesCoord.length && nextPoint.isVisited()==false){ // ten warunek sprawdzic
                    if(tempDistanceBetweenTwoPoints==0){
                        tempDistanceBetweenTwoPoints = distanceCalculator.getDistanceFromDistanceArray(actualPointIndex,i);
                        nextPointIndex = i;
                    }else{
                        if(tempDistanceBetweenTwoPoints>distanceCalculator.getDistanceFromDistanceArray(actualPointIndex,i)){
                            tempDistanceBetweenTwoPoints = distanceCalculator.getDistanceFromDistanceArray(actualPointIndex,i);
                            nextPointIndex = i;
                        }
                    }
                }
            }
            actualPointIndex = nextPointIndex;
            actualPoint = citiesCoord[nextPointIndex];
            actualPoint.setVisited(true);
            pathLength+=tempDistanceBetweenTwoPoints;
            visitedPointsCount+=1;
            System.out.println("dodano: " + tempDistanceBetweenTwoPoints);

        }while(visitedPointsCount!=citiesCoord.length);

        pathLength += distanceCalculator.getDistanceFromDistanceArray(actualPointIndex,startingPointIndex);
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
