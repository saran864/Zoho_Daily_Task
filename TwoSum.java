import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    

      Set<Character> hs=new HashSet<Character>();
      Set<Character> hs1=new HashSet<Character>();
            char [] sc1=s1.toCharArray();
            char [] sc2=s2.toCharArray();
   
  
      for(char i : sc1)
      {
          hs.add(i);
      }
      for(char i : sc2)
      {
          hs1.add(i);
      }
      Set<Character> mergeSet=new HashSet<Character>();
    mergeSet.addAll(hs);
    mergeSet.addAll(hs1);
    return (hs.size()+hs1.size()==mergeSet.size() ? "NO": "YES");
}
    
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s1 = bufferedReader.readLine();

                String s2 = bufferedReader.readLine();

                String result = Result.twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
