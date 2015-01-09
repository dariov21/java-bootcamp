import MyPoint;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle(MyPoint center, int radius){
		this.center = center;
		this.radius = radius;
	}
	
	public MyCircle(MyPoint.x center, MyPoint.y, radius){
		center.x = MyPoint.x;
		center.y = MyPoint.y;
		this.radius = radius;
	}
	
	public MyPoint getCenter(){
		return center;
	}
	
	public int getCenterX(){
		return center.x;
	}
	
	public int getCenterY(){
		return center.y;
	}
	
	public void setCenter(MyPoint center){
		this.center = center;
	}
	
	public void setCenterXY(int x, int y){
		center.setX(x);
		center.setY(y);
	}
	
	public int getRadius(){
		return radius;
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}
	
	public String toString(){
		String chain = "Circle @ (" + center.x +"," + center.y + ") radius =" + radius;
		return chain;
	}
	
	public double getArea(){
		double area = Math.PI * Math.pow(radius,2);
		return area;
	}
	
}
