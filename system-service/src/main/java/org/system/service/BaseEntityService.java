package org.system.service;

import org.system.dao.BaseEntityDao;
import org.system.domain.BaseEntity;

public class BaseEntityService {
	private BaseEntityDao dao = new BaseEntityDao();

	public BaseEntity getBaseEntity(String name) {
		return dao.getBaseEntity(name);
	}

}
