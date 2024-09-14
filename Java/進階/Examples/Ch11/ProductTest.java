public class ProductTest {
	public static void main(String[] args) {
		Rock rock = new Rock(20, 10, 100);
		Paint paint = new Paint(13.0, 8.0, 25.0);
		Widget widget = new Widget(7.0, 5.0, 10);

		System.out.println("== " + rock.getName() + " ==");
		System.out.println("Price: " + rock.getTotalPrice());
		System.out.println("Cost: " + rock.getTotalCost());
		System.out.println("Profit: " + rock.getProfit());

		System.out.println("== " + paint.getName() + " ==");
		System.out.println("Price: " + paint.getTotalPrice());
		System.out.println("Cost: " + paint.getTotalCost());
		System.out.println("Profit: " + paint.getProfit());

		System.out.println("== " + widget.getName() + " ==");
		System.out.println("Price: " + widget.getTotalPrice());
		System.out.println("Cost: " + widget.getTotalCost());
		System.out.println("Profit: " + widget.getProfit());
	}
}
