package com.web.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class todoControllerJpa {
  private ToDoService todoService;
  private ToDoRepository todoRepository;

  public todoControllerJpa(ToDoService todoService, ToDoRepository todoRepository) {
    super();
    this.todoService = todoService;
    this.todoRepository = todoRepository;
  }

  @RequestMapping("list-todos")
  public String listAllTodos(ModelMap model) {
    String username = getLoggedInUsername(model);
    List<ToDo> todos = todoRepository.findByUsername(username);
    model.addAttribute("todos", todos);
    return "todoPage";
  }

  @RequestMapping(value = "add-todo", method = RequestMethod.GET)
  public String showNewTodoPage(ModelMap model) {
    String username = getLoggedInUsername(model);
    if (username == null) {
      username = getLoggedInUsername(model);
      model.put("name", username);
    }

    ToDo todo = new ToDo(0, username, "", LocalDate.now().plusYears(1), false);
    model.addAttribute("todo", todo);
    return "AddTodo";
  }

  @RequestMapping(value = "add-todo", method = RequestMethod.POST)
  public String addNewTodo(
    ModelMap model,
    @Valid @ModelAttribute ToDo todo,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "AddTodo";
    }
    String username = getLoggedInUsername(model);
    todo.setUsername(username);
    todoRepository.save(todo);
//    todoService.addTodo(username, todo.getDescription(), todo.getTargetDate(), todo.isDone());
    return "redirect:list-todos";
  }

  @RequestMapping("delete-todo")
  public String delTodo(@RequestParam int id) {
    todoRepository.deleteById(id);
    return "redirect:list-todos";
  }

  @RequestMapping(value = "update-todo", method = RequestMethod.GET)
  public String updateTodoPage(@RequestParam int id, ModelMap model) {
    ToDo todo = todoRepository.findById(id).get();
    model.addAttribute("todo", todo);
    return "AddTodo";
  }

  @RequestMapping(value = "update-todo", method = RequestMethod.POST)
  public String updateTodo(
    ModelMap model,
    @Valid @ModelAttribute ToDo todo,
    BindingResult result
  ) {
    if (result.hasErrors()) {
      return "AddTodo";
    }

    String username = getLoggedInUsername(model);
    todo.setUsername(username);
    todoRepository.save(todo);
    return "redirect:list-todos";
  }
  
  private String getLoggedInUsername(ModelMap model) {
	  Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	  return authentication.getName();
  }

}
