import java.util.Enumeration;

public class TextStatement extends Statement {
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getTitle(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += getFiguresForThisRental(each);
      }
      //add footer lines
      result += getAmountOwedMsg(aCustomer);
      result += getRenterPointsMsg(aCustomer);
      return result;
  }

  private String getTitle(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  private String getFiguresForThisRental(Rental each) {
    return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
  }

  private String getAmountOwedMsg(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
  }

  private String getRenterPointsMsg(Customer aCustomer) {
    return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
  }
}