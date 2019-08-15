package tz.go.tasac.controllertest.repo;

import tz.go.tasac.controllertest.model.Todo;

public interface TodoRepository extends BaseRepository<Todo, Long> {

    //Query Method Example
    Todo findTodoById(Long id);
}
