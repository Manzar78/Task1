/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

/**
 *
 * @author Dell
 */
public class Teacher extends Human {
   
    
    
    @Override
    void Speak(){
        System.out.println("He will speak about the subjects");
   }
    @Override
    void See(){
        System.out.println("The students present in class");
    }
    
    public static void main(String[] args) {
            System.out.println("    LAB ENGINEER");
        Lab_Engineer obj = new Lab_Engineer();
        obj.Speak();
        obj.See();
        
        System.out.println("    STUDENT");
        Student obj1 = new Student();
        obj1.See();
        obj1.Speak();
        
        System.out.println("    TEACHER");
        Teacher obj2 = new Teacher();
        obj2.See();
        obj2.Speak();
    }
    
}
