public class SortComparableObjects {
      public static void main(String[] args) {
            String[] cities = {"Taipei", "Boston", "Tokyo", "Singapore"};
            java.util.Arrays.sort(cities);
            for (String city: cities)
                  System.out.print(city + " "); 
            System.out.println();

            Double[] doubleNumbers = {new Double("3.14159"),
                       new Double("1.41421"), new Double("2.71828")};    
            java.util.Arrays.sort(doubleNumbers);
            for (Double number: doubleNumbers)
                  System.out.print(number + " ");		
            System.out.println();
    }
}
