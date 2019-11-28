package com.maximumnumber.com;

public class FindMaximumNumber<T> {

    Integer number1=2;
    Integer number2=1;
    Integer number3=3;

    public int checkIntegerMax() {

        Integer maximumNumber;
        if(number1.compareTo(number2)>0 && number1.compareTo(number3)>0){
            maximumNumber=number1;
        }else if (number2.compareTo(number3)>0){
            maximumNumber=number2;
        }else {
            maximumNumber=number3;
        }
        return maximumNumber;
    }

    Float floatNumber1=2f;
    Float floatNumber2 =1f;
    Float floatNumber3 =3f;

    public Float checkFloatMax() {

        Float maximumNumber;
        if(floatNumber1.compareTo(floatNumber2)>0 && floatNumber1.compareTo(floatNumber3)>0){
            maximumNumber=floatNumber1;
        }else if (floatNumber2.compareTo(floatNumber3)>0){
            maximumNumber= floatNumber2;
        }else {
            maximumNumber= floatNumber3;
        }
        return maximumNumber;
    }

    String string1 ="aakshay";
    String string2 ="dklsf";
    String string3 ="fsdg";

    public String checkStringMax() {

        String maximumNumber;
        if(string1.compareTo(string2)>0 && string1.compareTo(string3)>0){
            maximumNumber= string1;
        }else if (string2.compareTo(string3)>0){
            maximumNumber= string2;
        }else {
            maximumNumber= string3;
        }
        return maximumNumber;
    }

    T[] checkMaximumNumber;

    public T checkGenericMax(T value1,T value2,T value3) {

        T maximumNumber;
        if(value1.hashCode()>value2.hashCode() && value1.hashCode()>value3.hashCode()){
            maximumNumber= value1;
        }else if (value2.hashCode()>value3.hashCode()){
            maximumNumber= value2;
        }else {
            maximumNumber= value3;
        }
        return maximumNumber;
    }

}
