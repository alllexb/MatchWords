package ua.kiev.allexb.matchwords.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.kiev.allexb.matchwords.model.WordPair;
import ua.kiev.allexb.matchwords.service.WordPairService;

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

    @RequestMapping(value = {"/", "/start", ""}, method = RequestMethod.GET)
    private ModelAndView prepareTest() {
        ModelAndView modelAndView = new ModelAndView();

//        modelAndView.addObject("pair_number", 10);
//        modelAndView.addObject("category", "room");

        modelAndView.setViewName("prepare_test");
        return modelAndView;
    }

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    private ModelAndView startTest(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        int count = Integer.valueOf(request.getParameter("pairNumber"));
        String category = request.getParameter("category").toLowerCase();

        List<WordPair> wordPairs = wordPairService.getSizedByCategory(count, category);

        modelAndView.addObject("word_pairs", wordPairs);
        modelAndView.setViewName("word_pairs");

        return modelAndView;
    }
}
