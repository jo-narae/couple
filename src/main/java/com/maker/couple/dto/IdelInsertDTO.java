package com.maker.couple.dto;

import com.maker.couple.domain.Idel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class IdelInsertDTO {

    private Idel.Type type;

    private int rangeStart;

    private int rangeEnd;
}