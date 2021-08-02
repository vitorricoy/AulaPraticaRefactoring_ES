public class TextStatement extends Statement {
  
  protected String getTitle(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }

  protected String getFiguresForThisRental(Rental each) {
    return "\t" + each.getMovie().getTitle()+ "\t" + String.valueOf(each.getCharge()) + "\n";
  }

  protected String getAmountOwedMsg(Customer aCustomer) {
    return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
  }

  protected String getRenterPointsMsg(Customer aCustomer) {
    return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
  }
}