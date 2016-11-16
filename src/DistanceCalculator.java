import java.util.Set;

/**
 * Created by sbmaniac on 2016-10-31.
 */
public class DistanceCalculator {

        float[][] distanceArray;


    public void fillDistanceArray(Punkt2D[] citiesCoordArray){
         this.distanceArray = new float[citiesCoordArray.length][citiesCoordArray.length];
        for (int i = 0; i<distanceArray.length;i++){
            for(int j =0; j<distanceArray[i].length;j++){
                if(i==j){
                    distanceArray[i][j]=0;
                }else{
                    distanceArray[i][j] = getDistanceToOtherCoord(citiesCoordArray[i],citiesCoordArray[j]);
                }
            }
        }

        System.out.println("Distance Array filled");
    }

    public float getDistanceToOtherCoord(Punkt2D point1,Punkt2D point2){
        float tempX;
        float tempY;

        tempX = Math.abs(point2.getX()-point1.getX());
        tempY = Math.abs(point2.getY()-point1.getY());

        return (float) Math.sqrt(Math.pow(tempX,2)+Math.pow(tempY,2));

    }

    public float getDistanceFromDistanceArray(int index1, int index2){
        return distanceArray[index1][index2];
    }


}
