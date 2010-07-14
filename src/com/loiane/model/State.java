package com.loiane.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonAutoDetect;

/**
 * Contains some data to represent a state.
 * POJO class
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@JsonAutoDetect
@Entity
@Table(name="STATE")
public class State {
	
	private String id;
	
	private String name;
	
	private String code;
	
	@Id
	@GeneratedValue
	@Column(name="STATE_ID")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="STATE_NAME", nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="STATE_CODE", nullable=false)
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
