package org.system.dao;

import org.system.domain.BaseEntity;

public class BaseEntityDao {
	public BaseEntity getBaseEntity(String name) {
		return new BaseEntity(name, "12134567");		
	}
}
