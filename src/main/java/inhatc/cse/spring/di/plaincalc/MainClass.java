package inhatc.cse.spring.di.plaincalc;

public class MainClass {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        myCalculator.setCalculator(new Calculator());       // 직접 객체 생성
        myCalculator.setFirstNum(10);
        myCalculator.setSecondNum(2);

        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();
    }
}
