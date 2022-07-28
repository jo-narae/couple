package com.maker.couple.mapper;

import com.maker.couple.domain.Idel;
import com.maker.couple.dto.IdelInsertDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IdelMapper {
    IdelMapper INSTANCE = Mappers.getMapper(IdelMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "member", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Idel insertRequestToIdel (IdelInsertDTO idelInsertRequest);
}