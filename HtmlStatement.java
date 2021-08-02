public class HtmlStatement extends Statement {

  protected String getTitle(Customer aCustomer) {
    return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
  }

  protected String getFiguresForThisRental(Rental each) {
    return each.getMovie().getTitle()+ ": " + String.valueOf(each.getCharge()) + "<BR>\n";
  }

  protected String getAmountOwedMsg(Customer aCustomer) {
    return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
  }

  protected String getRenterPointsMsg(Customer aCustomer) {
    return "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + "</EM> frequent renter points<P>";
  }
}