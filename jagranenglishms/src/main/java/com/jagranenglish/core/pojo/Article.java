package com.jagranenglish.core.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@Table(name = "ARTICLE")
public class Article implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	
	
	/*private String hindiHeadline;
	private String englishHeadline;
	private String keywords;
	private String englishUrl;
	private String metaTitle;
	private String summary;
	private String body;
	private String description;
	private Date schedule;
	private String imagePath;
	private String imageTitle;
	private String imageCaption;
	private Integer createdById;
	private Date createdDate;
	private Integer modifiedById;
	private Date modifiedDate;
	private Integer isIndexed = 0;
	private char isActive;
	private Integer categoryId;
	private Integer subCategoryId;
	
	private String author;
	
	private String email;
	private String webCategory;
	private String webCategoryHn;
	private String webSubcategory;
	private String webSubcategoryHn;*/
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	Article(){}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public Article(Integer id) {
		super();
		this.id = id;
	
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
