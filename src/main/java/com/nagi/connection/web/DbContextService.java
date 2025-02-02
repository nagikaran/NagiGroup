package com.nagi.connection.web;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface DbContextService {
	
	 int QueryToFirstWithInt(String query, Object[] paramsArray);
	 <T> List<T> QueryToListWithParam(String query, Object[] paramsArray, Class<T> typeRef);
	 <T> T QueryToFirstWithParam(String query, Object[] paramsArray,Class<T> typeRef);

}
