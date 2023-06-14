package packLeasing;

import java.util.Comparator;

public abstract class CompareClass{

	public static class AgeComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return Integer.compare(v1._age, v2._age);
	    }
	}

	public static class PriceComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return Integer.compare(v1._buying_price, v2._buying_price);
	    }
	}
	
	public static class BrandComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return v1._brand.compareTo(v2._brand);
	    }
	}
	
	public static class ColorComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return v1._color.compareTo(v2._color);
	    }
	}
	
	public static class ModelComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return v1._model.compareTo(v2._model);
	    }
	}
	
	public static class TypeComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	    	return v1.getType().compareTo(v2.getType());
	    }
	}

	
}
