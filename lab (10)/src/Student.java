public class Student {
    private String name;
    private int course;

    public  Student(String Name,int Course){
        this.name = Name;
        this.course = Course;
    }

    public String getName(){
        return name;
    }

    public int getCourse(){
        return course;
    }
}
