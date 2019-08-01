//Andrew Delia

import java.util.Scanner;

public class PhotographyStoreTest extends PhotographyStore
{
        public static void main(String[] args)
        {
                Type  newType = new Type("Unknown");

                Scanner input = new Scanner(System.in);

                System.out.println("Type of item: ");
                String type = input.nextLine();

                System.out.println("Amount of item: ");
                int number = input.nextInt();

                System.out.println("Is your item a camera, a lense, or a form of media? ");
                String item = input.next();

                if(item  == "camera")
                {
                        newItem = new Camera(type, number);
                }
                else if (item == "lense")
                {
                        newItem = new Lenses(type, number);
                }
                else
                {
                        newItem = new Media (type, number);
                }

                System.out.println("The item you are looking for is:  " + newItem);
        }
}
