package com.dxj.system.mapper;

import com.dxj.system.domain.Permission;
import com.dxj.mapper.EntityMapper;
import com.dxj.system.dto.PermissionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Service;

/**
 * @author dxj
 * @date 2018-11-23
 */
@Service
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PermissionMapper extends EntityMapper<PermissionDTO, Permission> {

}
