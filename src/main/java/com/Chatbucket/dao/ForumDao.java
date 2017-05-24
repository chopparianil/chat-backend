package com.Chatbucket.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.Chatbucket.model.Forum;
@Repository
@ComponentScan("com.nik")


public interface ForumDao {
	void addForum(Forum forum);

	List<Forum> viewForums();

	void deleteForum(Forum forum);
	void updateForum(Forum forum);
	List<Forum> viewForum(boolean status);
}
