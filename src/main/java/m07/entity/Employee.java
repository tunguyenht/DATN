package m07.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Nationalized;
@Entity
@Table(name="Employee")
public class Employee implements Serializable {
	@Id
	@GeneratedValue
	Integer id;
	
	@Nationalized
	String LastName;
	
	@Nationalized
	String FirstName;
	
	@Nationalized
	String Sex;
	
	@Nationalized
	String Adress;
	
	String Phone;
	String Birthday;
	String Email;
	String Password;
	
	/*@OneToMany(mappedBy = "employeeId")
	Collection<Returns> returns;*/
	
	@OneToMany(mappedBy = "employee")
	Collection<Receiption> receiptions;
	
	@OneToMany(mappedBy="employee")
	Collection<Order> order;
	
	@OneToMany(mappedBy="employee")
	Collection<Cmt_Emp> cmt_emp;
	
	public Collection<Receiption> getReceiptions() {
		return receiptions;
	}

	public void setReceiptions(Collection<Receiption> receiptions) {
		this.receiptions = receiptions;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Collection<Order> getOrder() {
		return order;
	}

	public void setOrder(Collection<Order> order) {
		this.order = order;
	}

	public Collection<Cmt_Emp> getCmt_emp() {
		return cmt_emp;
	}

	public void setCmt_emp(Collection<Cmt_Emp> cmt_emp) {
		this.cmt_emp = cmt_emp;
	}
	
}
