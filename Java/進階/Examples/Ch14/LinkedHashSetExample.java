import java.util.*;
public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set ls = new LinkedHashSet();
		ls.add("One");
		ls.add("Second");
		ls.add("3rd");
		ls.add(new Integer(4));
		ls.add(new Float(5.0)); 
		//�[�J���Ƥ���
		ls.add("Second");
		ls.add(new Integer(4));
		//�C�LLinkedHashSet,�I�stoString()��k
		System.out.println("�C�LLinkedHashSet:");
		System.out.println(ls);
		//�Q��Iterator�NLinkedHashSet���X�����Ҧ������̧Ǩ��X"
		System.out.println("�Q��Iterator�NLinkedHashSet���X�������̧Ǩ��X:");
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
