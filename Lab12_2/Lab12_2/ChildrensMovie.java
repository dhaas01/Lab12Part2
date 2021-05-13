public class ChildrensMovie extends Movie {
   // Implement constructor
   public ChildrensMovie(String title) {
      super(title);
      // write code here - Lab 12
   }
   
   // Implement amountFor method
   public double amountFor(int daysRented) {
      // write code here - Lab 12
      double result = 0;
       result += 1.5; 
	            if (daysRented > 3) 
	                result += (daysRented - 3) * 1.5; 
                return result;
    }
   
   public int frequentRenterPointsFor(int daysRented) {
      return 1;
   }

}