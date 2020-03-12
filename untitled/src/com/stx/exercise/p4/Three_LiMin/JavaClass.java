package com.stx.exercise.p4.Three_LiMin;

 class JavaClass {
    Group[] groups;
    Member headClass;

     public void showClass(){
        headClass = groups[0].members[1];
        System.out.println("我的名字是 "+ headClass.name +"，是班级里面的班长" );
        System.out.println("我们是一个由"+ groups.length +"个组构成的集体，每位同学的名字是：");
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].members.length; j++) {
                System.out.print(groups[i].members[j].name + " ");
            }
            System.out.println();
        }
        System.out.println("其中 ");
        for (int i = 0; i < groups.length; i++) {
            System.out.print(groups[i].headGroup.name + " ");
        }
        System.out.println(" 担任班级小组组长");
    }


 }
