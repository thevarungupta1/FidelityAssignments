package com.company;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class Mybook extends Book {

    @Override
    void setTitle(String s) {
        super.title = s;
    }
}

public class Excercise_Question2 {

    public static void main(String[] args) {
        Mybook mb = new Mybook();
        mb.setTitle("Hello Namaskaram !");
        System.out.println(mb.getTitle());
    }
}
