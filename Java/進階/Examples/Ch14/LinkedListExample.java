import java.util.*;
public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("SCJP");
		ll.add("SCWCD");
		ll.add("SCBCD");
		ll.add("SCMAD");
		ll.add("SCJP");
		//�C�LLinkedList
		System.out.println("�N LinkedList �C�L�X��");
		System.out.println(ll);
		//��� LinkedList �� index=1 ���
		System.out.println("��� LinkedList �� index=1 ���");
		System.out.println(ll.get(1));        
		//���� LinkedList ���Ĥ@�Ӥ������
		System.out.println("���� LinkedList ���Ĥ@�Ӥ������:"  +  ll.removeFirst());
		System.out.println("�N�ܧ�� LinkedList �C�L�X��");
		System.out.println(ll);
	}
}
