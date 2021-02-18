
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(10);
		c.draw();
		System.out.println("radius="+c.getradius());
		System.out.println("area="+c.getarea());
		Shape shape=new Rectangle(10,10);
		//shape=new Rectangle(10,10);
		shape.draw();
		System.out.println("area="+shape.getarea());

	}

}
