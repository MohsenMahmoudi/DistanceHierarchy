package main;

import hierarchical.Hierarchical;
import hierarchical.LinkageCriterion;
import hierarchical.Pattern;
import hierarchical.Value;
import hierarchical.distanceHierarchy;

public class PatternTestMain {

	public static void main(String[] args) {
		
		distanceHierarchy.addToHierarcy("coke", "coke", 0.0);
		distanceHierarchy.addToHierarcy("pepsi", "pepsi", 0.0);
		distanceHierarchy.addToHierarcy("mocca", "mocca", 0.0);
		distanceHierarchy.addToHierarcy("nescafe", "nescafe", 0.0);
		
		distanceHierarchy.addToHierarcy("coke", "pepsi", 2.0);
		distanceHierarchy.addToHierarcy("coke", "mocca", 4.0);
		distanceHierarchy.addToHierarcy("coke", "nescafe", 4.0);
		distanceHierarchy.addToHierarcy("pepsi", "nescafe", 4.0);
		distanceHierarchy.addToHierarcy("pepsi", "mocca", 4.0);
		distanceHierarchy.addToHierarcy("mocca", "nescafe", 2.0);
		
		Pattern[] patterns = new Pattern[3];

		patterns[0] = new Pattern(0,"Gray", new Value(true).setValue(2.0), new Value(false).setValue("coke"));
		patterns[1] = new Pattern(1,"John", new Value(true).setValue(2.0), new Value(false).setValue("pepsi"));
		patterns[2] = new Pattern(2,"Tom", new Value(true).setValue(2.0), new Value(false).setValue("mocca"));


		System.out.println("*** SINGLE LINKAGE ***\n");
		Hierarchical h = new Hierarchical(LinkageCriterion.SINGLE);
		h.partition(patterns);
	}
}
