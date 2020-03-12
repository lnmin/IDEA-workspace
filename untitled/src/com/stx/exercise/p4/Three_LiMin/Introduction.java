package com.stx.exercise.p4.Three_LiMin;

public class Introduction {
    public static void main(String[] args) {
        //加载班级成员信息
        Member m1 = new Member("剑晨沐","打篮球");
        Member m2 = new Member("宫亦飞","唱歌");
        Member m3 = new Member("枫亦轩","睡觉");
        Member m4 = new Member("南宫亦痕","敲代码");
        Member m5 = new Member("百里旋日","跑步");
        Member m6 = new Member("夜雨泽","画画");
       //在班里设置两个组
        Group g1 = new Group();
        Group g2 = new Group();
        //给成员分组
        g1.members = new Member[]{m1,m2,m3};
        g2.members = new Member[]{m4,m5,m6};
        //创建班级
        JavaClass jc = new JavaClass();
        //把组加到班级里
        jc.groups = new Group[]{g1,g2};

//       组长小组情况介绍
        g1.showMember();
        g2.showMember();
//        班长介绍班级总体情况
        jc.showClass();
//        组员轮流介绍
        m1.oneselfInfo();
        m2.oneselfInfo();
        m3.oneselfInfo();
        m4.oneselfInfo();
        m5.oneselfInfo();
        m6.oneselfInfo();


    }

}
