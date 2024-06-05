import java.util.Random;
import java.util.Scanner;
class Game{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        String[] options={"rock","paper","scissors"};
        System.out.println("Lets play Rock,Paper and Scissors game!!!");
        System.out.println("Enter your choice(rock,paper or scissors)");
        String choice=s.nextLine().toLowerCase();
        if(!choice.equals("rock")&&!choice.equals("paper")&&!choice.equals("scissors")){
            System.out.println("Invalid Choice ! Choose Again!!!");
        }
        int index=r.nextInt(3);
        String computerChoice=options[index];
        if(choice.equals(computerChoice)){
            System.out.println("Its a tie!!!");
        }
        else if(choice.equals("rock")&&computerChoice.equals("scissors")||choice.equals("scissors")&&computerChoice.equals("paper")||choice.equals("paper")&&computerChoice.equals("rock")){
            System.out.println("You Win!!!");
        }
        else{
            System.out.println("Computer Wins!!!");
        }
    }
}