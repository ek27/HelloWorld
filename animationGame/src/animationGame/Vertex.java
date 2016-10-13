package animationGame;
 
	public class Vertex {
		
	public double x;
	public double y;
	
	
		
	//Konstruktor
		public Vertex (double x, double y){
		
			
		this.x=x;
		this.y=y;
		
		}
		
	// Mainmethode
		public static void main (String [] args) {
			
			String s1="Hallo";
			String s2="HallO".toLowerCase();
			
		
			
			Vertex v1 = new Vertex (17,4);
			Vertex v2 = new Vertex (0,0);
			Vertex v3 = v1.skalarMult(2);
			
			
			System.out.println("vl.x= "+v1.x);
			System.out.println("v2.x= "+v2.x);
			System.out.println("v1= "+v1);
			System.out.println(v1.length());
			System.out.println(v2.length());
			System.out.println("v1.x: "+v1.getX());
			System.out.println(v1.equals(v2));
			v2.setX(17);
			v2.setY(4);
			System.out.println(v1.equals(v2));
		}
		
		
		public String toString() {return "("+x+", "+y+")" ;}
		
		public double length() {return Math.sqrt(x*x+y*y);}
		
		public Vertex skalarMult(double s){
			return new Vertex (x*s, y*s);}
		
		public Vertex add(Vertex v) {
			return new Vertex(v.x+x, v.y+y);}
		
		public void addMod(Vertex v) {
			x=x+v.x;
			y=y+v.y;
			
		}
		public void setX (double x) {this.x= x;}
		public void setY (double y) {this.y = y;}
		
		public double getX() {return x;}		
		public double gety() {return y;}
		
		public boolean equals(Object thatObject){
			if(thatObject instanceof Vertex){
				Vertex that = (Vertex)thatObject;
				return this.x==that.x && this.y==that.y;
				
			}
			return false;  
			
		}
		}
		
		
	
	
	


