/**
 * Created by sbmaniac on 2016-11-13.
 */
public class NearestNeighbour {
    private int startingPointIndex;
    private Punkt2D startingPoint;
    private int visitedPoints;


    public NearestNeighbour(Punkt2D startingPoint){
        this.startingPoint = startingPoint;
        this.visitedPoints = 0;
        this.startingPointIndex =0;
    }

    public void setStartingPoint(Punkt2D[] citiesCoord){
        int index = 0;
        for(int i=0;i<citiesCoord.length;i++){
            if(citiesCoord[i].compareTo(startingPoint)==0){
                citiesCoord[i].setStartingPoint(true);
                startingPointIndex = i;
                citiesCoord[i].setVisited(true);
                System.out.println("Starting point is set");
            }
        }
    }

    public float getShortestPath(Punkt2D[] citiesCoord,DistanceCalculator filledDistanceTab) {
        Punkt2D actualPoint;
        float pathLength = 0;
        float shortestPathBetweenTwoPoints;
        int nextPointIndex;

        setStartingPoint(citiesCoord);
        actualPoint=startingPoint;
        int actualPointIndex=startingPointIndex;
        visitedPoints+=1;

        if(actualPointIndex==citiesCoord.length-1){
            shortestPathBetweenTwoPoints = filledDistanceTab.getDistanceFromDistanceArray(actualPointIndex,actualPointIndex-1);
            nextPointIndex = actualPointIndex-1;
        }else
        {
            shortestPathBetweenTwoPoints = filledDistanceTab.getDistanceFromDistanceArray(actualPointIndex,actualPointIndex+1);
            nextPointIndex = actualPointIndex+1;
        }


        do {

            for (int i = 0; i < citiesCoord.length; i++) {
                if(citiesCoord[i].compareTo(actualPoint)!=0){
                    if(filledDistanceTab.getDistanceFromDistanceArray(actualPointIndex,i)!=0){
                        if (filledDistanceTab.getDistanceFromDistanceArray(actualPointIndex,i)<shortestPathBetweenTwoPoints){
                            shortestPathBetweenTwoPoints=filledDistanceTab.getDistanceFromDistanceArray(actualPointIndex,i);
                            nextPointIndex=i;
                        }
                    }
                }
            }
            actualPoint= citiesCoord[nextPointIndex];
            pathLength+=shortestPathBetweenTwoPoints;
            actualPoint.setVisited(true);


        } while (visitedPoints != citiesCoord.length);

        return pathLength;

    }



}
