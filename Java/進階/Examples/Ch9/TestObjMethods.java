public class TestObjMethods {
  public static void main(String[] args) {
    MyDate date1 = new MyDate(14, 3, 1976);
    MyDate date2 = new MyDate(14, 3, 1976);
    System.out.println("date1 : " + date1);
    System.out.println("date2 : " + date2);
    if(date1 == date2){
      System.out.println("date1 is identical to date2");
    } else {
      System.out.println("date1 isn��t identical to date2");
    }
    if(date1.equals(date2)){
      System.out.println("date1 is equal to date2");
    } else {
      System.out.println("date1 is not equal to date2");
    }
    System.out.println("set date2 = date1");
    date2 = date1;
    if(date1 == date2){
      System.out.println("date1 is identical to date2");
    } else {
      System.out.println("date1 isn��t identical to date2");
    }
  }
}
