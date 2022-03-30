
public class Box {
	
	double volume;
	
	// Parametarized constructor.
	public Box(int width, int height, int depth){
		volume = width * height * depth;
	}

	//  Return Method
	public double volume() {
		
		return volume;
	}
	public static void main(String[] args) {
		
		Box b1 = new Box(11,12,13);
	    System.out.println("Volume = " + b1.volume());

	}

}
