package io.yadnyesh.kksball.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubUser {

	private String user;
	private String blog;
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getBlog() {
		return blog;
	}
	
	public void setBlog(String blog) {
		this.blog = blog;
	}
	
	@Override
	public String toString() {
		return "GithubUser{" + "user='" + user + '\'' + ", blog='" + blog + '\'' + '}';
	}
}
