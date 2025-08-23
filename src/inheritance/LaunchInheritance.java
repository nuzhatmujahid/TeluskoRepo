package inheritance;

class AeroPlane{
	int dist;
	void fly() {
		System.out.println("AeroPlane is Flying!!!!!");
	}
}

class cargoPlane extends AeroPlane{
	
}

class fighterPlane extends AeroPlane{
	
}

public class LaunchInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargoPlane cp = new cargoPlane();
		cp.fly();
		
		fighterPlane fp = new fighterPlane();
		fp.fly();
		fp.dist = 452;
	}

}
