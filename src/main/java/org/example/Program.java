package org.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        phoneBook = addNumber(phoneBook, "Гирдюк", "123");
        phoneBook = addNumber(phoneBook, "Битяй", "234");
        phoneBook = addNumber(phoneBook, "Гирдюк", "345");
        phoneBook = addNumber(phoneBook, "Битяй", "456");
        phoneBook = addNumber(phoneBook, "Гирдюк", "567");
        phoneBook = addNumber(phoneBook, "Мижуй", "678");
        phoneBook = addNumber(phoneBook, "Гирдюк", "789");
        phoneBook = addNumber(phoneBook, "Мижуй", "891");
        phoneBook = addNumber(phoneBook, "Битяй", "912");


        System.out.println(phoneBook);

        phoneBook.entrySet()
                 .stream()
                 .sorted(Map.Entry.comparingByValue((o1, o2) -> o2.size() - o1.size()))
                 .forEach(System.out::println);
    }
   public static HashMap addNumber(HashMap<String, ArrayList<String>> phoneBook, String name, String number){
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(number);
        return phoneBook;
    }
}
