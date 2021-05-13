public class RegularMovie extends Movie {
   // Implement constructor
   public RegularMovie(String title) {
      // write code here - Lab 12
      super(title);
   }
   
   // Implement amountFor method
   public double amountFor(int daysRented) {
   // write code here - Lab 12
      double result = 0;
      result += 2;
      if (daysRented > 2)
         result += (daysRented - 2) * 1.5;
         return result;
   }

   public int frequentRenterPointsFor(int daysRented) {
      return 1;
   }

}