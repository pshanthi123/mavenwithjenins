package vector;

import java.util.Vector;

public class vect {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(12);
		v.add(19);
		v.add(null);
		v.add(13);
		v.add(18);
		v.add(null);
		System.out.println(v);
		Vector<Integer> v1=new Vector<>();
		v1.add(32);
		v1.add(22);
		v1.add(10);
		v1.addAll(v);
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.contains(18));
		System.out.println(v1.remove(3));
		System.out.println(v1);
		
		

	}

}
