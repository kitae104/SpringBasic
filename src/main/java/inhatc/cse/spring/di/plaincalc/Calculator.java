package inhatc.cse.spring.di.plaincalc;

public class Calculator {

    public void add(int firstNum, int secondNum){
        System.out.println("add()");
        System.out.println(firstNum + " + " + secondNum  + " = " + (firstNum + secondNum));
    }
    public void sub(int firstNum, int secondNum){
        System.out.println("sub()");
        System.out.println(firstNum + " - " + secondNum  + " = " + (firstNum - secondNum));
    }
    public void mul(int firstNum, int secondNum){
        System.out.println("mul()");
        System.out.println(firstNum + " * " + secondNum  + " = " + (firstNum * secondNum));
    }
    public void div(int firstNum, int secondNum){
        System.out.println("div()");
        System.out.println(firstNum + " / " + secondNum  + " = " + (firstNum / secondNum));
    }
}
