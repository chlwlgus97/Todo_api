package com.crud.todo.service;

import com.crud.todo.mapper.TodoMapper;
import com.crud.todo.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service("TodoService")
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoMapper todoMapper;

    /**
     *
     * todo list 조회
     */
    @Override
    public List<GetTodoResVO> getTodo(){
        return todoMapper.getTodo();
    }

    /**
     * todo 생성
     */
    @Override
    public int createTodo(CreateTodoReqVO param) {
        log.debug("createTodo"+param.toString());
        int resCreateTodo = 0;
        try {
            CreateTodoReqVO reqVO = CreateTodoReqVO.builder()
                    .title(param.getTitle())
                    .content(param.getContent())
                    .build();
            resCreateTodo = todoMapper.createTodo(reqVO);
        } catch (Exception e){
            throw new RuntimeException("todo 데이터 생성 에러"+ e.getMessage(), e);
        }
        return resCreateTodo;
    }

    /**
     * todo 목록 수정
     */
    @Override
    public int modifyTodo(ModifyTodoReqVO param){
        log.debug("modifyTodo" + param.toString());
        int resModifyTodo = 0;
        try {
            resModifyTodo = todoMapper.modifyTodo(param);
        } catch (Exception e) {
            throw new RuntimeException("todo 데이터 수정 에러",e);
        }
        return resModifyTodo;
    }
    @Override
    public int removeTodo(RemoveTodoReqVO param){
        log.debug("removeTodo" + param.toString());
        int resRemoveTodo = 0;
        try {
            resRemoveTodo = todoMapper.removeTodo(param);
        } catch (Exception e) {
            throw new RuntimeException("todo 데이터 삭제 에러",e);
        }
        return resRemoveTodo;
    }

}
