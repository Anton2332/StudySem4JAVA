import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<Student>();
            students.add(new Student("Антон",2));
            students.add(new Student("Іван",2));
            students.add(new Student("Віктор",3));
            students.add(new Student("Олег",1));
            students.add(new Student("Максим",2));
            students.add(new Student("Сергій",3));
            students.add(new Student("Микола",2));
            students.add(new Student("Денис",4));
            students.add(new Student("Ірина",3));
            students.add(new Student("Саша",1));

            printStudents(students,2);

        }

        private static void printStudents(ArrayList<Student> students,int course){
            ListIterator<Student> iter = students.listIterator();
            while(iter.hasNext()){
                Student item = iter.next();
                if(item.getCourse() == course)
                    System.out.println(item.getName());
            }
        }

}