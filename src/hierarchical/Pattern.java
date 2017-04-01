package hierarchical;

public class Pattern {
	
	static private int indexGenerator = 0;
	
	private String name;
	private Value[] values;
	private int index;

	public Pattern(String name,Value... values){
		this.index = indexGenerator++;
		this.name = name;
		this.values = values;
	}
	
	public Pattern(int index,String name, Value... values){
		this.index = index;
		this.name = name;
		this.values = values;
	}
	
	public String toString(){
		if(values.length == 0)
			return String.format("%s", name);
		String result = String.format("%s:(",name); 
		for(int i = 0; i < values.length; i++){
			String separator = (i == values.length - 1)? " )":", ";
			result += values[i]+separator;
		}
		return result; 
	}
	
	public Value[] getValues(){
		return values;
	}
	
	public int getIndex(){
		return index;
	}
	
	public int getPatternDimension(){
		return values.length;
	}
	
	public Value getValue(int index){
		return values[index];
	}
	
	public static void main(String[] args) {
		Pattern p1 = new Pattern("P1",  new Value(true).setValue(2d), new Value(true).setValue(4.5d));
		Pattern p2 = new Pattern("P2",  new Value(true).setValue(2d), new Value(true).setValue(4.5d), new Value(true).setValue(5d), new Value(true).setValue(8d));
		System.out.println(p1);
		System.out.println(p2);
	}
	
}
