package java102;

import java.util.Scanner;

public class shortgame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        System.out.println("Are you a warrior (\"warrior\") or a sorcerer (\"sorcerer\")?"); // question #1
        String role = scanner.nextLine().toLowerCase();

        try { Thread.sleep(500); } catch (InterruptedException e) {} // had to google how to use time delay, also short delay since less reading
        // i could probably have a helper function for this but i honestly dont know how to yet lol
        
        if (role.equals("warrior")) { 
            System.out.println("As a warrior, you have amplified strength!");
        } else if (role.equals("sorcerer")) {  
            System.out.println("As a sorcerer, you have amplified arcane abilities.");
        } else {
            System.out.println("Invalid choice. Please restart.");
            scanner.close();
            return;
        }

        try { Thread.sleep(2000); } catch (InterruptedException e) {} // longer delay
    
        System.out.println("You encounter a slime! Do you want to \"fight\" or \"flee\"?"); // question #2
        String action = scanner.nextLine().toLowerCase();
        if (action.equals("fight")) {
            System.out.println("You chose to fight!");
        } else if (action.equals("flee")) {
            System.out.println("You chose to flee. The slime chases you away!");
        } else {
            System.out.println("Invalid choice. Please restart.");
        }

        try { Thread.sleep(4000); } catch (InterruptedException e) {} // longer delay

        if (action.equals("fight")) {
            System.out.println("The slime attacks! Do you want to use magic \"arcane\" or brawl it out \"physical\"?"); // question #3
            String combatStyle = scanner.nextLine().toLowerCase();
            if (combatStyle.equals("arcane") && role.equals("sorcerer")) {
                System.out.println("You cast a powerful spell and defeat the slime!");
                gameWon = true;
            } else if (combatStyle.equals("physical") && role.equals("warrior")) {
                System.out.println("You use your strength to overpower the slime!");
                gameWon = true;
            } else {
                System.out.println("It seems you are too weak in this aspect! You are subsumed by the slime.");
                gameWon = false;
            }
        } else if (action.equals("flee")) {
            System.out.println("You may have survived, but what about your honor? \nYou are now the laughing stock of the town for fleeing from a **slime** of all things.");
            gameWon = false;
        }
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); } // short delay before final message


        if (gameWon) {
            System.out.println("Congratulations! You have won as a " + role + "!");
        } else {
            System.out.println("Game over! You lost as a " + role + ".");
        }

        scanner.close();
    }

    }

