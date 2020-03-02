package com.tutal.didikle;

import org.springframework.web.bind.annotation.*;

@RestController
public class CommentResource {

    private DidikService didikService;

    public CommentResource(DidikService didikService) {
        this.didikService = didikService;
    }

    @GetMapping
    public String get() {

        System.out.println("Comment push successful...");

        return "200 OK";
    }

    @GetMapping("/{id}")
    public DidikModel getById(@PathVariable Long id) {

        System.out.println("getting with id: " + id);

        return didikService.getById(id);
    }

    @PostMapping("/didikle")
    public DidikModel shareComment(@RequestParam String url, @RequestParam String didik) {

        System.out.println("didikking start");

        DidikModel didikModel = new DidikModel();
        didikModel.setUrl(url);
        didikModel.setDidikle(didik);

        final DidikModel save = didikService.save(didikModel);

        System.out.println("didikking end with id: " + save.getId());

        return save;
    }

}
