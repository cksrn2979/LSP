import java.util.ArrayList;
import java.util.Collections;

public class MinMax1 extends MinMax {
	public ArrayList<Integer> mimax(ArrayList<Integer> a){
		int minValue;
		int maxValue;
		ArrayList<Integer> b;
		
		minValue = Collections.min(a);
		maxValue = Collections.min(a);
		
		a.set(0,minValue);
		a.set(a.size()-1,maxValue);
		
		b=a;
		
		return b;
		
	}
}
