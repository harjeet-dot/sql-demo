package test.prj.HSDemo.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.prj.HSDemo.models.QuizUser;
import test.prj.HSDemo.service.UserService;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<QuizUser> getQuizUsers(){
        return userService.getAllQuizUsers();
    }
    @GetMapping("/users/{id}")
    public QuizUser getQuizUser(@PathVariable String id){
        return userService.getQuizUser(id);
    }
   // @RequestMapping(method=RequestMethod.POST, value="/users")
    @PostMapping("/users")
    public void addQuizUser(@RequestBody QuizUser quizUser){
        userService.addQuizUser(quizUser);

    }
    @PutMapping("/users")
    public void updateQuizUser(@RequestBody QuizUser quizUser){
        userService.updateQuizUser(quizUser);
    }
    @DeleteMapping("/users/{id}")
    public void deleteQuizUser(@PathVariable String id){
        userService.deleteQuizUser(id);
    }

}
