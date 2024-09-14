import ch.aplu.turtle.*;
import java.awt.Color;

public class TurtleTest {
	public static void main(String[] args){
		Turtle sean = new Turtle();
		sean.setColor(Color.GREEN);
		sean.setPos(100,100);
		Turtle amy = new Turtle();
		amy.setColor(Color.RED);
		for(int i=0; i<4; i++){
			sean.forward(50);
			sean.right(90);
			System.out.println("Sean:("+sean.getX()+","+sean.getY()+")");
			System.out.println("¶ZÂ÷­ìÂI:"+sean.distance(0,0));
		}
		
		for(int i=0; i<3; i++){
			amy.bk(100);
			amy.left(120);
			System.out.println("Amy:("+amy.getX()+","+amy.getY()+")");
			System.out.println("¶ZÂ÷Sean:"+amy.distance(sean.getX(),sean.getY()));
		}
	}
}
