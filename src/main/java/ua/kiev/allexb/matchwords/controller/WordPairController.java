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
 * @version 1.0 18.12.2015
 */

@Controller
@RequestMapping(value = "/dictionary")
public class WordPairController {

    @Autowired
    private WordPairService wordPairService;

    @RequestMapping(value = "/word_pairs", method = RequestMethod.GET)
    public ModelAndView WordPairList (HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        if(request.getParameter("count") != null && !request.getParameter("count").equals("")) {
            int count = Integer.valueOf(request.getParameter("count"));
            List<WordPair> wordPairs = wordPairService.getSized(count);
            modelAndView.addObject("word_pairs", wordPairs);
            modelAndView.setViewName("word_pairs");
        } else {
            List<WordPair> wordPairs = wordPairService.getAll();

            modelAndView.addObject("word_pairs", wordPairs);
            modelAndView.setViewName("word_pairs");
        }
        return modelAndView;
    }


}
