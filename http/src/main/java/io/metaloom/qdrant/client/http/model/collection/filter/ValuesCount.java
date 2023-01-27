package io.metaloom.qdrant.client.http.model.collection.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.metaloom.qdrant.client.http.model.RestModel;

public class ValuesCount implements RestModel {

	@JsonProperty("lt")
	private Integer lessThan;

	@JsonProperty("gt")
	private Integer greaterThan;

	@JsonProperty("gte")
	private Integer greaterThanEqual;

	@JsonProperty("lte")
	private Integer lessThanEqual;

	public Integer getGreaterThan() {
		return greaterThan;
	}

	public Integer getGreaterThanEqual() {
		return greaterThanEqual;
	}

	public Integer getLessThan() {
		return lessThan;
	}

	public Integer getLessThanEqual() {
		return lessThanEqual;
	}

}
