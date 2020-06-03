package oops2;

abstract class Shape {
	void draw() {
		System.out.println("Shape draw..");
	}

	void rotate() {
		System.out.println("Shape rotate");
	}

	void perimeter() {
		System.out.println("Shape perimeter");
	}

	void area() {
		System.out.println("Shape area");
	}
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle draw using radius");
	}

	@Override
	void perimeter() {
		System.out.println("Circle perimeter = 2πr");
	}

	@Override
	void area() {
		System.out.println("Circle area = πr²");
	}
	
	void calculateDiameter() {
		System.out.println("Circle diameter = 2r");
	}
}

class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Triangle draw using base and height");
	}

	@Override
	void perimeter() {
		System.out.println("Triangle perimeter = base + height + diagnol");
	}

	@Override
	void area() {
		System.out.println("Triangle area = (b*h)/2");
	}
}

class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Square draw using side");
	}

	@Override
	void perimeter() {
		System.out.println("Square perimeter = 4s");
	}

	@Override
	void area() {
		System.out.println("Square area = s²");
	}
	void calculateDiagnol() {
		System.out.println("Square diagnol");
	}
}

class Pentagon extends Shape{
	void calculateDiagnol() {
		System.out.println("Pentagon diagnol");
	}
}

public class UpcastingDowncasting {
	
	static void Upcast(Shape shape) {
		shape.area();
		shape.draw();
		shape.perimeter();
		shape.rotate();
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			circle.calculateDiameter();
		}
		else if(shape instanceof Square) {
			Square square = (Square) shape;
			square.calculateDiagnol();
		}
		else if(shape instanceof Pentagon) {
			Pentagon pentagon = (Pentagon) shape;
			pentagon.calculateDiagnol();
		}
	}

	public static void main(String[] args) {
		
		Upcast(new Circle());
		Upcast(new Triangle());
		Upcast(new Square());
		Upcast(new Pentagon());
		
//		Shape shape = new Circle();//upcasting
//		Shape shape2 = new Triangle();
//		Shape shape3 = new Square();
//		Shape shape4 = new Pentagon();
		// upcasting means create an object of child but limit its functionality by 
		// converting it into parent type
		// functions that are specific only to child will be blocked by parent automatically
		// doing so gives us some object that is common even if the objects originally are different
//		
//		Upcast(shape);
//		Upcast(shape2);
//		Upcast(shape3);
//		Upcast(shape4);
		
//		Circle circle = new Circle();
//		circle.area();
//		circle.draw();
//		circle.perimeter();
//		circle.rotate();
//		circle.calculateDiameter();
//		
//		Triangle triangle = new Triangle();
//		triangle.area();
//		triangle.draw();
//		triangle.perimeter();
//		triangle.rotate();
//		
//		Pentagon pentagon = new Pentagon();
//		pentagon.area();
//		pentagon.draw();
//		pentagon.perimeter();
//		pentagon.rotate();
//		pentagon.calculateDiagnol();
//		
//		Square square = new Square();
//		square.area();
//		square.draw();
//		square.perimeter();
//		square.rotate();
//		square.calculateDiagnol();
		
//		System.out.println(shape);
		
	}

}
