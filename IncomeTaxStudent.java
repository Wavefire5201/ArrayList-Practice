public class IncomeTaxStudent
{
   private static final int BRACKET1LOW = 0;
   private static final int BRACKET1 = 9275;
   private static final int BRACKET2 = 37650;
   private static final int BRACKET3 = 91150;
   private static final int BRACKET4 = 190150;
   private static final int BRACKET5 = 413350;
   private static final int BRACKET6 = 415050;
   
   private static final double TAX_RATE1 = 0.10;
   private static final double TAX_RATE2 = 0.15;
   private static final double TAX_RATE3 = 0.25;
   private static final double TAX_RATE4 = 0.28;
   private static final double TAX_RATE5 = 0.33;
   private static final double TAX_RATE6 = 0.35;
   private static final double TAX_RATE7 = 0.396;
   
   /** precondition: taxableIncome >= 0
    * @return the percentage of the top tax bracket for which taxableIncome qualifies.
    */
   public double taxBracket( double taxableIncome )
   {
        if (taxableIncome < BRACKET1) {
            return TAX_RATE1;
        } else if (taxableIncome < BRACKET2) {
            return TAX_RATE2;
        } else if (taxableIncome < BRACKET3) {
            return TAX_RATE3;
        } else if (taxableIncome < BRACKET4) {
            return TAX_RATE4;
        } else if (taxableIncome < BRACKET5) {
            return TAX_RATE5;
        } else if (taxableIncome < BRACKET6) {
            return TAX_RATE6;
        }
        return TAX_RATE7;
   }
   
   /** precondition: taxableIncome >= 0
    * @return the amount of tax that taxableIncome indicates.
    */
   public double taxOwed( double taxableIncome )
   {
        if (taxableIncome < BRACKET1) {
            return taxableIncome * TAX_RATE1;
        } else if (taxableIncome < BRACKET2) {
            return ((taxableIncome - BRACKET1) * TAX_RATE2) + (BRACKET1 * TAX_RATE1);
        } else if (taxableIncome < BRACKET3) {
            return ((taxableIncome - BRACKET2) * TAX_RATE3) + ((BRACKET2 - BRACKET1) * TAX_RATE2) + (BRACKET1 * TAX_RATE1);
        } else if (taxableIncome < BRACKET4) {
            return ((taxableIncome - BRACKET3) * TAX_RATE4) + ((BRACKET3 - BRACKET2) * TAX_RATE3) + ((BRACKET2 - BRACKET1) * TAX_RATE2) + (BRACKET1 * TAX_RATE1);
        } else if (taxableIncome < BRACKET5) {
            return ((taxableIncome - BRACKET4) * TAX_RATE5) + ((BRACKET4 - BRACKET3) * TAX_RATE4) + ((BRACKET3 - BRACKET2) * TAX_RATE3) + ((BRACKET2 - BRACKET1) * TAX_RATE2) + (BRACKET1 * TAX_RATE1);
        } else if (taxableIncome < BRACKET6) {
            return ((taxableIncome - BRACKET5) * TAX_RATE6) + ((BRACKET5 - BRACKET4) * TAX_RATE5) + ((BRACKET4 - BRACKET3) * TAX_RATE4) + ((BRACKET3 - BRACKET2) * TAX_RATE3) + ((BRACKET2 - BRACKET1) * TAX_RATE2) + (BRACKET1 * TAX_RATE1);
        }
        return ((taxableIncome - BRACKET6) * TAX_RATE7) + ((BRACKET6 - BRACKET5) * TAX_RATE6) + ((BRACKET5 - BRACKET4) * TAX_RATE5) + ((BRACKET4 - BRACKET3) * TAX_RATE4) + ((BRACKET3 - BRACKET2) * TAX_RATE3) + ((BRACKET2 - BRACKET1) * TAX_RATE2) + (BRACKET1 * TAX_RATE1);

   }  
   
   
   /** precondition: taxableIncome >= 0
    * @return the percentage your taxableIncome you pay in tax.
    */
   public double percentageOfIncome( double taxableIncome )
   {
       return (taxOwed(taxableIncome) / taxableIncome) * 100;
   }

   
}

