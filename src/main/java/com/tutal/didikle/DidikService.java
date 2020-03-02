package com.tutal.didikle;

import org.springframework.stereotype.Service;

@Service
public class DidikService {

    private DidikRepository didikRepository;

    public DidikService(DidikRepository didikRepository) {
        this.didikRepository = didikRepository;
    }


    public DidikModel save(DidikModel didikModel) {
        return didikRepository.save(didikModel);
    }

    public DidikModel getById(Long id) {
        return didikRepository.findById(id).orElse(null);
    }
}
