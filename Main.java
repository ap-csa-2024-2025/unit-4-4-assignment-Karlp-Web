import java.util.Scanner;

public class Main
{
//   public static void main(String[] args)
//   {
//     String sentence = "peter piper picked a pack of pickle peppers";
//     int count = 0;
//     for (int i = 0; i < sentence.length() - 1; i++)
//    {
//       String pair = sentence.substring(i, i+2);
//       if (pair.equals("pa") || pair.equals("pe") || pair.equals("po") || pair.equals("pi"))
//  2     {
//         count++;
//        }
//       System.out.println("p followed by a vowel appears" + count + "times");
//    }
//   } 

  public static void main(string[] args)
  {
    String s1 = "balloon";
    String s2 = "atrophy";
    String output = "";

    if (s1.length() == s2.lenght())
    {
      for (int i - s2.length()-1; i >= 0; i--)
      {
        String L1 = s1.substring(i, i + 1);
        String L2 = s2.substring(i, i + 1);
        output += (L2 + L1);
      }
    }
  }
}

