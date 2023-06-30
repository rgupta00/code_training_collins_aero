package com.busycoder.persistance;

import java.util.List;

import com.busycoder.entity.Entity;

public interface UserRepo <T extends Entity> {
	public List<T> findByName(String name) ;
}
