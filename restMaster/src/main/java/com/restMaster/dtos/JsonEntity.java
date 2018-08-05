package com.restMaster.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class JsonEntity {
	private String name;
	private String type;
	private String min_length;
	private String max_length;
	private String nullable;
	private List<JsonEntity> values;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMin_length() {
		return min_length;
	}

	public void setMin_length(String min_length) {
		this.min_length = min_length;
	}

	public String getMax_length() {
		return max_length;
	}

	public void setMax_length(String max_length) {
		this.max_length = max_length;
	}

	public String getNullable() {
		return nullable;
	}

	public void setNullable(String nullable) {
		this.nullable = nullable;
	}

	public List<JsonEntity> getValues() {
		return values;
	}

	public void setValues(List<JsonEntity> values) {
		this.values = values;
	}

}
