/**
 * Number Pairs
 * https://www.codeeval.com/open_challenges/34/
 *
 * Author: todyerutz@plainintricacy.wordpress.com
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Tudor/IdeaProjects/NumberPairs/src/numbers.txt"));
        String line;
        while((line=reader.readLine())!=null) {
            printPair(line);
        }
        reader.close();
    }

    public static void printPair(String q) {
        String num = q.substring(q.indexOf(";") + 1, q.length());
        q = q.substring(0, q.indexOf(";") - 1);
        String[] nums = q.split(",");
        List<String> lt = new ArrayList<String>();
        for (String i : nums) {
            lt.add(i);
        }
        int i=0;
        do{
            for (int j = i; j < lt.size(); j++) {
                if (Integer.parseInt(lt.get(i)) + Integer.parseInt(lt.get(j)) == Integer.parseInt(num)) {
                    System.out.println(num + " = " + lt.get(i) + "+" + lt.get(j));
                    lt.remove(j);
                    lt.remove(i);
                    i=-1;
                }
            }
            i++;
        }while(i<lt.size()-1);
        System.out.println();
    }
}
