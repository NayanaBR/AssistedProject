package Returntypes;
public class Student
{
} 
class Employee 
{ 
 } 
 class School 
{ 
  Student m1()
  { 
   System.out.println("m1 method"); 
   Student st = new Student(); // Line 1
    return st; // Line 2
 } 
  Employee m2()
  { 
    System.out.println("m2 method"); 
    Employee emp = new Employee(); // Line 3 
     return emp; // Line 4  
    } 
   static String m3()
   { 
     System.out.println("Nayana"); 
     return "Nayana"; 
   } 
public static void main(String[] args) 
{ 
   School sc = new School(); 
     Student s = sc.m1(); 
     System.out.println(s); 
     Employee e = sc.m2(); 
     System.out.println(e); 
     String str=School.m3(); 
     System.out.println(str); 
   }
 }