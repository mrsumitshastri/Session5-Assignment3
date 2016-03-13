package com.Session5.Assignment3;

public class polymorphismExample {

	/*
	 * Calculate the area of square and rectangles using constructor overloading.
	 */
	public static void main(String[] args) {
		Area rect = new Area(10,10);
		Area sqr = new Area(15);
	}
}



class Area
{
	private double height; 
	private double width; 
	
	public Area(int height , int width )
	{
		this.height = height;
		this.width = width;
		System.out.println("Area of Rectangle is: " + this.height*this.width);
	}
	public Area(int height )
	{
		this.height = height;
		System.out.println("Area of Square is: " + this.height*this.height);
	}
}