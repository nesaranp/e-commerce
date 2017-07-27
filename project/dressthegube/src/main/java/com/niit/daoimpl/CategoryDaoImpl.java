package com.niit.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.dao.CategoryDao;
import com.niit.model.Category;

@Repository
@EnableTransactionManagement
public class CategoryDaoImpl implements CategoryDao {

	@Override
	public boolean saveorupdate(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category getCategory(String catid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
