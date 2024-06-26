package com.didt.pagesale.server;

import com.didt.pagesale.dto.RegisterCoursesDto;
import com.didt.pagesale.mapper.RegisterCoursesMapper;
import com.didt.pagesale.repository.RegisterCoursesRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterCoursesService {
    private final RegisterCoursesRepository registerCoursesRepository;
    private final RegisterCoursesMapper registerCoursesMapper;

    public RegisterCoursesService(RegisterCoursesRepository registerCoursesRepository, RegisterCoursesMapper registerCoursesMapper) {
        this.registerCoursesRepository = registerCoursesRepository;
        this.registerCoursesMapper = registerCoursesMapper;
    }

    public RegisterCoursesDto createRegisterCourses(RegisterCoursesDto registerCoursesDto) {
        registerCoursesRepository.save(registerCoursesMapper.toRegisterCourses(registerCoursesDto));
        return registerCoursesDto;
    }
}
