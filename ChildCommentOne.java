package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Embeddable
public class ChildCommentOne {

	
	private String comment_111;
    private ChildCommentTwo comment_1111;
    private String comment_112;


	public ChildCommentOne(String comment_111, String comment_112, ChildCommentTwo comment_1111) {
		super();
		this.comment_111 = comment_111;
		this.comment_112 = comment_112;
		this.comment_1111 = comment_1111;
	}

	public ChildCommentOne() {}

	
	@Embedded
	public ChildCommentTwo getComment_1111() {
		return comment_1111;
	}

	public void setComment_1111(ChildCommentTwo comment_1111) {
		this.comment_1111 = comment_1111;
	}

	public String getComment_111() {
		return comment_111;
	}

	public void setComment_111(String comment_111) {
		this.comment_111 = comment_111;
	}

	public String getComment_112() {
		return comment_112;
	}

	public void setComment_112(String comment_112) {
		this.comment_112 = comment_112;
	}

	
	

	
}
