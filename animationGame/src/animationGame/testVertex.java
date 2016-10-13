package animationGame;
 
	public class testVertex {
		

		
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
		
	}
		
		

		
	