package studyJavaPTIT;

import java.util.Scanner;

class Rectangle {
	private double width, height;
	private String color;

	public Rectangle() {
		super();
		height = width = 1;
	}

	public Rectangle(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		StringBuilder sb = new StringBuilder(color.toLowerCase());
		sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
		return sb.toString();
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double findArea() {
		return height * width;
	}

	public double findPerimeter() {
		return 2 * (height + width);
	}

}

public class KhaiBaoLopHinhChuNhat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle a = new Rectangle();
		double h = sc.nextDouble(), w = sc.nextDouble();
		String s = sc.next();
		if (h <= 0 || w <= 0 || s.equals("")) {
			System.out.println("INVALID");
		} else {
			a = new Rectangle(w, h, s);
			System.out.println(String.format("%.0f %.0f", a.findPerimeter(), a.findArea()) + " " + a.getColor());
		}
	}

}