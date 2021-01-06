import java.util.Scanner;

class FractionMain {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    while(true){
      Fraction f1 = new Fraction(); 
      
      System.out.print("Enter the numerator for the first fraction: ");
      int intNum1 = input.nextInt(); 
      f1.setNum(intNum1);
      
      System.out.print("Enter the denominator for the first fraction: ");
      int intDen1 = input.nextInt(); 
      f1.setDen(intDen1);
      
      System.out.print("Enter the numerator for the second fraction: ");
      int intNum2 = input.nextInt();
      System.out.print("Enter the denominator for the second fraction: ");
      int intDen2 = input.nextInt();
      
      // Fraction(int num, int den) is used
      Fraction f2 = new Fraction(intNum2, intDen2); 
      
      System.out.println("\nThere are " + Fraction.getNumberOfFractions() + " fractions.");
      
      System.out.println("Checking if the first fraction is equal to the second fraction (true/false): " + f1.equals(f2));
      
      System.out.println("\nThe first fraction entered is " + f1.getNum() + "/" + f1.getDen() + ".");
      System.out.println("The second fraction entered is " + f2.getNum() + "/" + f2.getDen() + ".");
      
      System.out.println("\nThe two fractions added together equal: " + Fraction.add(f1, f2) + ".");
      
      while (true) {
        System.out.println("\n----------------------------------------------------");
        System.out.println("\nInverting Fractions!");
        System.out.println("\nPlease type 1 if you want to invert the first fraction, 2 for the second fraction, 3 for both fractions, or 4 if you don't want to invert.");
        int intInvert = input.nextInt(); 
        if (intInvert == 1){
          f1.invert();
          System.out.println("The inverted result is: " + f1 + ".");
          break;
        } else if (intInvert == 2) {
          f2.invert();
          System.out.println("The inverted result is: " + f2 + ".");
          break;
        } else if (intInvert == 3) {
          f1.invert();
          f2.invert();
          System.out.println("The inverted result is: " + f1 + "and" + f2 + "."); 
          break;
        } else if (intInvert == 4) {
          System.out.println("No inverting was done.");
          break;
        } else {
          System.out.println("Please type a valid number."); 
        }
      }
      
      while (true){
        System.out.println("\nReducing Fractions!");
        System.out.println("Please type 1 if you want to reduce the first fraction, 2 for the second fraction, 3 for both fractions, or 4 if you don't want to reduce.");
        int intReduce = input.nextInt(); 
        if (intReduce == 1){
          f1.reduce();
          System.out.println("The reduced result is: " + f1 + ".");
          break;
        } else if (intReduce == 2) {
          f2.reduce();
          System.out.println("The reduced result is: " + f2 + ".");
          break;
        } else if (intReduce == 3) {
          f1.reduce();
          f2.reduce();
          System.out.println("The reduced result is: " + f1 + "and" + f2 + "."); 
          break;
        } else if (intReduce == 4) {
          System.out.println("No reducing was done.");
          break;
        } else {
          System.out.println("Please type a valid number.");
        }
      }
      
      System.out.println("\nThe final values of the first and second fractions are " + f1 + " and " + f2 + ", respectively.");
      
      System.out.println("\nNow it's time to add the fractions again!");
      System.out.println("\nThe two fractions added together equal: " + f1.add(f2) + ".");
      
      System.out.println("Do you want to stop? Enter 1 to stop and anything else to continue."); 
      int option = input.nextInt();
      if (option == 1) {
        System.out.println("Until next time!"); 
        break;
      }else {
        System.out.println("More fractions!");
      }
    }
  }
}
