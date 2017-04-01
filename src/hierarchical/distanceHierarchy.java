package hierarchical;

import java.util.HashMap;
import java.util.Map;

public class distanceHierarchy {
	private static Map<String, Double> Matrix = new HashMap<>();
	
	public static void addToHierarcy(String a,String b,Double weight){
		Matrix.put(a+b, weight);
		if(!a.equals(b))
			Matrix.put(b+a, weight);
	}
	
	public static double getDistance(String a,String b){
		return Matrix.get(a+b);
	}
}
