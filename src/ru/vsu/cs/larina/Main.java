package ru.vsu.cs.larina;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {
	Faculty economics = new Faculty("Faculty of Economics");
    Institute ec = new Institute("Economy", "University square, 1");
    Institute finance = new Institute("Finance", "University square, 1");
    economics.setInstitutes(new Institute[]{ec, finance});

    ResearchAssociate employee1 = new ResearchAssociate(1, "John Taylor", "jsdjd@gmail.com", "economy");
    ResearchAssociate employee2 = new ResearchAssociate(2, "Tamara Ivanova", "tamara@gmail.com", "economy");
    ResearchAssociate employee3 = new ResearchAssociate(3, "Sveta Rosochkina", "sveta@gmail.com", "finance");
    ResearchAssociate employee4 = new ResearchAssociate(4, "Jack Black", "jsksdk@gmail.com", "finance");
    ec.setEmployees(new ResearchAssociate[]{employee1, employee2});
    finance.setEmployees(new ResearchAssociate[]{employee3, employee4});

    Project project1 = new Project("How can i become rich?",
            new SimpleDateFormat( "dd.MM.yyyy" ).parse( "12.12.2023" ),
            new SimpleDateFormat( "dd.MM.yyyy" ).parse( "08.03.2024" ), new Participation(5));
    employee1.setProjects(new Project[]{project1});

    Course course1 = new Course("Finance: easy and clear", 25, 60);
    Lecturer lecturer1 = new Lecturer(5, "Victor Romashkin", "victor@gmail.com", "finance");
    lecturer1.setCourses(new Course[]{course1});

    AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(6,
            "Stepan Kurochkin", "stepan@gmail.com", "admin");

    Institute[] institutes = economics.getInstitutes();
    System.out.println("Institutes on " + economics.getName() + ": \n");
    for (Institute institute : institutes) {
        System.out.println(institute.getName());
    }
    System.out.println();

    ResearchAssociate[] researchEconomy = ec.getEmployees();
    System.out.println("Research Associates on " + ec.getName() + ": \n");
    for (ResearchAssociate researchAssociate : researchEconomy) {
        System.out.println(researchAssociate.getName());
    }
    System.out.println();

    ResearchAssociate[] researchFinance = finance.getEmployees();
    System.out.println("Research Associates on " + finance.getName() + ": \n");
    for (ResearchAssociate researchAssociate : researchFinance) {
        System.out.println(researchAssociate.getName());
    }
    System.out.println();

    Project[] projects = employee1.getProjects();
    System.out.println("Projects of " + employee1.getName() + ": \n");
    for (Project project : projects) {
        System.out.println(project.getName());
    }
    System.out.println();

    Course[] courses = lecturer1.getCourses();
    System.out.println("Courses of " + lecturer1.getName() + ": \n");
    for (Course course : courses) {
        System.out.println(course.getName());
    }
    System.out.println();
    System.out.println("Admin:");
    System.out.println();
    System.out.println(administrativeEmployee.getName());
    }
}
