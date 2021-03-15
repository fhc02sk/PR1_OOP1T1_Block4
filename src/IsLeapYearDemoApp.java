public class IsLeapYearDemoApp {

    public static void main(String[] args) {




        int count = 0;
        for (int i = 0; i <= 2100; i++) {
            if (isLeapYear(i, true))
            {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

    public static boolean isLeapYear(int year) {
        return isLeapYear(year, false);
    }

    /*
       4 => Schaltjahr
      16 => Schaltjahr
    1992 => Schaltjahr (da durch 4 teilbar)
    1996 => Schaltjahr (da durch 4 teilbar)
    2020 => Schaltjahr (da durch 4 teilbar)

    1900 => kein Schaltjahr (ist zwar durch 4 teilbar,
                gleichzeitig aber auch durch 100, nicht jedoch durch 400)
    2000 => Schaltjahr (da durch 4 und 400 teilbar)
    2100 => kein Schaltjahr
     */
    public static boolean isLeapYear(int year, boolean showPrintMessages){

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                if (showPrintMessages)
                    System.out.println(year + " is a leap year");

                return true;
            }
        }
        else {
            if (year % 4 == 0){
                if (showPrintMessages)
                    System.out.println(year + " is a leap year");

                return true;
            }
        }
        return false;
    }
}
