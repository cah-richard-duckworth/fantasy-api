package com.therick.ffl.data.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Richard W. Duckworth
 * @created 11/21/2019
 */
@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
}
