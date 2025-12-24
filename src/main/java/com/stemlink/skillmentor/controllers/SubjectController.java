package com.stemlink.skillmentor.controllers;
import com.stemlink.skillmentor.dto.SubjectDTO;
import com.stemlink.skillmentor.entities.Subject;
import com.stemlink.skillmentor.services.SubjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
@RequestMapping(path = "/api/v1/subjects")
@RequiredArgsConstructor

public class SubjectController {

    private final ModelMapper modelMapper;

    private final SubjectService subjectService;

    //Mock database


    @GetMapping
    public List<Subject> getAllSubjects(@RequestParam(name = "name",defaultValue = "all")String name){
//        String result = subjects.toString();
//        System.out.println(result);

        return subjectService.getAllSubjects();
    }
//
//    @GetMapping("{id}")
//    public String getSubjectById(
//            @PathVariable int id){
//        System.out.println("Get by ID" + id);
//        return subjects.get(id);
//    }


    @PostMapping()
    public Subject createSubject(@Validated @RequestBody SubjectDTO subjectDTO){
//        if(subject.getSubjectName().length() > 20){
//            Subject errorSubject = new Subject();
//            errorSubject.setSubjectName("");
//            errorSubject.setDescription("");
//            return errorSubject;
//        }
//        //mapping object to subject
//        Subject subject = new Subject();
//        subject.setSubjectName(subjectDTO.getSubjectName());
//        subject.setDescription(subjectDTO.getDescription());

        Subject subject = modelMapper.map(subjectDTO, Subject.class);
        return subjectService.addNewSubject(subject);

    }

//    @PutMapping("{id}")
//    public String updateMapping(@RequestBody String updateSubject  ){
//        System.out.println("Put " + updateSubject);
//        return "Update all subjects";
//    }

//    @DeleteMapping("{id}")
//    public String deleteSubject(@PathVariable int id){
//        System.out.println("Delete");
//        subjects.remove(id);
//        return subjects.toString();
//    }


}
