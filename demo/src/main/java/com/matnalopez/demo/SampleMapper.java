package com.matnalopez.demo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

@Mapper
public interface SampleMapper {

    String getLanguageByUser(@Param("userName") String userName);

    String getMessageByLanguage(@Param("language") String language);
}