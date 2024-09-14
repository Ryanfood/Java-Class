public class VacationScale {
	public int yearsOfService;
	public int[] vacationDays =
		new int[]{10,15,15,15,20,20,25};
	
	public void displayVacationDays(){
		System.out.print("年資"+yearsOfService+"年,特休有");		
		if(yearsOfService>6)
			System.out.println(vacationDays[6]+"天");
		else
			System.out.println(vacationDays[yearsOfService]+"天");
	}
}
