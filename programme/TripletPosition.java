package programme;

public class TripletPosition<x,y,z> {

	private double x;
	private double y;
	private double z;
	
	public TripletPosition(double X,double Y,double Z)
	{
		this.x = X;
		this.y=Y;
		this.z = Z;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getZ() {
		return z;
	}

	@Override
	public String toString() {
		return "TripletPosition [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
	
	
}
