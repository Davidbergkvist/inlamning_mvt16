package se.bergkvist;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class App
{
    //getLongestLineLength
    public static int getLongestLineLength(ArrayList<String> x)
    {
        int longest = 0;
        for (String s : x)
        {
            if (s.length() > longest)
            {
                longest = s.length();
            }
        }
        return longest;
    }
    //indexMenu
    public static String indexMenu(ArrayList<String> x)
    {
        String s = "";
        int sCount = 0;
        for (String y : x)
        {
            sCount++;
            s += sCount + ". " + y + "\n";
        }
        return s;
    }
    //recursion
    public static int recursion(int x)
    {
        if (x == 1) return 1;
        return x * recursion(x-1);
    }
    //repeatChar
    public static String repeatChar(char c, int x)
    {
        String result = "";
        for (int j = 0; j < x; j++) {
            result += c;
        }
        return result;
    }
    //split
    public static ArrayList<String> split(String input, String inputSplitPoint)
    {
        ArrayList<String> split = new ArrayList<String>();
        for (String parts : input.split(inputSplitPoint))
        {
            split.add(parts);
        }
        return split;
    }
    //counterstring
    public static String counterString (int x)
    {
        ArrayList<String> counterList = new ArrayList<String>();
        counterList.add(Integer.toString(x));
        counterList.add("*");
        int counter = x;
        for (int i = 0; 0 < counter; i++) {
            String temp = Integer.toString(counter);
            counter = counter - (1 +temp.length());
            counterList.add(Integer.toString(counter));
            counterList.add("*");
        }
        String sortedArrayResults = "";
        Collections.reverse(counterList);
        for (String parts : counterList)
        {
            sortedArrayResults += parts;
        }
        return sortedArrayResults.substring(sortedArrayResults.length() - x);
    }

    public static void main( String[] args ) throws IOException
    {
        //Counterstring
        System.out.println("Sista siffran i talet betonar antal tecken i strängen.");
        System.out.print("Mata in en siffra: ");
        Scanner input = new Scanner(System.in);
        System.out.println(counterString(input.nextInt()));
    }
}
