import java.util.*;
public class HashSetExample {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//�[�J����
		hs.add("One");
		hs.add("Second");
		hs.add("3rd");
		hs.add(new Integer(4));
		hs.add(new Float(5.0)); 
		//�[�J���Ƥ���
		hs.add("Second");
		hs.add(new Integer(4));
		//�C�LHashSet,�Q��toString()��k
		System.out.println("�C�LHashSet:");
		System.out.println(hs);
		//�Q��Iterator�NHashSet���X�����Ҧ������̧Ǩ��X"
		System.out.println("�Q��Iterator�NHashSet���X�������̧Ǩ��X:");
		Iterator  i= hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
