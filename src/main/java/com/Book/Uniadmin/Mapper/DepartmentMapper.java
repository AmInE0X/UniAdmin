package com.Book.Uniadmin.Mapper;

import com.Book.Uniadmin.DTOs.DepartmentDTO;
import com.Book.Uniadmin.models.Department;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

    DepartmentDTO toDTO(Department department);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    @org.mapstruct.Mapping(target = "teachers", ignore = true)
    Department toEntity(DepartmentDTO dto);

}
