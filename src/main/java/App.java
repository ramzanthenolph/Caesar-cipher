import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean menu = true;
        System.out.println("********************** CAESAR CIPHER **********************\n" + "Welcome to Caesar Cipher,  Where you can Encrypt & Decrypt information\n");

        while(menu){
            System.out.println("What do you want to do? Input a number\n" + "1: Encrypt\n" + "2: Decrypt\n" + "3: Exit");
            int menuSelect = input.nextInt();
            input.nextLine();

            if(menuSelect ==1){
                System.out.println("Enter your plain text to be encrypted");
                String userInput = input.nextLine();
                System.out.println("In which direction do you want to encrypt your information? Right or Left. ");
                String direction = "";

                boolean validDirection = true;
                while(validDirection){
                    direction = input.nextLine();
                    if(!direction.equalsIgnoreCase("right") && !direction.equalsIgnoreCase("left")){
                        System.out.println("Please select a direction by typing left or right");
                    }
                    else {
                        validDirection = false;
                    }
                }
            }
        }
    }
}
