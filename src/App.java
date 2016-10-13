import java.util.ArrayList;

public class App {
	public static void testLSP(MinMax m){
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b;
		
		a.add(100);
		a.add(500);
		a.add(50);
		a.add(505);
		a.add(30);
		
		b=m.mimax(a);
		
		System.out.println("smallet Value :: " + b.get(0));
		System.out.println("smallet Value :: " + b.get(b.size()-1));
	}
	
	public static void main(String[] args){
		testLSP(new MinMax());
		testLSP(new MinMax1());
	}
}
