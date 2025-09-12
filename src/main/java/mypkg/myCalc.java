package mypkg;

public class myCalc {
	int sum(int a, int b) { return a+b; }
	int diff(int a, int b) { return a-b; }
	double div(int a, int b) { return a/b; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myCalc calc = new myCalc();
		System.out.println(" sum a = 40, b = 20  "+ calc.sum(40,20));
		System.out.println(" diff  a = 40, b = 20  "+ calc.diff(40,20));
		System.out.println(" div  a = 40, b = 20  "+ calc.div(40,20));

	}

}
