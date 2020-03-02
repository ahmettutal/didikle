package com.tutal.didikle;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentResource {

    private DidikService didikService;

    public CommentResource(DidikService didikService) {
        this.didikService = didikService;
    }

    @GetMapping
    public List<DidikModel> getAll(@RequestParam String url) {

        System.out.println("getAll");

        return didikService.findByUrl(url);
    }

    @GetMapping("/{id}")
    public DidikModel getById(@PathVariable Long id) {

        System.out.println("getting with id: " + id);

        return didikService.getById(id);
    }

    @PostMapping("/didikle")
    public DidikModel shareComment(@RequestBody DidikModel didikModel) {

        System.out.println("didikking start");

        final DidikModel save = didikService.save(didikModel);

        System.out.println("didikking end with id: " + save.getId());

        return save;
    }

}
