package com.storesales.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.storesales.model.User;
import com.storesales.service.IUserService;

/**
*@author ���ߣ�
*@version ����ʱ�䣺2015��11��25�� ����10:49:35
*��˵����
*/
@Service
public class UserServiceImpl implements IUserService {
	@Override
	public boolean register(User user) {
		return false;
	}

	@Override
	public User loginCheck(User user) {
		return null;
	}

	@Override
	public <T> List<T> getResultList(Class<T> clz, String sql) {
		return null;
	}
}
