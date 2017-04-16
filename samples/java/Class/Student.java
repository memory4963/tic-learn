
public class Student extends Person{
    
    public String studentId;
    public String grade;
    
    public Student(String name,int age,String studentId,String grade){
        super(name,age);
        this.studentId=studentId;
        this.grade=grade;
    }
    
    @Override
    public String toString(){
        return "Student-> name:"+name+",age:"+age+",studentId:"+studentId+",grade:"+grade;
    }
    
}