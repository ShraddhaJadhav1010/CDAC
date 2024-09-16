package Demo4.org;

class Student 
{
   String name;
   int age;
   int rollnum;
   String bloodgrp;

   public Student( String name,int age,int rollnum, String bloodgrp)
   {
      this.name = name;
      this.age = age;
      this.rollnum = rollnum;
      this.bloodgrp= bloodgrp;
   }
}

public class Main {
    public static void main(String[] args)
    {
        Student st = new Student("SHRADDHA", 24, 20,"AB +ve");
        System.out.println(st.name);
        System.out.println(st.age);
        System.out.println(st.rollnum);
        System.out.println(st.bloodgrp);
    }
}