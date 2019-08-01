//Created by: Andrew Delia

import java.util.Scanner;

public class PhotographyStore
{

        private String type; //what kind of the item
        private int number;  //number of items needed

        public String toString()
        {
                return("\nType: " + type +  "\nAmount Needed:" + number + ".");
        }

        public PhotographyStore(String initialType, int initialNumber)
        {
                type = initialType;
                if( (initialNumber < 0))
                {
                        System.out.println("Error: Number is Negative.");
                }
                else
                {
                        number = initialNumber;
                }
        }

        public void set(String newType, int newNumber)
        {
                type = newType;
                if( (newNumber < 0) )
                {
                        System.out.println("Error: Number is Negative.");
                        System.exit(0);
                }
                else
                {
                        number  = newNumber;
                }
        }

        public PhotographyStore (String initialType)
        {
                number = 0;
                type = initialType;
        }

	public PhotographyStore(int initialNumber)
        {
                type = "No type yet";
                if (initialNumber < 0)
                {
                        System.out.println("Error: Number is negative.");
                        System.exit(0);
                
                }
                else
                        number = initialNumber;
        }
                
        public void setNumber(int newNumber)
        {
                if(newNumber < 0)
                {
                        System.out.println("Error: Number is Negative.");
                        System.exit(0);
                }
                else
                        number = newNumber;
        }


        public PhotographyStore()
        {
                type = "No type yet";
                number = 0;
        }
         
        public String getType()
        {
                return type;
        }

        public int getNumber()
        {
                return number;
        }

}
