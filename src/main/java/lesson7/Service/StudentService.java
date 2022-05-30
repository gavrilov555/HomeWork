package lesson7.Service;

import lesson7.Entity.Student;
import lesson7.Repo.StudentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepo studentRepo;


    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteById(Long id) {
        studentRepo.deleteById(id);
    }


    public Optional<Student> findStudent(long id) {
        return studentRepo.findById(id);
    }

    public void saveStudent (Student student) {
        studentRepo.save(student);
    }
}
