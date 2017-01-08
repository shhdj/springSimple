package com.storesales.service;

import java.util.List;

import com.storesales.model.User;


public interface IUserService {

	public boolean register(User user);
	public User loginCheck(User user);
	
	public <T> List<T> getResultList(Class<T> clz,String sql);
}
