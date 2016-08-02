package com.adi;


import java.text.DecimalFormat;

/** This is created to be independant practice for working with dataTypes variables. Data sources are found at the below the class **/

public class Main {

    public static void main(String[] args) {

      // TODO: Complete the following variable declarations.

        DecimalFormat dF = new DecimalFormat ("#.00");

        double oldYear = 1950;
        double nowYear = 2016;

        double averageFamilyIncome1950 = 3300;
        double medianHomePrice1950 = 7354;
        double tuitionYale1950 = 600;
        double roomAndBoardYale1950 = 456;
        double otherExpensesYale1950 = 376;

        double averageFamilyIncome2015 = 51017;
        double medianHomePrice2015 = 188900;
        double medianHomePriceManhattan2013 = 855000;
        double tuitionYale2015 = 45800;
        double roomAndBoardYale2015 = 14000;
        double otherExpensesYale2015 = 5552;

        String intro = "To understand how purchasing power has changed in the past 65 years, it is useful to compare the family income to the cost of goods and services, such as housing and education.";


      // TODO: Find and fix a mistake in the following.

        if (intro == "A long time ago in a galaxy far, far away") {
            System.out.println("May the force be with you.");
        }
        else {
            System.out.println(intro);
        }

      // TODO: Use a print statement to add a newline or <br>.

            System.out.println("\n");

      // TODO: Complete the following basic mathematical calculations.

        // Divide median home price by annual income and print each result to the command line.
        // Make 3 variables: homeRatio1950, homeRatio2015, homeRatioNYC2015
            double homeRatio1950 = medianHomePrice1950 / averageFamilyIncome1950;
            double homeRatio2015 = medianHomePrice2015 / averageFamilyIncome2015;
            double homeRatioNYC2015 = medianHomePriceManhattan2013 / averageFamilyIncome2015;
            System.out.println(dF.format(homeRatio1950));
            System.out.println(dF.format(homeRatio2015));
            System.out.println(dF.format(homeRatioNYC2015));



        // Find the total cost of university education for 1950 and for 2015 and print result to the command line.
        // Then divide university cost by annual income for both: educationRatio1950, & educationRation2015. Print the results to the command line.

            double totalCostUniv1950  = tuitionYale1950 + roomAndBoardYale1950 + otherExpensesYale1950;
            double totalCostUniv2015  = tuitionYale2015 + roomAndBoardYale2015 + otherExpensesYale2015;

            System.out.println(totalCostUniv1950);
            System.out.println(totalCostUniv2015);
            double educationRatio1950 = totalCostUniv1950 / averageFamilyIncome1950;
            double educationRatio2015 = totalCostUniv2015 / averageFamilyIncome2015;
            System.out.println(dF.format(educationRatio1950));
            System.out.println(dF.format(educationRatio2015));



      // TODO: Convert the following String into a number.

        String averageDebt1950 = "2000";
        double  averageDebt1950Dub = Double.parseDouble(averageDebt1950);

      // TODO: Complete the following variable declarations, find the typo, and replace the /*something*/'s in the String with the proper variables.

        double creditCardDebt2010 = 15355;
        double totalDebt2010 = 129579;
        String debt = "Debt is an unwelcome guest at the table in many American households. Back in the late 1940s and early 1950s, the average American consumer had less than " + averageDebt1950Dub + " in total personal debt. Today the average U.S. household with debt carries " + creditCardDebt2010 + " in credit card debt and " + totalDebt2010 + " in total debt.";

      // TODO: Using one line of code, determine if the following string contains the word "table". Print the result to the command line.


        System.out.println(debt.matches(".*\\btable\\b.*"));

      // TODO: How has the ratio of debt to income changed in the past 60 years?


        double ratio2010 = totalDebt2010 / averageFamilyIncome2015;
        double ratio1950 = averageDebt1950Dub / averageFamilyIncome1950;

        double changedRatio60Years = ( ratio2010   /* 2.53 */) - ratio1950;
        System.out.println("It has changed by " + dF.format(changedRatio60Years) + ".");

      // EXTRA: Round the answer to two decimal places.
    }
}

/** SOURCES:
 *  http://www.mybudget360.com/cost-of-living-2014-inflation-1950-vs-2014-data-housing-cars-college/
 *  http://oir.yale.edu/1701-1976-yale-book-numbers
 *  http://www.yale.edu/tuba/finaid/finaid-information/1516/1516EA_FYYE.pdf
 *  http://www.forbes.com/sites/erincarlyle/2014/01/30/manhattan-real-estate-ten-year-review-neighborhoods-where-prices-have-gone-up-the-most/
 *  https://www.mainstreet.com/article/americans-personal-debt-skyrockets
 *  http://www.nerdwallet.com/blog/credit-card-data/average-credit-card-debt-household/
 *  **/
