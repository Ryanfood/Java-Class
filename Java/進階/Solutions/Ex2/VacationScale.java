public class VacationScale {
	public int yearsOfService;
	public int[] vacationDays =
		new int[]{10,15,15,15,20,20,25};
	
	public void displayVacationDays(){
		System.out.print("�~��"+yearsOfService+"�~,�S��");		
		if(yearsOfService>6)
			System.out.println(vacationDays[6]+"��");
		else
			System.out.println(vacationDays[yearsOfService]+"��");
	}
}
