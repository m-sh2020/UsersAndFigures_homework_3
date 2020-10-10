package impl;

import api.IFigure2D;

public class Rectangle implements IFigure2D {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double perimetr() {
		return (this.length + this.width) * 2;
	}

	@Override
	public double square() {
		return this.length * this.width;
	}

	@Override
	public String toString() {
		return "\nПрямоугольник: длина = " + this.length + ", ширина = " + this.width + "\nПлощадь = " + square()
				+ ", Периметр = " + perimetr();
	}
}
