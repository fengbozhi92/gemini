package org.fbz.gemini.common;

import java.io.Serializable;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class PageQuery implements Pageable, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public int page = 0;
	public int size = 10;
	
	public Sort sort;
	

	public int getPageNumber() {
		return page;
	}


	public int getPageSize() {
		return size;
	}


	public int getOffset() {
		return page * size;
	}


	public Sort getSort() {
		return sort;
	}


	public Pageable next() {
		return null;
	}


	public Pageable previousOrFirst() {
		return null;
	}


	public Pageable first() {
		return null;
	}


	public boolean hasPrevious() {
		return false;
	}

}
