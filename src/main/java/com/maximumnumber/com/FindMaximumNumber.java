package com.maximumnumber.com;

public class FindMaximumNumber {

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
}
