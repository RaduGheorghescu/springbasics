package ro.upb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.upb.model.Post;
import ro.upb.service.PostServiceImp;

import java.util.List;

@Controller
public class HomeController {
    private final PostServiceImp postService;
    @Autowired
    public HomeController(PostServiceImp postService){
        this.postService = postService;
    }


    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("posts", postService.findLast3());
        model.addAttribute("featured", postService.findAllByFeaturedIsTrue());
        return "index";
    }
}
