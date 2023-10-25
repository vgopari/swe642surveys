package com.students.swe642surveys.service;

import com.students.swe642surveys.entity.Surveys;
import com.students.swe642surveys.service.serviceimpl.SurveysServiceImpl;

import java.util.List;

public interface SurveysService {

    public Surveys saveSurvey(Surveys survey);

    List<Surveys> getAllSurveys();

    Surveys getSurvey(int id);

    Surveys updateSurvey(int id, Surveys survey);
}
