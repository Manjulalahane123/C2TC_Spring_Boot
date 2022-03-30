package com.tns.certificate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class Certificate 
{
 private Integer id;
 private Integer year;
 private String college;
 public Certificate() 
 {
 }
 public Certificate(Integer id, Integer year, String college) 
 {
 this.id = id;
 this.year = year;
 this.college = college;
 }
 @Id
 
 public Integer getId() 
 {
 return id;
 }
public void setId(Integer id) 
{
this.id = id;
}
public Integer getyear() 
{
return year;
}
public void setyear(Integer year) 
{
this.year = year;
}
public String getcollege() 
{
return college;
}
public void setcollege(String college) 
{
this.college = college;
}
@Override
public String toString() 
{
return "Certificate [certificate_id=" + id + ", year=" + year + ", college=" + college + "]";
}
 
}
