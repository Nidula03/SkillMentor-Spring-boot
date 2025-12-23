package com.stemlink.skillmentor.controllers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/subjects")

public class SubjectController {

    //Mock database
    private final List<String> subjects = new ArrayList<>((
            List.of("Maths","Science","History","IT")
    ));

    @GetMapping
    public String getAllSubjects( @RequestParam(name = "name",defaultValue = "all")String name){
        String result = subjects.toString();
        System.out.println(result);
        return result;
    }

    @GetMapping("{id}")
    public String getSubjectById(
            @PathVariable int id){
        System.out.println("Get by ID" + id);
        return subjects.get(id);
    }


    @PostMapping()
    public String createSubject(@RequestBody String subject){
        System.out.println("Post");
        subjects.add(subject);
        return "Create subjects";
    }

    @PutMapping("{id}")
    public String updateMapping(@RequestBody String updateSubject  ){
        System.out.println("Put " + updateSubject);
        return "Update all subjects";
    }

    @DeleteMapping("{id}")
    public String deleteSubject(@PathVariable int id){
        System.out.println("Delete");
        subjects.remove(id);
        return subjects.toString();
    }


}
