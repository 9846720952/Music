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
                    MusicDetails musicDetails = new MusicDetails();
                    sc.nextLine();
                    System.out.println("Enter song tile:");
                    songTitle = sc.nextLine();
                    System.out.println("Enter song artist:");
                    songArtist = sc.nextLine();
                    System.out.println("Enter song play count:");
                    playCount = sc.nextInt();
                    musicDetails.setSongTitle(songTitle);
                    musicDetails.setSongArtist(songArtist);
                    musicDetails.setPlayCount(playCount);
                    musicDetailsList.add(musicDetails);
                    break;
                }
                case 2: {
                    //Choice for deleting the song
                    sc.nextLine();
                    System.out.println("Enter song title to delete:");
                    String songTitleToDelete = sc.nextLine();
                    System.out.println("Are you sure?(Y/N)");
                    String confirm = sc.nextLine();
                    if (confirm.equals("Y") || confirm.equals("y")){
                        musicDetailsList.removeIf(m -> m.getSongTitle().equals(songTitleToDelete));
                        break;
                    }
                    break;
                }
                case 3: {
                    //Choice for listing the songs
                    if (musicDetailsList.isEmpty()) {
                        System.out.println("You need to add songs first!");
                    } else {
                        System.out.println("Song Title\t\t\t\t\tArtist Name\t\t\t\t\tPlay Count");
                        for (MusicDetails m : musicDetailsList
                        ) {
                            System.out.println(m.getSongTitle() + "\t\t\t\t\t" + m.getSongArtist() + "\t\t\t\t\t" + m.getPlayCount());
                        }
                    }
                    break;
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