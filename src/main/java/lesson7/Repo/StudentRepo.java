package lesson7.Repo;

import lesson7.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository <Student, Long> {

 /*   private List<Student> students;

@PostConstruct
    public void init() {
        students = new ArrayList<>(List.of(
                new Student(1L, "Mike", 19),
                new Student(2L, "Bob", 20),
                new Student(3L, "Alex", 18)
        ));
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(students);
    }

    public Student addStudent () {

    }

    public Student findById (Long id) {
    return students.stream().filter(s -> s.getId().equals(id)).findFirst().get();
    }

    public void deleteById (Long id) {
    students.removeIf(s -> s.getId().equals(id));
    }

  */

}
