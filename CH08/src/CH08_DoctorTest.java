/**

   File name: DoctorTest.java

   This program tests class Doctor, an extension of Person class.

   For each of the 6 constructors, create a Doctor object,
      then write all the data item values to the screen.
    Test each of the methods that return, change, or write any
      of the parameters.
    Test the equals method first with two Doctor instances
      that are equal,
      then change just one character in one instance's ssn
      so that they are not equal,
      and test for equality again.

   Author: Lew Rakocy
   email address: LRakocy@devrycols.edu
   Date: 9/4/2000
   Last changed:
   Updated for fourth edition by Brian Durney, December 2004

*/
import java.util.*;

public class CH08_DoctorTest
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      char repeat;
      do  // repeat if user says 'yes'
      {
         // Test the six constructors (uses writeOutput method)

         CH08_Doctor drNo = new CH08_Doctor();
         System.out.println("Using default constructor:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("No name yet.");
         System.out.println("$150");
         System.out.println("None given");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Using constructor with just name:");
         CH08_Doctor drJekyl = new CH08_Doctor("Jekyl");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Jekyl");
         System.out.println("$150");
         System.out.println("None given");
         System.out.println();
         drJekyl.writeOutput();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Constructor with name & office fee :");
         CH08_Doctor drKildare = new CH08_Doctor("Kildare", 200.99);
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Kildare");
         System.out.println("$200.99");
         System.out.println("None assigned");
         System.out.println();
         drKildare.writeOutput();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Constructor with name and specialty:");
         CH08_Doctor drWelby = new CH08_Doctor("Welby", "General Practioner");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Welby");
         System.out.println("$150");
         System.out.println("General Practitioner");
         System.out.println();
         drWelby.writeOutput();
         System.out.println();
         System.out.println("===============================");

         System.out.println
            ("Constructor with name, office fee, and specialty:");
         CH08_Doctor drHoliday = new CH08_Doctor("Holiday", 5.25, "Dentist");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Holiday");
         System.out.println("$5.25");
         System.out.println("Dentist");
         System.out.println();
         drHoliday.writeOutput();
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         //Test the other three write methods

         System.out.println("Write name test:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Name: Holiday");
         System.out.println();
         drHoliday.writeName();
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Write office fee test:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Office Fee: $5.25");
         System.out.println();
         drHoliday.writeOfficeFee();
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Write specialty test:");
         System.out.println();
         System.out.println("Verify:");
         System.out.println("Specialty: Dentist");
         System.out.println();
         drHoliday.writeSpecialty();
         System.out.println();
         System.out.println();
         System.out.println("===============================");


         //Test the four set methods

         System.out.println
                 ("Set name, office fee, and specialty:");
         System.out.println();
         System.out.println("Default parameter values before set:");
         drNo.writeOutput();
         System.out.println();
         drNo.set("No", 1234.56, "Laser Surgery");
         System.out.println("Verify parameter values after set:");
         System.out.println("No");
         System.out.println("$1234.56");
         System.out.println("Laser Surgery");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Set name test:");
         System.out.println();
         System.out.println("Parameter values before set:");
         drNo.writeOutput();
         System.out.println();
         drNo.setName("Yes");
         System.out.println("Parameter values after set:");
         System.out.println("Verify Name: Yes");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Set office fee test:");
         System.out.println();
         System.out.println("Parameter values before set:");
         drNo.writeOutput();
         System.out.println();
         drNo.setOfficeFee(987.65);
         System.out.println("Parameter values after set:");
         System.out.println("Verify Office Fee: $987.65");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Set specialty test:");
         System.out.println();
         System.out.println("Parameter values before set:");
         drNo.writeOutput();
         System.out.println();
         drNo.setSpecialty("Psychiatry");
         System.out.println("Parameter values after set:");
         System.out.println("Verify Specialty: Psychiatry");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         //Test the three get methods

         System.out.println("Get name test:");
         System.out.println();
         System.out.println("Verify Yes");
         System.out.println();
         System.out.println(drNo.getName());
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Get office fee test:");
         System.out.println();
         System.out.println("Verify 987.65");
         System.out.println();
         System.out.println(drNo.getOfficeFee());
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Get specialty test:");
         System.out.println();
         System.out.println("Verify Psychiatry");
         System.out.println();
         System.out.println(drNo.getSpecialty());
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         // test equals

         System.out.println("equals test 1:");
         System.out.println();
         //Create second Doctor with same values as drNo
         CH08_Doctor drYes = new CH08_Doctor("Yes", 987.65, "Psychiatry");
         System.out.println("First Doctor's parameter values:");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println("Second Doctor's parameter values:");
         System.out.println();
         drYes.writeOutput();
         System.out.println("Verify true");
         System.out.println();
         System.out.println(drNo.equals(drYes));
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("equals test 2:");
         System.out.println();
         //Change office fee of drYes
         drYes.setOfficeFee(987.66);
         System.out.println("First Doctor's parameter values:");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println("Second Doctor's parameter values:");
         System.out.println();
         drYes.writeOutput();
         System.out.println("Verify false");
         System.out.println();
         System.out.println(drNo.equals(drYes));
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("equals test 3:");
         System.out.println();
         //Change office fee back to 987.65
         //and specialty to psychology
         drYes.setOfficeFee(987.65);
         drYes.setSpecialty("Psychololgy");
         System.out.println("First Doctor's parameter values:");
         System.out.println();
         drNo.writeOutput();
         System.out.println();
         System.out.println("Second Doctor's parameter values:");
         System.out.println();
         drYes.writeOutput();
         System.out.println("Verify false");
         System.out.println();
         System.out.println(drNo.equals(drYes));
         System.out.println();
         System.out.println();
         System.out.println("===============================");

         System.out.println("Do again? (Y for Yes, or N for No)");
         repeat = keyboard.next().charAt(0);

      }while((repeat == 'y') || (repeat == 'Y'));
   }
}
