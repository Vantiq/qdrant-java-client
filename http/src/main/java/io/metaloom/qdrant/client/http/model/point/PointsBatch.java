package io.metaloom.qdrant.client.http.model.point;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.metaloom.qdrant.client.http.model.RestModel;

public class PointsBatch implements RestModel {

	@JsonProperty("ids")
	private List<PointId> ids;

	@JsonProperty("vectors")
	// TODO use dedicated interface to map between list or map
	private List<VectorData> vectors;

	@JsonProperty("payloads")
	private List<Payload> payloads;

	public List<PointId> getIds() {
		return ids;
	}

	public PointsBatch setIds(List<PointId> ids) {
		this.ids = ids;
		return this;
	}

	public List<VectorData> getVectors() {
		return vectors;
	}

	public PointsBatch setVectors(List<VectorData> vectors) {
		this.vectors = vectors;
		return this;
	}

	@JsonIgnore
	public PointsBatch setVectors(VectorData... vectors) {
		this.vectors = Arrays.asList(vectors);
		return this;
	}

	public List<Payload> getPayloads() {
		return payloads;
	}

	public PointsBatch setPayloads(List<Payload> payloads) {
		this.payloads = payloads;
		return this;
	}

	@JsonIgnore
	public PointsBatch setIds(long... ids) {
		this.ids = PointId.list(ids);
		return this;
	}

	@JsonIgnore
	public PointsBatch setPayloads(Payload... payloads) {
		this.payloads = Arrays.asList(payloads);
		return this;
	}
}
