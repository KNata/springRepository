package com.natalia;

import java.util.ArrayList;
import javax.persistence.*;

@Entity
@Table(name = "Teachers")
@NamedQueries({
        @NamedQuery(name = Teacher.FIND_ALL, query = "SELECT teacher FROM Teacher teacher"),
    //    @NamedQuery(name = Teacher.COUNT_ALL, query = "SELECT count(teacher) FROM Teacher teacher")
})
public class Teacher {
	
	 public static final String FIND_ALL = "findAll";
     public static final String COUNT_ALL = "countAll";
	    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String teacherName;
    @Column(name = "cellphone")
    private String cellphone;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "teachers")
   private ArrayList<Student> studentList;

    
    Teacher() {
    	
    }
    
    Teacher(int anId, String aFirstName, String aCellPhone) {
    	id = anId;
    	teacherName = aFirstName;
    	cellphone = aCellPhone;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cellphone == null) ? 0 : cellphone.hashCode());
		result = prime * result + id;
		result = prime * result + ((studentList == null) ? 0 : studentList.hashCode());
		result = prime * result + ((teacherName == null) ? 0 : teacherName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (cellphone == null) {
			if (other.cellphone != null)
				return false;
		} else if (!cellphone.equals(other.cellphone))
			return false;
		if (id != other.id)
			return false;
		if (studentList == null) {
			if (other.studentList != null)
				return false;
		} else if (!studentList.equals(other.studentList))
			return false;
		if (teacherName == null) {
			if (other.teacherName != null)
				return false;
		} else if (!teacherName.equals(other.teacherName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TeacherEntity [id=" + id + ", teacherName=" + teacherName + ", cellphone=" + cellphone
				+ ", studentList=" + studentList + "]";
	}

	
}
