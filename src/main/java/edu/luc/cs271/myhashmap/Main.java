package edu.luc.cs271.myhashmap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException, FileNotFoundException {
    // set up the scanner so that it separates words based on space and punctuation

    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
//    Path path = Paths.get(System.getProperty("user.dir")).resolve("C:\\Users\\di\\IdeaProjects\\lab11-lab9-ywang83\\src\\main\\java\\edu\\luc\\cs271\\myhashmap\\lesmisrables01unkngoog_djvu.txt");
//    final Scanner input = new Scanner(new FileReader(path.toFile()));

    // TODO measure the performance for MyHashMap, HashMap, and TreeMap several times each!
    final Map<String, Integer> counts = new MyHashMap<>(6007); // a prime number!
//    final TreeMap<String, Integer> counts = new TreeMap<String, Integer>(); // a prime number!
//    final Map<String, Integer> counts = new HashMap<>(6007); // a prime number!

    final long time0 = System.currentTimeMillis(); // current time

    while (input.hasNext()) {
      final String word = input.next();
      final Integer count = counts.get(word);
      counts.put(word, count == null ? 1 : count + 1);
    }

    final ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<>(counts.size());
    arr.addAll(counts.entrySet());

    System.out.println(
        "time in ms: " + (System.currentTimeMillis() - time0)); // time elapsed since above

    Collections.sort(arr, new DescendingByCount());

    for (int i = 0; i < 10 && i < arr.size(); i += 1) {
      System.out.println(arr.get(i));
    }
  }
}
