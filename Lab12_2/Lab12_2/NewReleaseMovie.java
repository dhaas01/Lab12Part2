public class NewReleaseMovie extends Movie {
   // Implement constructor
   public NewReleaseMovie(String title) {
      super(title);
		// write code here - Lab 12
   }
   
   // Implement amountFor method
   public double amountFor(int daysRented) {
   // write code here - Lab 12
      double result = 0;
      result += daysRented * 3;
      return result;
   }
   
   public int frequentRenterPointsFor(int daysRented) {
      return 1;
   }


}