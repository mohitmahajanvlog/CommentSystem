package com.example.demo;



import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "users")
public class ParentComment {
	
	@Id
    private String comment_1;
    private ChildComment comment_11;
	private String comment_2;
   
    
	public ParentComment() {
    }

	public ParentComment(String comment_1, String comment_2, ChildComment comment_11) {
		super();
		this.comment_1 = comment_1;
		this.comment_2 = comment_2;
		this.comment_11 = comment_11;
	}
	
	 public String getComment_2() {
		return comment_2;
	}


	public void setComment_2(String comment_2) {
		this.comment_2 = comment_2;
	}

	
	@Embedded  
    public ChildComment getComment_11() {
		return comment_11;
	}

	public void setComment_11(ChildComment comment_11) {
		this.comment_11 = comment_11;
	}

	public String getComment_1() {
		return comment_1;
	}

	public void setComment_1(String comment_1) {
		this.comment_1 = comment_1;
	}

	

}

