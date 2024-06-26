package com.didt.pagesale.controller;

import com.didt.pagesale.dto.RegisterCoursesDto;
import com.didt.pagesale.server.RegisterCoursesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register-courses")
public class RegisterCoursesController {

    private final RegisterCoursesService registerCoursesService;

    public RegisterCoursesController(RegisterCoursesService registerCoursesService) {
        this.registerCoursesService = registerCoursesService;
    }

    @PostMapping("/create")
    public ResponseEntity<RegisterCoursesDto> createRegisterCourses(
            @RequestBody RegisterCoursesDto registerCoursesDto) {
        return new ResponseEntity<>(registerCoursesService.createRegisterCourses(registerCoursesDto),HttpStatus.OK);
    }
}
