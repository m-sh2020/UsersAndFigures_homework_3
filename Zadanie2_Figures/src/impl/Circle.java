package impl;

import api.IFigure2D;

public class Circle implements IFigure2D {
	private double radius;

	public Circle(double r) {
		this.radius = r;
	}

	@Override
	public double perimetr() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double square() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "\nКруг: радиус = " + radius + "\nПлощадь = " + square() + ", периметр = " + perimetr();
	}
}
