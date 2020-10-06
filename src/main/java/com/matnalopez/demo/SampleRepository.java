package com.matnalopez.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepository {

    @Autowired
    private SampleMapper sampleMapper;

    public SampleRepository(SampleMapper sampleMapper) {
        this.sampleMapper = sampleMapper;
    }

    public String getMessageByUser(String userName) {
        String language = sampleMapper.getLanguageByUser(userName);

        return sampleMapper.getMessageByLanguage(language);
    }
}