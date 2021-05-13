import java.util.ArrayList;

public class Customer {
	private String name; 
   private ArrayList<Rental> rentals;
   
   //private Rental[] rentals = new Rental[10]; 
   private int numRentals = 0;
    
    public Customer( String name ) { 
        rentals = new ArrayList<>();
        this.name = name; 
    } 
    
    public void addRental( Rental arg ) { 
       //this.rentals[numRentals++] = arg; 
       rentals.add(arg);
       
    } 
    
    public String getName() { 
        return name;    
    }
    
    public String statement() { 
        double totalAmount = 0; 
        int frequentRenterPoints = 0; 
        String result = "Rental Record for " + getName() + "\n"; 
        //for (int i=0; i<numRentals; i++) { 
        for (int i=0; i<rentals.size(); i++) { 
            //Rental each = rentals[i]; 
            
            Rental each = rentals.get(i);
            
            frequentRenterPoints += each.getFrequentRenterPoints(); 
            // show figures for this rental 
            result += "\t" + each.getMovie().getTitle() + "\t" + 
                String.valueOf( each.amountFor() ) + "\n"; 
            totalAmount += each.amountFor(); 
        } 
        // add footer lines 
        result += "Amount owed is " + String.valueOf( totalAmount ) + "\n"; 
        result += "You earned " + String.valueOf( frequentRenterPoints ) + 
            " frequent renter points"; 
        return result; 
    } 
    
}
