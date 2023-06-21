package packLeasing;

public class Cars extends Vehicles {

	@Override
	public Integer getType() {
		return Attributes.TYPE_CAR;
	}

	@Override
	public String toString() {
		return "Cars []"; //TODO
	}
	public Cars(String string, int i, int j, String string2, String string3, int k, String string4) {
		super( string,  i, j,  string2,  string3, k, string4);
		
	}
	
	

}
