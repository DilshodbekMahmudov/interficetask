package com.lesson.interfacetask;

public class BaseConverter implements Converter{
    @Override
    public double convertToKelvin(double celsius) {
      return celsius + 273.15;
    }

    @Override
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9/5)+32;
    }

    public static void main(String[] args) {

        Converter converter=new BaseConverter();
        double kelvinValue=converter.convertToKelvin(25);
        double fahrenheitValue=converter.convertToFahrenheit(25);

        System.out.println(kelvinValue);
        System.out.println(fahrenheitValue);
    }

    }
