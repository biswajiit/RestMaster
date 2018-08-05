package com.restMaster.dtos;

import java.util.List;

public class Model {
	private String functionalId;
	private String url;
	private List<JsonEntity> entities;

	public String getFunctionalId() {
		return functionalId;
	}

	public void setFunctionalId(String functionalId) {
		this.functionalId = functionalId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<JsonEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<JsonEntity> entities) {
		this.entities = entities;
	}

}
