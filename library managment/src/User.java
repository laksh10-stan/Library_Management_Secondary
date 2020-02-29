/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akshay
 */
public class User {
    private int id;
    private String name;
    private String enroll;
    private String course;
    private String branch;
    private  byte[] Image;
//Student_ID,Name,Enroll_No,Course,Branch,Year,Image
    private int year;
    private String sem;
    public User(){}
    public User(int Id,String Name, String Enroll,String Course,String Branch,int Year,String Semester,byte[] Image){
        this.id =Id;
     this.name =Name;
    this.enroll =Enroll;
    this.course =Course;
    this.branch =Branch;
    this.Image =Image;
    this.year =Year;
    this.sem =Semester ;
    }

    User(String string) {
        
    }
public int getId(){
    return id;
}
public void setId(int Id){
   this.id=Id;
}
public String getName(){
    return name;
}public void setName(String Name){
   this.name=Name;
}
public String getEnroll(){
    return enroll;
}
public void setEnroll(String Enroll){
   this.enroll=Enroll;
}public String getCourse(){
    return enroll;
}
public void setCourse(String Course){
   this.enroll=Course;
}
public String getBranch(){
    return branch;
}public void setBranch(String Branch){
   this.branch=Branch;
}
public int getYear(){
    return year;
}public void setYear(int Year){
   this.year=Year;
}
public String getSemester(){
    return sem;
} public void setemester(String Semester){
   this.sem=Semester;
}
public byte[] getImage(){
    return Image;
}
}



