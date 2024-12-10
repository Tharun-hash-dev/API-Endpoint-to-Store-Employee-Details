Package com.imaginnovate.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

  @Data
  @Entity
  @Table(name= "Employee_Details")

public class EmployeeDetails {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String employeeId;
  private String firstName;
  private String lastName;
  @Email(regexp="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]"); 
  private String email;
  @NotEmpty(message = "Phone numbers cannot be empty")
  private List<String> phoneNumbers;
  @Past(message = "Date of Joining should be a valid date")
  @DateTimeFormat(format = "YYYY-MM-DD")
  private Date doj;
  @Min(value = 0.00, message = "Salary Should be a positive number")
  private Double salary;

