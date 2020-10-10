package stack;
import impl.*;

public class Main {
	public static void main(String[] args) {
		StackRealization stackFigure = new StackRealization();
		stackFigure.push(new Rectangle(3, 5));
		stackFigure.push(new Circle(10));
		stackFigure.push(new Triangle(3, 4, 5));
		stackFigure.push(new Parallelepiped(3, 5, 6));
		stackFigure.push(new Tetrahedron(3));
		stackFigure.push(new Sphere(5));
		System.out.println(stackFigure.toString());
	}
}
