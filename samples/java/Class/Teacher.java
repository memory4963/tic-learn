
public class Teacher extends Person{
    
    public int wage;
    
    public Teacher(String name,int age,int wage){
        super(name,age);
        this.wage=wage;
    }
    
    @Override
    public String toString(){
        return "Teacher-> name:"+name+",age:"+age+",wage:"+wage;
    }
    
}