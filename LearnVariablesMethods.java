package week1.day1;


public class LearnVariablesMethods {

	//declaring global variables for mobile
	long IMEnum;
	String clolor;
	char model;
	short cost;
	
	public void call() {
		// TODO Auto-generated method stub
System.out.println("I can use my mobile to call others");
	}
	
	public void message() {
		// TODO Auto-generated method stub
System.out.println("I can usemy mobile to message others");
	}
	
	public void playgame() {
		// TODO Auto-generated method stub
System.out.println("I can use my mobile to play games ");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnVariablesMethods samsung=new LearnVariablesMethods();
		samsung.IMEnum=112344;
		samsung.clolor= "Red";
		samsung.cost=20000;
		samsung.model='S';
		System.out.println("My Phone IMEnum is "  +samsung.IMEnum);
		System.out.println("My Phone Color is "  +samsung.clolor);
		System.out.println("My Phone Cost is "  +samsung.cost);
		System.out.println("My Phone Model is "  +samsung.model);
		
		samsung.call();
		samsung.message();
		samsung.playgame();
		
		
	}

}
