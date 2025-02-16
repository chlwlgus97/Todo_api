package com.crud.todo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Builder(toBuilder = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateTodoResVO {
    @Schema(description = "마스터 순번", example = "1")
    private int idx;

    @Schema(description = "할 일 제목", example = "엑셀 배우기")
    private String title;

    @Schema(description = "할 일 상세 내용", example = "피벗 테이블 배우기")
    private String content;

    @Schema(description = "할 일 완료 여부", example = "1: 완료 0: 미완료")
    private int done;

    @Schema(description = "할 일 생성 시간", example = "2025-02-14")
    private Timestamp created_time;

    @Schema(description = "할 일 수정 시간", example = "2025-02-15")
    private Timestamp updated_time;
}
