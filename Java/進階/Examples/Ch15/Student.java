import java.io.*;
public class Student implements Serializable {
	private String name;
	private int chScore, engScore;
	private transient int mathScore;	
	public Student(String n, int c, int e, int m) {
		name = n;
		chScore = c;
		engScore = e;
		mathScore = m;
	}	
	public double avgScore() {
		return (chScore+engScore+mathScore)/3.0;
	}	
	public void printData() {
		System.out.println("�m�W�G"+name);
		System.out.println("���G"+chScore);
		System.out.println("�^��G"+engScore);
		System.out.println("�ƾǡG"+mathScore);
		System.out.println("�����G"+avgScore());	
	}
}
