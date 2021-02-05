package com.company;

public class Levels {
   public static final Levels LEVEL100 = new Levels(1);
   public static final Levels LEVEL200 = new Levels(2);
   public static final Levels LEVEL300 = new Levels(3);
   public static final Levels LEVEL400 = new Levels(4);

   private int theLevel;
   private String [] levelNames = {"","level 100", "level 200", "level 300", "level 400"};

   private Levels(int l){
       theLevel = l;
   }

   public String toString(){
       return levelNames[theLevel];
   }

}
