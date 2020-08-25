package JavaLearning.Day9Assignment;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class Question2 {
    public static void main(String[] args) {
        MyBook book1= new MyBook();
        book1.getTitle();
        book1.setTitle("Kite runner by Khaled Hosseini");
        System.out.println("Title of the Book: " + " " +book1.getTitle());
    }
}
