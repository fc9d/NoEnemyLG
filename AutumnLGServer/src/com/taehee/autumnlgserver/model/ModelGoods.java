package com.taehee.autumnlgserver.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModelGoods{

	/**
	 * 코드
	 */
	@JsonProperty("code")
	public String code;

	/**
	 * 예상 공임
	 */
	@JsonProperty("price")
	public String price;

	/**
	 * 기본 공임
	 */
	@JsonProperty("basicPrice")
	public String basicPrice;

	/**
	 * 중량
	 */
	@JsonProperty("weight")
	public String weight;

	/**
	 * 큐통
	 */
	@JsonProperty("cubic")
	public String cubic;

	/**
	 * 2
	 */
	@JsonProperty("etc")
	public String etc;

}
