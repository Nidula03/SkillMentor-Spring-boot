package com.stemlink.skillmentor.services;

import com.stemlink.skillmentor.entities.Subject;
import com.stemlink.skillmentor.repositories.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectService {

    private final SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public Subject addNewSubject(Subject subject){
        return subjectRepository.save(subject);
    }





}
