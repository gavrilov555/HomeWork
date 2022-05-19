package lesson5;


import lesson5.Util.Util;
import lesson5.repository.StudentRepository;
import lesson5.repository.StudentRepositoryImpl;
import lesson5.services.StudentService;
import org.hibernate.SessionFactory;

public class Demo {

    private StudentService studentService;

    public Demo() {
        SessionFactory factory = Util.getSessionFactory();
        StudentRepository studentRepository = new StudentRepositoryImpl(factory);
        studentService = new StudentService(studentRepository, factory);
    }

    public void start() {


        studentService.printAllStudents();
        studentService.printTotalCount();
        System.out.println();

    }


}
