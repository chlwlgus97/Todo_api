package com.crud.todo.mapper;

import com.crud.todo.model.*;
import org.apache.ibatis.annotations.Mapper;
import java.util.*;

@Mapper
public interface TodoMapper {
    List<GetTodoResVO> getTodo(); // 모든 데이터 조회

    int createTodo(CreateTodoReqVO reqVO) throws  RuntimeException;
    int modifyTodo(ModifyTodoReqVO param) throws  RuntimeException;
    int removeTodo(RemoveTodoReqVO param) throws  RuntimeException;
}
