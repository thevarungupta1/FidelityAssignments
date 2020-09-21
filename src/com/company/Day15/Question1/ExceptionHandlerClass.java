package ExceptionHandling.Question1;

public class ExceptionHandlerClass extends ArrayIndex {
	public void handle() {
		try {
			this.initializeArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("This is an end of a program and releasing all the resources");
		}
		
	}

}
