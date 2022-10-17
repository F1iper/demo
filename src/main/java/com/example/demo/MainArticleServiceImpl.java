package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainArticleServiceImpl implements MainArticleService {
    
    private final MainArticleRepository mainArticleRepository;
    
    @Override
    public MainArticle execute(final MainArticle mainArticle) {
        return mainArticleRepository.save(mainArticle);
    }
}
