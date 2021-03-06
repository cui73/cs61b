/* Date.java */

import java.io.*;

class Date {

  /* Put your private data fields here. */

  /** Constructs a date with the given month, day and year.   If the date is
   *  not valid, the entire program will halt with an error message.
   *  @param month is a month, numbered in the range 1...12.
   *  @param day is between 1 and the number of days in the given month.
   *  @param year is the year in question, with no digits omitted.
   */
      private int month;
      private int day;
      private int year;
      //private String date;
  public Date(int month, int day, int year) {
        this.month = month;
        this.day =day;
        this.year=year;
      
  }

  /** Constructs a Date object corresponding to the given string.
   *  @param s should be a string of the form "month/day/year" where month must
   *  be one or two digits, day must be one or two digits, and year must be
   *  between 1 and 4 digits.  If s does not match these requirements or is not
   *  a valid date, the program halts with an error message.
   */
  public Date(String s) {
  String daysNum[] = s.split("/");
   this.month = Integer.parseInt(daysNum[0]);
   this.day = Integer.parseInt(daysNum[1]);
   this.year =Integer.parseInt(daysNum[2]);

   if(!isValidDate(month,day,year)) {
      System.out.println("Error: month and day must be one or two digits, and year must be after 1AD");
    //System.exit(0);

   }


  }

  /** Checks whether the given year is a leap year.
   *  @return true if and only if the input year is a leap year.
   */
  public static boolean isLeapYear(int year) {
     if((year % 4) ==0) {
       if((year %100) != 0) {
        return true;} else if((year % 400) ==0) {
          return true;
        }
      }
      
     
   

    return false;                        // replace this line with your solution
  }

  /** Returns the number of days in a given month.
   *  @param month is a month, numbered in the range 1...12.
   *  @param year is the year in question, with no digits omitted.
   *  @return the number of days in the given month.
   */
  public static int daysInMonth(int month, int year) {
    int days;
    if(isLeapYear(year)){
      if(month == 1){
        return days = 31;
      } else if (month == 2) {
        return days = 29;
      } else if(month ==3){
        return days =31;
      } else if(month ==4) {
        return days =30;
      } else if(month ==5) {
        return days =31;
      } else if(month ==6) {
        return days =30;
      } else if(month ==7) {
        return days =31;
      } else if(month ==8) {
        return days = 31;
      } else if(month ==9) {
        return days=30;
      } else if (month ==10) {
        return days=31;
      } else if(month ==11) {
        return days=30;
      } else {
        return days =31;
      }
    } else {
       if(month == 1){
        return days = 31;
      } else if (month == 2) {
        return days = 28;
      } else if(month ==3){
        return days =31;
      } else if(month ==4) {
        return days =30;
      } else if(month ==5) {
        return days =31;
      } else if(month ==6) {
        return days =30;
      } else if(month ==7) {
        return days =31;
      } else if(month ==8) {
        return days = 31;
      } else if(month ==9) {
        return days=30;
      } else if (month ==10) {
        return days=31;
      } else if(month ==11) {
        return days=30;
      } else {
        return days =31;
      }
      

    }
    

    
  }

  /** Checks whether the given date is valid.
   *  @return true if and only if month/day/year constitute a valid date.
   *
   *  Years prior to A.D. 1 are NOT valid.
   */
  public static boolean isValidDate(int month, int day, int year) {
    int dayso = daysInMonth(month,year);
    if(year < 1) {
      return false;
    }
  
    if(day > dayso || day <1) {
      return false;
    }
    return true;
    
  }

  /** Returns a string representation of this date in the form month/day/year.
   *  The month, day, and year are printed in full as integers; for example,
   *  12/7/2006 or 3/21/407.
   *  @return a String representation of this date.
   */
  public String toString() {
   return this.month+"/"+this.day+"/"+this.year;

   }

  /** Determines whether this Date is before the Date d.
   *  @return true if and only if this Date is before d. 
   */
  public boolean isBefore(Date d) {
     
   if(this.year < d.year){
    return true;
   } else if(this.year == d.year){
    if(this.month <d.month){
            return true;
          } else if(this.month == d.month){
                   if(this.day < d.day){
              return true;} 
              }
              
            }
            return false;


} 




  /** Determines whether this Date is after the Date d.
   *  @return true if and only if this Date is after d. 
   */
  public boolean isAfter(Date d) {
     if(!isBefore(d) &&(!(this.day==d.day && this.month == d.month &&this .year ==this.year))){
      return true;

     }
     return false;
     }
                            // replace this line with your solution
  

  /** Returns the number of this Date in the year.
   *  @return a number n in the range 1...366, inclusive, such that this Date
   *  is the nth day of its year.  (366 is only used for December 31 in a leap
   *  year.)
   */
  public int dayInYear() {
    if(isLeapYear(year)){
      return 366;
    } else {
      return 365;
    }
  }

  public int dayInYear(int year) {
    if(isLeapYear(year)){
      return 366;
    } else {
      return 365;
    }
  }
  // public int dayInYear(Date d) {
  //   if(isLeapYear(year)){
  //     return 366;
  //   } else {
  //     return 365;
  //   }
  // }

  /** Determines the difference in days between d and this Date.  For example,
   *  if this Date is 12/15/1997 and d is 12/14/1997, the difference is 1.
   *  If this Date occurs before d, the result is negative.
   *  @return the difference in days between d and this date.
   */
  public int difference(Date d) {
     int result =0; 
     int countMonth =0;
     int countDays =0;
     int countYear =0;
     int resultForThis =0;
     int resultForD =0;

     
          if(this.year == d.year) {
          if(this.month == d.month){
          if(this.day == d.day){
           return result;
          } } }

           //else if(this.day > d.day){
              
        //         return result =this.day - d.day;
        //       } 
        //       else {
        //         return result = this.day - d.day;
        //       }
        //     } else if (this.month > d.month){

        //           for(int i =d.month;i < this.month;d.month++){
        //              countMonth=daysInMonth(d.month,d.year)+countMonth; 
        //           }
                     
        //              countDays = this.day-d.day;
        //              return result = countMonth+countDays; }

        //               else {

        //           for(int i =this.month;i < d.month;d.month++){
        //              countMonth=daysInMonth(this.month,this.year)+countMonth; 
        //           }
                     
        //              countDays = this.day-d.day;
        //              return result = countMonth+countDays;


        //       } 
        // } 
      
              
          
             
                if(this.isAfter(d)){
             
                for(int i =1; i < this.year;i++){
                  resultForThis += this.dayInYear(i);

                }

                for(int i =1; i < this.month;i++){
                  resultForThis += daysInMonth(i,this.year); 
                }
                resultForThis += this.day;
                  

                 for(int i =1; i < d.year;i++){
                  resultForD += d.dayInYear(i);

                }
                for(int i =1; i < d.month;i++){
                  resultForD += daysInMonth(i,d.year);
                }
               resultForD  += d.day;

               return result = resultForThis - resultForD;
           
          } else {

            for(int i =1; i < this.year;i++){
                  resultForThis += this.dayInYear(i);

                }

                for(int i =1; i < this.month;i++){
                  resultForThis += daysInMonth(i,this.year); 
                }
                resultForThis += this.day;
                  

                 for(int i =1; i < d.year;i++){
                  resultForD += d.dayInYear(i);

                }
                for(int i =1; i < d.month;i++){
                  resultForD += daysInMonth(i,d.year);
                }
               resultForD  += d.day;

               return result = resultForThis - resultForD;

                }



      
       
        

}
 

 

     
   
  


    public static void main(String[] argv) {
    System.out.println("\nTesting constructors.");
    Date d1 = new Date(1, 1, 1);
    System.out.println("Date should be 1/1/1: " + d1);
    d1 = new Date("2/4/2");
    System.out.println("Date should be 2/4/2: " + d1);
    d1 = new Date("2/29/2000");
    System.out.println("Date should be 2/29/2000: " + d1);
    d1 = new Date("2/29/1904");
    System.out.println("Date should be 2/29/1904: " + d1);

    d1 = new Date(12, 31, 1975);
    System.out.println("Date should be 12/31/1975: " + d1);
    Date d2 = new Date("1/1/1976");
    System.out.println("Date should be 1/1/1976: " + d2);
    Date d3 = new Date("1/2/1976");
    System.out.println("Date should be 1/2/1976: " + d3);

    Date d4 = new Date("2/27/1977");
    Date d5 = new Date("8/31/2110");

    /* I recommend you write code to test the isLeapYear function! */

    System.out.println("\nTesting before and after.");
    System.out.println(d2 + " after " + d1 + " should be true: " + 
                       d2.isAfter(d1));
    System.out.println(d3 + " after " + d2 + " should be true: " + 
                       d3.isAfter(d2));
    System.out.println(d1 + " after " + d1 + " should be false: " + 
                       d1.isAfter(d1));
    System.out.println(d1 + " after " + d2 + " should be false: " + 
                       d1.isAfter(d2));
    System.out.println(d2 + " after " + d3 + " should be false: " + 
                       d2.isAfter(d3));

    System.out.println(d1 + " before " + d2 + " should be true: " + 
                       d1.isBefore(d2));
    System.out.println(d2 + " before " + d3 + " should be true: " + 
                       d2.isBefore(d3));
    System.out.println(d1 + " before " + d1 + " should be false: " + 
                       d1.isBefore(d1));
    System.out.println(d2 + " before " + d1 + " should be false: " + 
                       d2.isBefore(d1));
    System.out.println(d3 + " before " + d2 + " should be false: " + 
                       d3.isBefore(d2));

    System.out.println("\nTesting difference.");
    System.out.println(d1 + " - " + d1  + " should be 0: " + 
                       d1.difference(d1));
    System.out.println(d2 + " - " + d1  + " should be 1: " + 
                       d2.difference(d1));
    System.out.println(d3 + " - " + d1  + " should be 2: " + 
                       d3.difference(d1));
    System.out.println(d3 + " - " + d4  + " should be -422: " + 
                       d3.difference(d4));
    System.out.println(d5 + " - " + d4  + " should be 48762: " + 
                       d5.difference(d4));
  }
}
