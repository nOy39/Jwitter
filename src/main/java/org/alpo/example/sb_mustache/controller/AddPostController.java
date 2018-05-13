package org.alpo.example.sb_mustache.controller;

import org.alpo.example.sb_mustache.domain.Post;
import org.alpo.example.sb_mustache.domain.User;
import org.alpo.example.sb_mustache.repos.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created by @author OGI aka nOy39
 *
 * @Date 11.05.2018
 * @Time 14:49
 */
@Controller
public class AddPostController {

    @Autowired
    private PostRepo postRepo;

    @GetMapping("/add")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String add(Map<String, Object> model) {
        model.put("title","Add new post");
        return "add";
    }

    @PostMapping(value = "/add")
    public String addPost(
            @AuthenticationPrincipal User user,
            @RequestParam String head,
            @RequestParam String body,
            @RequestParam String tag,
            Map<String, Object> form)  {

        Post post = new Post(head, body, tag, user);

        postRepo.save(post);

        return "redirect:/";
    }
}
