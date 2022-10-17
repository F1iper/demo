package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mainConfig")
@RequiredArgsConstructor
public class MainConfigurationController {
    
    private final MainArticleRepository mainArticleRepository;
    private final MainArticleService mainArticleService;
    
    @GetMapping
    public List<MainArticle> articles() {
        return mainArticleRepository.findAll();
    }
    
    @PostMapping
    public ResponseEntity<MainArticle> publish(@RequestBody MainArticle mainArticle) {
        return new ResponseEntity<>(mainArticleService.execute(mainArticle), HttpStatus.OK);
    }
    
}
