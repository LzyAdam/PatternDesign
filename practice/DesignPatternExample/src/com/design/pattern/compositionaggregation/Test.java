package com.design.pattern.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        WxNotify wxNotify= new WxNotify();
        Parent parent = new Parent();
        teacher.setNotify(wxNotify);
        wxNotify.setParent(parent);
        //wxNotify.wxNotify();
        teacher.call();


       // teacher.call();



    }
}
