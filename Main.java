import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String sentence = "peter piper picked a pack of pickle peppers";
    int count = 0;
    for (int i = 0; i < sentence.length() - 1; i++)
    {
      String pair = sentence.substring(i, i+2);
      if (pair.equals("pa") || pair.equals("pe") || pair.equals("po") || pair.equals("pi"));
 2     {
        count++;
      }
      System.out.println("p followed by a vowel appears" + count + "times");
    }
  }

  public static boolean isPrime(int N)
  {
    // TODO: Replace and write your code below
    return false;
  }
}
