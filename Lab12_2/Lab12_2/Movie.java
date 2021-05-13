public abstract class Movie {
   protected String title;
   
   public Movie(String title) {
      this.title = title;
   }
       
   public String getTitle() { 
      return title; 
   }
	
   public abstract double amountFor(int daysRented);
   
   public abstract int frequentRenterPointsFor(int daysRented);
}