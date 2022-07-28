package com.maker.couple.mapper;

import com.maker.couple.domain.Member;
import com.maker.couple.dto.MemberUpsertDTO;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberMapper {

    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idels", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    Member insertRequestToMember (MemberUpsertDTO memberInsertRequest);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "idels", ignore = true)
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    void updateRequestToMember (MemberUpsertDTO memberInsertRequest, @MappingTarget Member member);
}
