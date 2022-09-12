package com.conterry.sorting.solution;

import java.util.List;
import java.util.stream.Collectors;

public class CharactersList {

    public static List<Character> deleteAllNotLettersAndNums(List<Character> list){
        List<Character> newList = list.stream()
                .filter(v -> rightCharactersCondition(v))
                .collect(Collectors.toList());
        return newList;
    }

    private static boolean rightCharactersCondition(Character ch){
        char charValue = ch.charValue();
        if(Character.isDigit(charValue) || Character.isAlphabetic(charValue)){
            return true;
        }
        else return false;

    }

    public static String prettyPrint(List<Character> list){
        StringBuffer sb = new StringBuffer();
        list.stream().forEach(a -> sb.append(a));
        return sb.toString();
    }

}
