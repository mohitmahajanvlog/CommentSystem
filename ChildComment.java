package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Embeddable
public class ChildComment {
	
	private String comment_11;
	 private ChildCommentOne comment_111;
	
	
	public ChildComment(String comment_11, ChildCommentOne comment_111) {
		super();
		this.comment_11 = comment_11;
		this.comment_111 = comment_111;
	}


	public ChildComment() {}

	@Embedded
	public ChildCommentOne getComment_111() {
		return comment_111;
	}

	public void setComment_111(ChildCommentOne comment_111) {
		this.comment_111 = comment_111;
	}
	
	public String getComment_11() {
		return comment_11;
	}

	public void setComment_11(String comment_11) {
		this.comment_11 = comment_11;
	}

	

	
}
