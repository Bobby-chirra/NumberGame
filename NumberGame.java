import java.util.*;

class numberGame {
    static Random random = new Random();
    static final int c = random.nextInt(15);

    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Help or any number to start the game");

        int k = 0;
        try {
            k = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Enter Proper value.");
            return;
        }
        
        if(k==1){
                String fullText = "Two Targets: There are TWO secret numbers, you need to escape from them\n" +
                     "Number Range: Both numbers are between 0-14 (inclusive)\n" +
                     "Scoring: Escape from the two secret numbers, score resembles with how many times you escaped from the trap\n" +
                     "Quit Option: Enter 99 to quit the game at any time\n" +
                     "Unlimited Tries: Keep escaping until you win or quit\n" +
                     "Note: these two secret numbers will change for every round,and a secret deadhand number will be activated in Hard level, dont get caught by that.\n"+
                     "enter 9 to start the game";
    
            String[] lines = fullText.split("\n");
            
            try {
                for (String line : lines) {
                    // Typewriter effect for each line
                    for (char c : line.toCharArray()) {
                        System.out.print(c);
                        Thread.sleep(100); // Fast typing effect
                    }
                    System.out.println(); // New line
                    Thread.sleep(500); // Delay between lines
                }
            } catch (InterruptedException e) {
                System.out.println("Error in printing rules.");
            }
                                
            try {
                int j = sc.nextInt();
                if(j==9){
                    System.out.println("Select 0 for Easy && 1 for Hard");

                    int level = sc.nextInt();

                    if(level==0) numberGame();
                    else if(level==1) numberGameHardlevel();
                    else{ 
                        System.out.println("Enter Proper value."); return;
                    }
                    
                }else{
                    System.out.println("Enter Proper value."); return;
                }  
            } 
            catch (Exception e) {
                System.out.println(e +" Enter proper value.");
            }
        }
        else{
            System.out.println("Select 0 for Easy && 1 for Hard ");
            try{
                int level = sc.nextInt();
                if(level == 0) numberGame();
                else if(level == 1) numberGame();
                else System.out.print("Enter proper value!!!");
                }
            catch(Exception e){
                System.out.print("Enter Integer value!!!");
            }
           
        }
        System.out.println("Bye!");
        sc.close();
    }
    
    public static void numberGame(){   

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to NumberGame");
        System.out.println("keep entering numbers in range 1-15 and enter 99 to quit");
        int count = 0;
        while(true) {

            
            int a = random.nextInt(10);
            int b = random.nextInt(10);

            int m = 0;
            try{
                 m = sc.nextInt();
            }
            catch(Exception e){
                String s = sc.next();
                System.out.println(e+"pls enter correct values");
                return;
            }
            
            if(m<0 || m>14){
                System.out.println("Enter values in the range 0-14 ");
                continue;
            }

            if (m == a) {
                System.out.println("Got you " + m);
                sc.close();
                break;
            } else if (m == 99) {
                System.out.println("you quit " + m);
                sc.close();
                break;
            } else if (m == b) {
                System.out.println("Got you " + m); 
                sc.close();
                break;
            }
            else {
                System.out.println("you entered " + m);
                if(Math.max(m,a) - Math.min(m,a) == 2 || Math.max(m,b) - Math.min(m,b) == 2) System.out.println("So closee ");
                else if(Math.abs(m - a) == 1 || Math.abs(m - b) == 1 ) System.out.println("Just Missed ");
            }
            count++;
        }
        System.out.println("Your Score is "+count);
    }

        public static void numberGameHardlevel(){   

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to NumberGame");
        System.out.println("keep entering numbers in range 1-15 and enter 99 to quit");
        int count = 0;
        while(true) {

            
            int a = random.nextInt(10);
            int b = random.nextInt(10);

            int m = 0;
            try{
                 m = sc.nextInt();
            }
            catch(Exception e){
                String s = sc.next();
                System.out.println(e+"pls enter correct values");
                return;
            }
            
            if(m<0 || m>14){
                System.out.println("Enter values in the range 0-14 ");
                continue;
            }

            if (m == a) {
                System.out.println("Got you " + m);
                sc.close();
                break;
            } else if (m == 99) {
                System.out.println("you quit " + m);
                sc.close();
                break;
            } else if (m == b) {
                System.out.println("Got you " + m); 
                sc.close();
                break;
            }
            else if (m == numberGame.c) {       
                System.out.println("Got you " + m); 
                sc.close();
                break;
            } 
            else {
                System.out.println("you entered " + m);
                if(Math.max(m,a) - Math.min(m,a) == 2 || Math.max(m,b) - Math.min(m,b) == 2) System.out.println("So closee ");
                else if(Math.abs(m - a) == 1 || Math.abs(m - b) == 1 || Math.abs(m - numberGame.c) == 1 ) System.out.println("Just Missed ");
                
            }
            count++;
        }
        System.out.println("Your Score is "+count);
    }

    
}
