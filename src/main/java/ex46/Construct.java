package ex46;
import java.io.File;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Construct
{
    public static class Word
    {
        public String word;
        public int frequency;

        public static Comparator<Word> COMPARE_BY_FREQ = new Comparator<Word>() {
            public int compare(Word first, Word next) {
                return Integer.compare(next.frequency, first.frequency);
            }
        };

    }

    public final ArrayList<Word> List = new ArrayList<>();

    public void findQuantity() throws FileNotFoundException
    {
        File ifp = new File("src/main/java/ex46/exercise46_input.txt");
        Scanner in = new Scanner(ifp);
        while(in.hasNext())
        {
            totalNum(in.next());
        }
    }

    private void totalNum(String input){
        //loop through and find word and add +1 to frequency
        for(Word tmp :List){
            if(tmp.word.equalsIgnoreCase(input)){
                tmp.frequency++;
                return;
            }
        }
        //if word not found then add it
        addWord(input);
    }

    private void addWord(String input)
    {
        Word newWord = new Word();
        newWord.word = input;
        newWord.frequency = 1;
        List.add(newWord);
    }

    public void printNum()
    {
        for(Word check:List)
        {
            System.out.print(String.format("%-10s",(check.word+":")));
            for(int i=0;i<check.frequency;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public void Sort()
    {
        Collections.sort(List,Word.COMPARE_BY_FREQ );
    }
}


