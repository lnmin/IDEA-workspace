package com.stx.exercise.p4.Three_LiMin;

 class Group  {
    Member headGroup;
    Member[] members;

     public void showMember(){
         headGroup = members[0];
        System.out.print("我是"+ headGroup.name +"，是我们组的组长，");
        for (int i = 1; i < members.length; i++) {
            System.out.print(members[i].name + " ");
        }
        System.out.println(" 都是我的组员");

    }
    public void setHeadGroup(){
        System.out.print(headGroup);
    }





}
