package com.stx.zzyb.Day0305.elephantdemo;

public class Refrigerator {
    private Elephant elephant;

    public Elephant getElephant() {
        System.out.println("取出");
        return elephant;
    }

    public void setElephant(Elephant elephant) {
        System.out.println("放进来");
        this.elephant = elephant;
    }

   public void open(){
       System.out.println("冰箱打开了");
   }
    public void close(){
        System.out.println("冰箱关闭了");
    }
}
