package packLeasing;

import java.util.Comparator;

public abstract class CompareClass{

	public static class AgeComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return Integer.compare(v1.get_age(), v2.get_age());
	    }
	}

	public static class PriceComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return Integer.compare(v1.get_buying_price(), v2.get_buying_price());
	    }
	}
	
	public static class BrandComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return v1.get_brand().compareTo(v2.get_brand());
	    }
	}
	
	public static class ColorComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return v1.get_color().compareTo(v2.get_color());
	    }
	}
	
	public static class ModelComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	        return v1.get_model().compareTo(v2.get_model());
	    }
	}
	
	public static class TypeComparator implements Comparator<Vehicles> {
	    @Override
	    public int compare(Vehicles v1, Vehicles v2) {
	    	return v1.getType().compareTo(v2.getType());
	    }
	}
	
	public static class NextContractComparator implements Comparator<Contract> {
	    @Override
	    public int compare(Contract c1, Contract c2) {
	        return c1._finish.compareTo(c2._finish);
	    }
	}

	
}
