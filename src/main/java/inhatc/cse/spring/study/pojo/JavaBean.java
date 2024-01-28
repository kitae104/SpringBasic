package inhatc.cse.spring.controller.study.pojo;

import java.io.Serializable;

public class JavaBean implements Serializable {  //EJB
    public JavaBean(){

    }
    private String text;
    private int number;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
