package ExceptionHandling.Question5;

public class DMain {
public static void main(String args[]) {
	try {
	NullPointer nl = null;
	//new NullPointer(1,2);
	nl.printVariables();
	}
	catch(NullPointerException e) {
		e.printStackTrace();
	}
}
}

