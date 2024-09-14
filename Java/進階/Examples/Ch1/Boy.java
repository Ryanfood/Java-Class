/**
   這是我的第一支Java程式,一個有禮貌的男孩
   @version 1.0
   @see HelloBoy
   @author Sean Cheng
 */
public class Boy {
	/**男孩的姓名屬性*/
	public String name = "大雄";
	/**男孩的建構子*/
	public Boy(){	}
	/**男孩向人問好,並介紹自己*/
	public void greet(){
		System.out.println("你好!!!我是" + name);
	}
}
