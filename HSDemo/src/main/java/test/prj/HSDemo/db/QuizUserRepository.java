package test.prj.HSDemo.db;


import org.springframework.data.repository.CrudRepository;
import test.prj.HSDemo.models.QuizUser;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String>{
}
