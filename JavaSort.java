import java.io.*;
import java.util.*;

public class Solution {

    static class Student {
        
        private int id;
        private String name;
        private double cgpa;
        
         Student(int id, String Name, double Cgpa){
            this.id = id;
            this.name = Name;   
            //Put the parameter id into this object's id.
            this.cgpa = Cgpa;
         }
         
            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public double getCgpa() {
                return cgpa;
            }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n =sc.nextInt();
        
        List<Student> students = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();
            
            students.add(new Student(id, name, cgpa));
        }
        
             Collections.sort(students, new Comparator<Student>(){
                
                @Override
                
                public int compare(Student s1, Student s2){
                    
                    int result = Double.compare(s2.getCgpa(), s1.getCgpa());
                    
                    if(result != 0) return result;
                    
                    result = s1.getName().compareTo(s2.getName());
                    
                    if(result != 0) return result;
                    
                    return Integer.compare(s1.getId(), s2.getId());
                }
            });
            
            for(Student student : students){
                System.out.println(student.getName());
            }
            sc.close();
            
    }
}
