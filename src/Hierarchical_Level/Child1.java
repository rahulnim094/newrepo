package Hierarchical_Level;

public class Child1 extends Parent{
	
	public void c1() {
		
		System.out.println("This is child1 mathod c1");
	}
	
	public static void main(String[] args) {
		
		Child1 a=new Child1();
		a.c1();
		a.m1();
		
		
	}

}
