package ro.upb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ro.upb.model.Post;
import ro.upb.repository.PostRepository;

import java.util.List;

/**
 * Created by radug on 6/25/2017.
 */
@Component
public class IncarcareDB implements ApplicationRunner {
    @Autowired
    PostRepository postRepository;
    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        postRepository.save(new Post("Test1", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
        postRepository.save(new Post("Test2", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
        postRepository.save(new Post("Test3", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
        postRepository.save(new Post("Test4", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
        postRepository.save(new Post("Test5", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
        postRepository.save(new Post("Test6", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
        postRepository.save(new Post("Test7", "DSAD SDA DAS DAS DAS D ASD ASD ASD AS DAS DAS DAS DAS DSA DAS D SAD ASD ASD AS"));
    }
}
