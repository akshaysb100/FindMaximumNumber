package com.maximumnumber.com;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMaximumNumber<T extends Comparable> {

    T maximumNumber;
    T[] valueArr;

   public FindMaximumNumber(T... val) {
        T[] array=(T[]) new  Comparable[val.length];
        int i=0;
        for(T c:val){
            array[i]=c;
            i++;
        }
        this.valueArr = array;
    }

    public T check(){

      Arrays.sort(valueArr);
      printMaximumValue(valueArr[valueArr.length-1]);
      return valueArr[valueArr.length-1];
    }

    public void printMaximumValue(T maximumNumber){
        System.out.println("Maximum value is : "+maximumNumber);
    }
}
