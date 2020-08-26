package com.company;

abstract class Book {
	static String title;

	abstract void setTitle(String s);

	String getTitle() {
		return title;
	}
}
