package org.example;
import java.util.*;

public class Main {
 static void array_list() {
  ArrayList<Integer> li = new ArrayList<Integer>();
  li.add(1);
  li.add(34);
  li.add(4);
  li.add(16);
  System.out.println(li);
  System.out.println(li.get(1));
  System.out.println(li.isEmpty());
  System.out.println(li.size());
  Collections.sort(li);
  System.out.println(li);
  for (Integer x : li) {
   System.out.print(x + " ");
  }
  System.out.println();
  List x = new ArrayList();
  x.add(12);
  x.add("Ram");
  System.out.println(x);
 }

 public static void main(String[] args) {
  array_list();

  List<List<Integer>> li = new ArrayList<>();
  List x = new ArrayList();
  x.add(23);
  x.add(25);
  li.add(x);

  List y = new ArrayList();
  y.add(23);
  y.add(25);
  li.add(y);
  System.out.println(li);
 }
}
