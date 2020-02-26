package com.tutal.didikle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentResource {

    @GetMapping
    public String shareComment() {

        System.out.println("Comment push successful...");

        return "200 OK";
    }

}
