import java.util.Enumeration;

public abstract class Statement {
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
  protected abstract String getTitle(Customer aCustomer);

  protected abstract String getFiguresForThisRental(Rental each);

  protected abstract String getAmountOwedMsg(Customer aCustomer);

  protected abstract String getRenterPointsMsg(Customer aCustomer);
}