import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MusicDetails> musicDetailsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String songTitle = "";
        String songArtist = "";
        int playCount = 0;
        String termination="";
        do {
            /*
             *Menu for choice options
             */
            System.out.println("Enter your choice number:");
            System.out.println("1. Add new song\n" +
                    "2. Delete song\n" +
                    "3. List all songs\n" +
                    "4. List songs as per play count");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    // Choice for adding the song details

                }
                case 2: {
                    //Choice for deleting the song

                }
                case 3: {
                    //Choice for listing the songs

                }
                case 4: {
                    // Choice for listing the songs as per play count
                }
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
            sc.nextLine();
            System.out.println("Do you want to continue?(Y/N)");
            termination=sc.nextLine();
        }while(termination.equals("Y")||termination.equals("y"));
    }
}