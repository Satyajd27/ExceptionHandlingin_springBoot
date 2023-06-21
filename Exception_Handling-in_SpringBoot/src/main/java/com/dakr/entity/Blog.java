package com.dakr.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blog_tbl")
public class Blog {
	@Id
	 private int blogId;
	    private String blogTitle;
	    private String blogCreator;
	    private int yearOfPost;
		public int getBlogId() {
			return blogId;
		}
		public void setBlogId(int blogId) {
			this.blogId = blogId;
		}
		public String getBlogTitle() {
			return blogTitle;
		}
		public void setBlogTitle(String blogTitle) {
			this.blogTitle = blogTitle;
		}
		public String getBlogCreator() {
			return blogCreator;
		}
		public void setBlogCreator(String blogCreator) {
			this.blogCreator = blogCreator;
		}
		public int getYearOfPost() {
			return yearOfPost;
		}
		public void setYearOfPost(int yearOfPost) {
			this.yearOfPost = yearOfPost;
		}
		/**
		 * @param blogId
		 * @param blogTitle
		 * @param blogCreator
		 * @param yearOfPost
		 */
		public Blog(int blogId, String blogTitle, String blogCreator, int yearOfPost) {
			this.blogId = blogId;
			this.blogTitle = blogTitle;
			this.blogCreator = blogCreator;
			this.yearOfPost = yearOfPost;
		}
		@Override
		public String toString() {
			return "blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogCreator=" + blogCreator
					+ ", yearOfPost=" + yearOfPost + "]";
		}
	    public Blog()
	    {
	    	
	    }

}
