package com.conterry.sorting.solution;

import org.junit.jupiter.api.extension.Extensions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

    public static String sort(String unsortedString){

        List<Character> listOfChars = unsortedString
                .chars()
                .mapToObj(m -> (char)m)
                .collect(Collectors.toList());


        listOfChars = CharactersList.deleteAllNotLettersAndNums(listOfChars);
        bubbleSort(listOfChars);
        replaceNumsToTheEnd(listOfChars);

        return CharactersList.prettyPrint(listOfChars);
    }

    private static void replaceNumsToTheEnd(List<Character> listOfChars) {
        int endPositionOfNums = 0;
        int i = 0;
        List<Character> listToMove = new ArrayList<>();
        while(Character.isDigit(listOfChars.get(i))){
            listToMove.add(listOfChars.get(i));
            i++;
        }
        listOfChars.removeAll(listToMove);
        listOfChars.addAll(listToMove);
    }

    private static void bubbleSort(List<Character> chars){

        for(int i=0; i<chars.size(); i++){
            for(int j=1; j<chars.size(); j++){
                if((int)chars.get(j)<(int)chars.get(j-1)){
                    Character rez = chars.get(j);
                    chars.set(j, chars.get(j-1));
                    chars.set(j-1, rez);
                }
            }
        }

    }

}
