public class Rental {
	private Movie movie; 
   private int daysRented; 
  
   public Rental(Movie movie, int daysRented) { 
      this.movie = movie; 
      this.daysRented = daysRented; 
   } 
   
   public int getDaysRented() { 
      return daysRented; 
   } 
    
   public Movie getMovie() { 
      return movie; 
   } 

	public double amountFor() {
		return movie.amountFor(daysRented);
	}
   
	
   public int getFrequentRenterPoints() {
// 		int result = 0;
// 		// add frequent renter points 
// 		result++; 
// 		// add bonus for a two day new release rental 
// 		if ((getMovie() instanceof NewReleaseMovie) && 
// 		    getDaysRented() > 1) {
//          result++;
//       }
// 		return result;

      return movie.frequentRenterPointsFor(daysRented);

	}

}
