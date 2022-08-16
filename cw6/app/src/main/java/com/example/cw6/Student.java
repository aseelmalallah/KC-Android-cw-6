package com.example.cw6;

public class Student {

   private String studentName;
   private int studentAge;
   private int studentGrade;
   private int studentImg;

   public Student(String studentName, int studentAge, int studentGrade, int studentImg) {
      this.studentName = studentName;
      this.studentAge = studentAge;
      this.studentGrade = studentGrade;
      this.studentImg = studentImg;
   }

   public String getStudentName() {
      return studentName;
   }

   public int getStudentAge() {
      return studentAge;
   }

   public int getStudentGrade() {
      return studentGrade;
   }

   public int getStudentImg() {
      return studentImg;
   }

   public void setStudentName(String studentName) {
      this.studentName = studentName;
   }

   public void setStudentAge(int studentAge) {
      this.studentAge = studentAge;
   }

   public void setStudentGrade(int studentGrade) {
      this.studentGrade = studentGrade;
   }

   public void setStudentImg(int studentImg) {
      this.studentImg = studentImg;
   }
}

