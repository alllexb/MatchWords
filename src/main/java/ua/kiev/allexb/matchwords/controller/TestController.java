package ua.kiev.allexb.matchwords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.kiev.allexb.matchwords.model.WordPair;
import ua.kiev.allexb.matchwords.model.WordPairsCategory;
import ua.kiev.allexb.matchwords.service.WordPairService;
import ua.kiev.allexb.matchwords.service.WordPairsCategoryService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author allexb
 * @version 1.0 14.12.2015
 */

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    private WordPairService wordPairService;

    @Autowired
    private WordPairsCategoryService wordPairsCategoryService;

    @RequestMapping(value = {"/", "/start", ""}, method = RequestMethod.GET)
    private ModelAndView prepareTest() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("prepare-test");
        return modelAndView;
    }

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    private ModelAndView startTest(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        int number = Integer.valueOf(request.getParameter("pairNumber"));
        WordPairsCategory category = wordPairsCategoryService.getByTitle(request.getParameter("category").toLowerCase());
        List<WordPair> wordPairs = wordPairService.getSizedByCategory(number, category);

        modelAndView.addObject("word_pairs", wordPairs);
        modelAndView.setViewName("test-performance");

        return modelAndView;
    }
}
