
class Student{  
    int id;  
    String name;  
   
    
   public Student(int i,String n)
   {  
    this.id = i;  
    this.name = n;  
    }  
      
   
    public static void main(String args[])
    {  
    Student s1 = new Student(1,"Rahul");  
    Student s2 = new Student(2,"Ram");  
   System.out.println(s1.id+" "+s1.name);
   System.out.println(s2.id+" "+s2.name);
   }  
}   