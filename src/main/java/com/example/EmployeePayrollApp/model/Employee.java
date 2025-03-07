package com.example.EmployeePayrollApp.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // Marks this class as a database entity
@Table(name = "employees")  // Specifies the table name
@Data  // Generates getters, setters, toString, equals, and hashCode
@AllArgsConstructor  // Generates constructor with all fields
@NoArgsConstructor  // Generates a no-argument constructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increments ID
    private Long id;

    private String name;
    private String department;
    private double salary;
<<<<<<< HEAD

    public Employee() {
    }

    // Constructor with all fields
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString Method
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }

    // equals and hashCode Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(id, employee.id) &&
                Objects.equals(name, employee.name) &&
                Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, department, salary);
    }
}