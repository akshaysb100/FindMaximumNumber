package com.maximumnumber.com;

public class FindMaximumNumber<T extends Comparable> {


    T maximumNumber;
    T value1;
    T value2;
    T value3;

    public FindMaximumNumber(T value1,T value2,T value3){
        this.value1 =value1;
        this.value2 =value2;
        this.value3 =value3;
    }

    public T toMaximumNumber(){
        return  checkGenericMax(value1,value2,value3);
    }
    public T checkGenericMax(T value1,T value2,T value3) {

        if(value1.compareTo(value2)>0 && value1.compareTo(value3)>0){
            maximumNumber= value1;
        }else if (value2.compareTo(value3)>0){
            maximumNumber= value2;
        }else {
            maximumNumber= value3;
        }
        printMaximumValue(maximumNumber);
        return maximumNumber;
    }

    public void printMaximumValue(T maximumNumber){
        System.out.println("Maximum value is : "+maximumNumber);
    }
}
