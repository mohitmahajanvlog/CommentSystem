package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Embeddable
public class ChildCommentTwo {

	
	private String comment_1111;
	private String comment_1112;
		

	public ChildCommentTwo(String comment_1111, String comment_1112) {
		super();
		this.comment_1111 = comment_1111;
		this.comment_1112 = comment_1112;
	}

	public ChildCommentTwo() {}

	
	public String getComment_1111() {
		return comment_1111;
	}

	public void setComment_1111(String comment_1111) {
		this.comment_1111 = comment_1111;
	}

	public String getComment_1112() {
		return comment_1112;
	}

	public void setComment_1112(String comment_1112) {
		this.comment_1112 = comment_1112;
	}

	
	
}
