package com.example.NewsApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NewsController {
    private static final Logger logger = LoggerFactory.getLogger(NewsController.class);

    private List<News> newsList = new ArrayList<>();

    public NewsController() {
        // Adding sample news with image URLs
        newsList.add(new News(1, "Education", "NEET MDS 2024 Result (OUT): Check Toppers List, Category-wise Cutoff", "education.png"));
        newsList.add(new News(2, "Sports", "India wins the Cricket World Cup!", "sports.png"));
        newsList.add(new News(3, "Entertainment", "New Marvel movie breaks box office records!", "entertainment.png"));

        logger.info("Sample news added:");
        for (News news : newsList) {
            logger.info("ID: {}, Category: {}, Description: {}, Image URL: {}", news.getId(), news.getCategory(), news.getDescription(), news.getImageUrl());
        }
    }

    @GetMapping("/list")
    public String listNews(Model model) {
        model.addAttribute("newsList", newsList);
        return "list";
    }

    @GetMapping("/addnews")
    public String showAddNewsForm(Model model) {
        model.addAttribute("news", new News());
        return "addnews";
    }

    @PostMapping("/addnews")
    public String addNews(@ModelAttribute News news) {
        news.setId(newsList.size() + 1);
        newsList.add(news);
        return "redirect:/list";
    }
}
