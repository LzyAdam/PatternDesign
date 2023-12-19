package com.Template.eg2;

public class DeisgnPattern extends AClass {
    private boolean flag;

    public DeisgnPattern(boolean flag) {
        this.flag = flag;
    }

    @Override
    protected boolean flag() {
        return this.flag();
    }

    @Override
    public void isMakeNote() {
        System.out.println("design pattern coed");
    }
}
