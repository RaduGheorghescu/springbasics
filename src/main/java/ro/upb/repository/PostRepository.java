package ro.upb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.upb.model.Post;

import java.util.List;

/**
 * Created by radug on 6/25/2017.
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{
}
