class Shape{
	protected int x,y;
	public void draw(){
		System.out.println("Shape Draw");
	}
	public Shape(int x, int y){
		this.x= x;
		this.y= y;
	}
}

class Rectangle extends Shape{
	private int width=1, height=1;
	public void draw(){
		System.out.println("Rectangle Draw");
		System.out.println("x:"+x+" y:"+y);
		System.out.println("width:"+width+" height:"+height);
	}
	public Rectangle(int x, int y){
		super(x,y);
	}
}

class Triangle extends Shape{
	private int base=2, height=2;
	public void draw(){
		System.out.println("Triangle Draw");
		System.out.println("x:"+x+" y:"+y);
		System.out.println("base:"+base+" height:"+height);
	}
	public Triangle(int x, int y){
		super(x,y);
	}
}

class Circle extends Shape{
	private int radius=3;
	public void draw(){
		System.out.println("Circle Draw");
		System.out.println("x:"+x+" y:"+y);
		System.out.println("radius:"+radius);
	}
	public Circle(int x, int y){
		super(x,y);
	}
}

class Cylinder extends Shape{
	private int radius=4, height=4;
	public void draw(){
		System.out.println("Cylinder Draw");
		System.out.println("x:"+x+" y:"+y);
		System.out.println("radius:"+radius+" height:"+height);
	}
	public Cylinder (int x, int y){
		super(x,y);
	}
}

public class ShapeTest {
	private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		drawAll();
	}
	public static void init(){
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Rectangle(1,1);
		arrayOfShapes[1] = new Triangle(2,2);
		arrayOfShapes[2] = new Circle(3,3);
		arrayOfShapes[3] = new Cylinder(4,4);
	}
	public static void drawAll(){
		for(int i=0; i<arrayOfShapes.length;i++){
			arrayOfShapes[i].draw();
		}
	}
}
