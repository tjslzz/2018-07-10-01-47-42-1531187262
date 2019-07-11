package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
//        return arrayList.stream().mapToInt(i -> i * 3 + 2).sum();
        return arrayList.stream().reduce(0,(pre,cur) ->pre+cur*3+2);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        List<Integer> list = new ArrayList<>();
//        for(int i : arrayList) list.add(i % 2 == 0 ? i : i * 3 + 2);
//        return list;
        return arrayList.stream().map((item) -> item % 2 == 0 ? item : item * 3 + 2 ).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(i->i % 2 != 0).mapToInt(i->i*3+5).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(i->i % 2 == 0).mapToDouble(i->i).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
