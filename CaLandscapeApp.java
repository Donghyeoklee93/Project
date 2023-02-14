/*
 * CaLandscapeApp.java
 * @author Donghyeok.Lee
 * 27/11/2022
 */
import javax.swing.JOptionPane;

public class CaLandscapeApp {

    public static void main(String args[]) {
        // declare variables
        int i = 0;
        int option = 0;

        String arrName[];
        arrName = new String[100];

        String arrLocation[];
        arrLocation = new String[100];

        String arrDay[];
        arrDay = new String[100];

        String answer;

        // declare objects
        CaFirstLast myFirstLast;
        CaAverHigh myAverHigh;

        // create objects
        myFirstLast = new CaFirstLast();
        myAverHigh = new CaAverHigh();

        while (option != 6) {
            option = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Application Menu - Item Type: Landscape"
                            + "\n1 - Add an item."
                            + "\n2 - Display the details of the first entered item."
                            + "\n3 - Display the details of the last entered item."
                            + "\n4 - Calculate and display the average value of the mandatory state of all the items entered until that point."
                            + "\n5 - Calculate and display the item with the highest mandatory state."
                            + "\n6 - Exit application."
                            + "\nEnter your choice:"));

            if (option == 1) {
                arrName[i] = JOptionPane.showInputDialog(null, "Enter the project name.");
                arrLocation[i] = JOptionPane.showInputDialog(null, "Enter the project location.");
                arrDay[i] = JOptionPane.showInputDialog(null, "Enter the execution time(Day) of the project.");
                while ((Integer.parseInt(arrDay[i]) < 2 || Integer.parseInt(arrDay[i]) > 42)) {
                    arrDay[i] = JOptionPane.showInputDialog(null,
                            "Invalid mandatory state! Please enter the execution time of the project again.");
                }
                i = i + 1;
            }

            else if (option == 2) {
                // input
                myFirstLast.setName(arrName);
                myFirstLast.setLocation(arrLocation);
                myFirstLast.setDay(arrDay);

                // process
                myFirstLast.First();

                // output
                answer = myFirstLast.getAnswer();
                JOptionPane.showMessageDialog(null, answer);
            }

            else if (option == 3) {
                // input
                myFirstLast.setName(arrName);
                myFirstLast.setLocation(arrLocation);
                myFirstLast.setDay(arrDay);

                // process
                myFirstLast.Last();

                // output
                answer = myFirstLast.getAnswer();
                JOptionPane.showMessageDialog(null, answer);
            }

            else if (option == 4) {
                // input
                myAverHigh.setName(arrName);
                myAverHigh.setLocation(arrLocation);
                myAverHigh.setDay(arrDay);

                // process
                myAverHigh.Aver();

                // output
                answer = myAverHigh.getAnswer();
                JOptionPane.showMessageDialog(null, answer);
            }

            else if (option == 5) {
                // input
                myAverHigh.setName(arrName);
                myAverHigh.setLocation(arrLocation);
                myAverHigh.setDay(arrDay);

                // process
                myAverHigh.High();

                // output
                answer = myAverHigh.getAnswer();
                JOptionPane.showMessageDialog(null, answer);
            }

            else if (option == 6) {
                JOptionPane.showMessageDialog(null, "Thank you! Bye.");
            }

            else {
                JOptionPane.showMessageDialog(null, "You chose incorrect number. Please select again.");

            }
        }
    }
}
