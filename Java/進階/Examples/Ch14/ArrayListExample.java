import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("One");
		al.add("Second");
		al.add("3rd");
		al.add(new Integer(4));
		al.add(new Float(5.0)); 
		//�[�J���Ƥ���
		al.add("Second");
		al.add(new Integer(4));
		//�C�LArrayList,�Q��toString()��k
		System.out.println("�C�LArrayList:");
		System.out.println(al);
		//�Q��Iterator�NArrayList���X�����Ҧ������̧Ǩ��X"
		System.out.println("�Q��Iterator�NArrayList���X�������̧Ǩ��X:");
		ListIterator it = al.listIterator();
		while(it.hasNext())  {
			int index = it.nextIndex();
			System.out.println(index + "=" + it.next());
		} 
	}
}
