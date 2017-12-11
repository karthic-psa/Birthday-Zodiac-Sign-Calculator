# Zodiac Sign Calculator #
## Design Description: ##
1.	The design has a ```main``` method to input the date of birth and calls the other 3 methods to check whether the date entered is valid (```checkDate``` method), get the zodiac sign (```zodiacSign``` method) and the method to find the day of the week (```DayofWeek``` method). 
2.	Then we have a method called ```checkDate``` in a class to check whether the entered date is a valid in both the designs. This method verifies whether the entered date is valid or not and return boolean true or false. The only addition/changes made by implementing TDD in this part is exception handling. If there is an exception, as in wrong format of the date was entered or any out of range numbers for day or month are entered, the method throws an exception saying an invalid date was entered.
3.	Next, we have method called ```dayFinder``` in a new class to find the “DAY_OF_WEEK” field to get the required day of the week for the entered date of birth. Return the day of the week found to the main method. Also, here by implementing TDD we noticed few exceptions showing up. Hence, we included exception handling and return “Invalid date was entered” if an exception was found. Else, if the day was not determined we output “Cannot determine Day of Week”.
4.	Then we have a method called ```zodiacSign``` in another new class to find the zodiac sign corresponding with the given month and day. Then return the Zodiac sign to the ```main``` method. Output “Invalid Date” if an exception is encountered. 

*Followed test first coding, din't write any code unless a failing test demands it. Wrote minimum code to make tests pass. Made sure tests are passing at all times. Kept the design lightweight and the code quality high.*

### Note: ###
>	We have also noticed while implementing TDD (testing) that Java does not take in inputs of ‘08’ and ‘09’ for month and day in the 'java' code of the test (not while executing the output i.e inputing the date in the console window after compiling and running the code. These numbers work fine in this case.) as in Java and several other languages, an integer literal beginning with 0 is interpreted as an octal (base 8) quantity. For single-digit numbers (other than 08 and 09, which are not allowed), the result is the same, so you might not notice that they are being interpreted as octal. When you start a literal integer with 0, it's considered an octal number, one that uses base 8 rather than base 10. That means 08 and 09 are not valid digits when we include them in the code of the program. So we need to use them as single digit ‘8’ or ‘9’ in the Java code.

Testing by implementing **TDD**:
As we are using Java, we use junit testing. 
For this we use the following libraries:
1.	```import static org.junit.Assert.*;```
2.	```import org.junit.Test;```
3. Then we use the following to conduct the tests in different methods:
```assertEquals(boolean expected, boolean actual)```

### Tests: ###
>	We create the 1st test case to test and validate the date
>	We create the 2nd test case to test and validate the zodiac sign
>	We create the 3rd test case to test and validate the day of the week for the entered date

## Instruction to run the application ##

1. Clone the repo or download the zip and open the files in Eclipse or any java editor where you can run the program
2. Upload the JAVA files
3. Run the main program to start the app
