package com.cch.controller;

import org.system.domain.BaseEntity;
import org.system.service.BaseEntityService;

public class BaseEntityController {

	private BaseEntityService service = new BaseEntityService();

	public BaseEntity getBaseEntity(String name) {
		return service.getBaseEntity(name);
	}

}
