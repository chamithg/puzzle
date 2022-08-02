import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava{
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomArray = new ArrayList<Integer>();
        Random rand = new Random();
        for(int i = 1; i<=10;i++){
            randomArray.add(rand.nextInt(20)+1);
        }

        return randomArray;

        
    }

    public Char getRandomLetter(){
        ArrayList<Character> alphabet = new ArrayList<Character>();
    }
}