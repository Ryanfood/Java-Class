public class Airport {
    public static void main(String[] args) {
        
        Flyer helicopter = new Helicopter();
        Flyer seaplane = new SeaPlane();
        Flyer superman = new Superman();

        helicopter.takeoff();
		helicopter.fly();
		helicopter.land();
        
		seaplane.takeoff();
		seaplane.fly();
		seaplane.land();

        superman.takeoff();
		superman.fly();
		superman.land();         

    }
} 
