package lesson7.Controllers;

import lesson7.Entity.Student;
import lesson7.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("show_form")
    public String showFormPage() {
        return "simple_form";
    }

    @GetMapping("student_add")
    public String addStudent(@RequestParam String name, @RequestParam int age) {
        Student student = new Student(null, name, age);
        studentService.addStudent(student);
        return "simple_form";
    }

    @GetMapping("student_change")
    public String changeStudentById(@RequestParam Long id, @RequestParam String name, @RequestParam int age) {
        Student student = studentService.findStudent(id).get();
        student.setName(name);
        student.setAge(age);
        return "simple_form";
    }

    @GetMapping("/students_page")
    public String showStudentsPage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students_page";
    }

    @GetMapping("/student_show")
    public String redirectStudentsPage() {

        return "redirect:/students_page";
    }

    @GetMapping("student_delete")
    public String deleteStudent(Long id) {
        studentService.deleteById(id);
        return "simple_form";
    }

    @GetMapping("/students")
    public String showStudentPage(Model model, @RequestParam Long id) {
        Student student = studentService.findStudent(id).get();
        model.addAttribute("student", student);
        return "student_info_page";
    }

}
