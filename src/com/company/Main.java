package com.company;

class Main extends MyBook {

	public static void main(String[] args) {
		MyBook mb = new MyBook();
		mb.setTitle("My Book");
		String s = mb.getTitle();
		System.out.println("Title of book is :"+s);
	}

}
