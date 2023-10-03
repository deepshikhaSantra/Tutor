package com.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tutorials")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Tutor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "eid")
	private Integer id;
	@Column(name = "tittle", length = 100)
	private String tittle;
	@Column(name = "description", length = 30)
	private String description;
	@Column(name = "published", length = 30)
	private Boolean published;

	// public Tutor() {

	// }

	// public Tutor(Integer id, String tittle, String description, Boolean
	// published) {
//		super();
//		this.id = id;
//		this.tittle = tittle;
//		this.description = description;
//		this.published = published;
//	}

//	public Tutor(String tittle, String description, Boolean published) {
//		super();
//		this.tittle = tittle;
//		this.description = description;
//		this.published = published;
//	}
//
//	public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getTittle() {
//		return tittle;
//	}
//
//	public void setTittle(String tittle) {
//		this.tittle = tittle;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}

//	public Boolean getPublished() {
//		return published;
//	}
//
//	public void setPublished(Boolean published) {
//		this.published = published;
//	}
//
//	@Override
//	public String toString() {
//		return "Tutor [id=" + id + ", tittle=" + tittle + ", description=" + description + ", published=" + published
//				+ "]";
//	}
//
}
