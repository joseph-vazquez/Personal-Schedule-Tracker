import java.io.*;
import java.util.*;

public class Writer {
    public static void main(String[] args) {
        boolean validOption = false;

        Scanner scanner = new Scanner(System.in);

        UsersName person = new UsersName();

        System.out.println("\n\n\n\nHello User,\n\nPlease type in your preferred name:\n\n\n\n");
        System.out.print("Name: ");
        String nameInput = scanner.nextLine();

        person.setName(nameInput);

        String outputName = person.getName();

        System.out.println("\n\nGot it thank you,");
        System.out.println("So now " + outputName + " how can I help you?");
        System.out.println("Choose from the following Menu");

        while (!validOption) {
            System.out.println(WriterTextFormat.menu());
            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    WriterTextFormat.howTo();
                    System.out.print("Enter your upcoming monday's date for your week: ");
                    scanner.nextLine();
                    String startDate = scanner.nextLine();
                    System.out.print("Now enter the sunday's date of your upcoming week: ");
                    String endDate = scanner.nextLine();
                    System.out.print("Your week is " + startDate + " - " + endDate + "\n\n");
                    System.out.println(WriterTextFormat.breaker());
                    System.out.println(WriterTextFormat.breaker());
                    System.out.print("\nNow lets start off with Monday: ");
                    System.out
                            .print("\nWhat is the main event that you are planing on remembering for your schedule: ");
                    String mActivity = scanner.nextLine();
                    System.out.print("\nNow lets put the time that your activity starts");
                    System.out.print("\nEx. \"8:30 PM\" or \"All Day\"\nTime: ");
                    String mTime = scanner.nextLine();
                    System.out
                            .print("\nLastly lets put some notes for monday, if you dont have any just press enter: \n");
                    String mNotes = scanner.nextLine();

                    System.out.print("\nTuesday ");
                    System.out.print("\nActivity: ");
                    String tActivity = scanner.nextLine();
                    System.out.print("Time: ");
                    String tTime = scanner.nextLine();
                    System.out.print("Notes: ");
                    String tNotes = scanner.nextLine();
                    System.out.print("\nWednesday ");
                    System.out.print("\nActivity: ");
                    String wActivity = scanner.nextLine();
                    System.out.print("Time: ");
                    String wTime = scanner.nextLine();
                    System.out.print("Notes: ");
                    String wNotes = scanner.nextLine();
                    System.out.print("\nThursday ");
                    System.out.print("\nActivity: ");
                    String thActivity = scanner.nextLine();
                    System.out.print("Time: ");
                    String thTime = scanner.nextLine();
                    System.out.print("Notes: ");
                    String thNotes = scanner.nextLine();
                    System.out.print("\nFriday ");
                    System.out.print("\nActivity: ");
                    String fActivity = scanner.nextLine();
                    System.out.print("Time: ");
                    String fTime = scanner.nextLine();
                    System.out.print("Notes: ");
                    String fNotes = scanner.nextLine();
                    System.out.print("\nSaturday ");
                    System.out.print("\nActivity: ");
                    String sActivity = scanner.nextLine();
                    System.out.print("Time: ");
                    String sTime = scanner.nextLine();
                    System.out.print("Notes: ");
                    String sNotes = scanner.nextLine();
                    System.out.print("\nSunday ");
                    System.out.print("\nActivity: ");
                    String suActivity = scanner.nextLine();
                    System.out.print("Time: ");
                    String suTime = scanner.nextLine();
                    System.out.print("Notes: ");
                    String suNotes = scanner.nextLine();

                    String fileName = outputName + "'s Schedule.txt";

                    try (FileWriter writer = new FileWriter(fileName)) {

                        writer.write(WriterTextFormat.breaker());
                        writer.write(
                                "\n" +
                                        outputName +
                                        "'s Schedule from (" +
                                        startDate +
                                        ") - (" +
                                        endDate +
                                        "): " +
                                        "\n");

                        writer.write(WriterTextFormat.monday());
                        writer.write("\nActivity: " + mActivity + "\nTime: " + mTime + "\nNotes: " + mNotes + "\n");
                        writer.write(WriterTextFormat.tuesday());
                        writer.write("\nActivity: " + tActivity + "\nTime: " + tTime + "\nNotes: " + tNotes + "\n");
                        writer.write(WriterTextFormat.wednesday());
                        writer.write("\nActivity: " + wActivity + "\nTime: " + wTime + "\nNotes: " + wNotes + "\n");
                        writer.write(WriterTextFormat.thursday());
                        writer.write("\nActivity: " + thActivity + "\nTime: " + thTime + "\nNotes: " + thNotes + "\n");
                        writer.write(WriterTextFormat.friday());
                        writer.write("\nActivity: " + fActivity + "\nTime: " + fTime + "\nNotes: " + fNotes + "\n");
                        writer.write(WriterTextFormat.saturday());
                        writer.write("\nActivity: " + sActivity + "\nTime: " + sTime + "\nNotes: " + sNotes + "\n");
                        writer.write(WriterTextFormat.sunday());
                        writer.write("\nActivity: " + suActivity + "\nTime: " + suTime + "\nNotes: " + suNotes + "\n");
                        writer.write(WriterTextFormat.breaker());

                        System.out.println("\nSuccessfully wrote to the file: " + fileName);
                        System.out.println("Thank you for using my schedule builder :) \n\n");

                    } catch (IOException e) {
                        System.out.println("An error has occurred while writing to the file, Sorry :( )");
                        e.printStackTrace();
                    }

                    validOption = true;
                    break;
                case 2:
                    System.out.println(WriterTextFormat.why());
                    break;
                case 3:
                    System.out.println("Good Bye\n:)\n");
                    validOption = true;
                    System.exit(0);
                    break;
                case 20604:
                    System.out.println("Hey thats my birthday!\n\n-JV");
                    break;
                default:
                    System.out.println(
                            "What you entered was a invalid option.\nPlease try again and select a valid number.");
            }
        }
        scanner.close();
    }
}