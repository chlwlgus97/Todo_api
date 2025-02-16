package com.crud.todo.service;

import com.crud.todo.model.*;

import java.util.List;

public interface TodoService {
    List<GetTodoResVO> getTodo();

    int createTodo(CreateTodoReqVO param);

    int modifyTodo(ModifyTodoReqVO param);

    int removeTodo(RemoveTodoReqVO param);
}
