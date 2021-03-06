package com.tutal.didikle.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DidikResource {

    private DidikService didikService;

    public DidikResource(DidikService didikService) {
        this.didikService = didikService;
    }

    @PostMapping("/find-by-url")
    public List<DidikModel> getAll(@RequestBody DidikRequest request) {

        System.out.println("getAll request: " + request);

        return didikService.findByUrl(request.getUrl());
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

        System.out.println("didikking end with: " + save);

        return save;
    }

}
