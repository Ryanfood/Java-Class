public class Rectangle {
	public int width = 25;
	public int height = 10;
	
	public Rectangle(){
		System.out.println("�إ�"+width+"*"+height+"���x��");	
	}
	
	public Rectangle(int width, int height){
		if(width>0)
			this.width = width;
		else
			System.out.println("�e�׿�J���~,�]�w��25");
		if(height>0)
			this.height = height;
		else
			System.out.println("���׿�J���~,�]�w��10");
		System.out.println("�إ�"+this.width+"*"+this.height+"���x��");	
	}

	public Rectangle(int length){
		this(length,length);
	}

	public int getArea(){
		return width*height;
	}

	public void draw(){
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++)
				System.out.print("* ");
			System.out.println();			
		}
	}
}