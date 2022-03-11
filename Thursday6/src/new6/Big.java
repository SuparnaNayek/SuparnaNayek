package new6;

public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int i=10/0;
}
catch(ArithmeticException e) {
	System.out.println("number cannot be divided by zero");
	}
	finally {
	System.out.println("end of block");	
	}
	}
}
