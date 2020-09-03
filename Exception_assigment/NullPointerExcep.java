package Exception_assigment;

public class NullPointerExcep {
      public static void main(String[] args)
      {
    	  String a=null;
    	  try
    	  {
    		  if(a.equals("abc"))
    		     System.out.println("hii puja");
    		  else
    		     System.out.println("sorry catch null value");
    	  }catch(NullPointerException e)
    	  {
    		  e.printStackTrace();
    	  }
      }
}
