package com.crud.todo.controller;

import com.crud.todo.model.*;
import com.crud.todo.service.TodoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@Tag(name = "할 일 웹", description = "할 일 조회")
@RestController
@RequestMapping("/web/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping("/getTodo")
    public ResponseEntity<List<GetTodoResVO>> getTodo() {
        log.debug("getTodo: 불러");
        List<GetTodoResVO> response = todoService.getTodo();
        return ResponseEntity.ok(response);
    }

    /**
     * todo 추가
     */
    @PostMapping(value = "/createTodo")
    public ResponseEntity createTodo(@Valid @RequestBody CreateTodoReqVO param) {
        int ret = 0;

        log.debug("insert createTodo" + param.toString());

        ret = todoService.createTodo(param);

        return ResponseEntity.ok(ret);
    }

    /**
     * todo 수정
     */
    @PutMapping(value = "/modifyTodo")
    public ResponseEntity modifySite(@Valid @RequestBody ModifyTodoReqVO param) {
        int ret = 0;

        log.debug("update modifyTodo" + param.toString());

        ret = todoService.modifyTodo(param);

        return ResponseEntity.ok(ret);
    }

    /**
     * todo 제거
     */
    @DeleteMapping(value = "/removeTodo")
    public ResponseEntity removeSite(@Valid @RequestBody RemoveTodoReqVO param) {
        int ret = 0;

        log.debug("delete removeSite" + param.toString());

        ret = todoService.removeTodo(param);

        return ResponseEntity.ok(ret);
    }

}
