package testingpipeline;

import college.*;
import college.Module;
import org.joda.time.DateTime;
import java.util.ArrayList;

public class TestCollegeStructure {
    public static void main(String[] args) {
        // Create Students that are in the College.
        Student student1 = new Student("Edmund", 21, new DateTime(2001, 8, 12, 9, 46), 19398436);
        Student student2 = new Student("Winston", 22, new DateTime(2000, 7, 22, 12, 16), 18374536);
        Student student3 = new Student("Gregory", 20, new DateTime(2002, 3, 8, 18, 51), 20458431);
        Student student4 = new Student("Oswald", 23, new DateTime(1999, 9, 11, 11, 34), 17375435);
        Student student5 = new Student("Edgar", 21, new DateTime(2001, 2, 21, 1, 21), 19393438);

        // Create Modules for the Students to attend.
        Module module1 = new Module("Object-Oriented Programming");
        Module module2 = new Module("Distributed Systems");
        Module module3 = new Module("Software Engineering");
        Module module4 = new Module("CPR Training");

        // Create a list of Modules for a Course to contain
        ArrayList<Module> course1Modules = new ArrayList<>();
        course1Modules.add(module1);
        course1Modules.add(module2);
        course1Modules.add(module3);
        ArrayList<Module> course2Modules = new ArrayList<>();
        course2Modules.add(module4);

        // Create groups of Students that will belong to Modules.
        // -> Module 1 - "Object-Oriented Programming"
        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(student1);
        students1.add(student3);
        students1.add(student5);
        module1.setStudentList(students1);

        // -> Module 2 - "Distributed Systems"
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(student1);
        students2.add(student5);
        module2.setStudentList(students2);

        // -> Module 3 - "Software Engineering"
        ArrayList<Student> students3 = new ArrayList<>();
        students3.add(student1);
        students3.add(student2);
        students3.add(student4);
        students3.add(student5);
        module3.setStudentList(students3);

        // -> Module 4 - "CPR Training" - 4th Module as part of extracurricular course
        ArrayList<Student> students4 = new ArrayList<>();
        students4.add(student2);
        students4.add(student3);
        module4.setStudentList(students4);

        // Create lists of Modules assigned to each Student.
        // Student 1's modules - Edmund
        ArrayList<Module> student1modules = new ArrayList<>();
        student1modules.add(module1);
        student1modules.add(module2);
        student1modules.add(module3);
        student1.setModules(student1modules);

        // Student 2's modules - Winston
        ArrayList<Module> student2modules = new ArrayList<>();
        student2modules.add(module3);
        student2modules.add(module4);
        student2.setModules(student2modules);

        // Student 3's modules - Gregory
        ArrayList<Module> student3modules = new ArrayList<>();
        student3modules.add(module1);
        student3modules.add(module4);
        student3.setModules(student3modules);

        // Student 4's modules - Oswald
        ArrayList<Module> student4modules = new ArrayList<>();
        student4modules.add(module3);
        student4.setModules(student4modules);

        // Student 5's modules - Edgar
        ArrayList<Module> student5modules = new ArrayList<>();
        student5modules.add(module1);
        student5modules.add(module2);
        student5modules.add(module3);
        student5.setModules(student5modules);

        // Create a Course and add the list of associated Modules.
        DateTime startDate1 = new DateTime(2022, 9, 7, 9, 0);
        DateTime endDate1 = new DateTime(2023, 5, 10, 15, 0);
        CourseProgramme course1 = new CourseProgramme("Computer Science", startDate1, endDate1);
        course1.setModules(course1Modules);

        // Create a secondary Course for Students to attend to.
        DateTime startDate2 = new DateTime(2022, 9, 7, 9, 0);
        DateTime endDate2 = new DateTime(2022, 12, 21, 12, 0);
        CourseProgramme course2 = new CourseProgramme("First Aid Training", startDate2, endDate2);
        course2.setModules(course2Modules);

        // Create a list of Courses for Students to attend to.
        ArrayList<CourseProgramme> courses = new ArrayList<>();
        courses.add(course1);

        // Create an extended list of Courses for certain Students to attend to.
        ArrayList<CourseProgramme> extraCourses = new ArrayList<>();
        extraCourses.add(course1);
        extraCourses.add(course2);

        // Set List of Courses for each Student.
        student1.setCourses(courses);
        student2.setCourses(extraCourses);
        student3.setCourses(extraCourses);
        student4.setCourses(courses);
        student5.setCourses(courses);

        // Print details of Courses, Modules, and Students as required by Assignment Brief
        for(CourseProgramme course : extraCourses) {
            System.out.println(course);
        }
    }
}
















