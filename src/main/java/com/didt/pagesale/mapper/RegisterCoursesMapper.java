package com.didt.pagesale.mapper;

import com.didt.pagesale.dto.RegisterCoursesDto;
import com.didt.pagesale.model.RegisterCourses;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RegisterCoursesMapper {
    RegisterCourses toRegisterCourses(RegisterCoursesDto registerCoursesDto);

    List<RegisterCoursesDto> toRegisterCoursesDto(List<RegisterCourses> registerCourses);
}
