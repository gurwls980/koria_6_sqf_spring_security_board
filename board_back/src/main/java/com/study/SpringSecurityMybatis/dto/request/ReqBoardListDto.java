package com.study.SpringSecurityMybatis.dto.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqBoardListDto {
    private Long page;
    private Long limit;
}
