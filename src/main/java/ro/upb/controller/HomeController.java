package ro.upb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.upb.model.Post;
import ro.upb.repository.PostRepository;

import java.util.List;

/**
 * Created by radug on 6/25/2017.
 */

@Controller
public class HomeController {
    @Autowired
    PostRepository postRepository;

    @GetMapping("/")
    public String home(Model model){
        List<Post> posts = postRepository.findAll().subList(0,4);
        model.addAttribute("posts", posts);
        return "index";
    }
}
