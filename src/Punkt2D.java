


public class Punkt2D implements Comparable<Punkt2D>{
	
	private int x;
	private int y;
	private boolean isVisited;
	private  boolean isStartingPoint;

	
	
	public Punkt2D(int x, int y) {
		this.x = x;
		this.y = y;
		isStartingPoint = false;
		isVisited = false;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean visited) {
		isVisited = visited;
	}

	public boolean isStartingPoint() {
		return isStartingPoint;
	}

	public void setStartingPoint(boolean startingPoint) {
		isStartingPoint = startingPoint;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Punkt2D)) return false;

		Punkt2D punkt2D = (Punkt2D) o;

		if (getX() != punkt2D.getX()) return false;
		return getY() == punkt2D.getY();

	}

	@Override
	public int hashCode() {
		int result = getX();
		result = 31 * result + getY();
		return result;
	}

	@Override
	public int compareTo(Punkt2D o) {
        Double odlegloscOdSrodka1 = new Double(0);
        Double odlegloscOdSrodka2 = new Double(0);
        Double temp1= new Double(0);
        Double temp2 = new Double(0);

		temp1 = (Math.pow(this.x,2))+(Math.pow(this.y,2));
		odlegloscOdSrodka1 = Math.sqrt(temp1);

		temp2 = (Math.pow(o.getX(),2)+(Math.pow(o.getY(),2)));
		odlegloscOdSrodka2 = Math.sqrt(temp2);

        return odlegloscOdSrodka1.compareTo(odlegloscOdSrodka2);

	}



    @Override
    public String toString() {
        return "Punkt2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
