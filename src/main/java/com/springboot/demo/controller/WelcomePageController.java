package com.springboot.demo.controller;


import com.springboot.demo.mapper.TestCaseMapper;
import com.springboot.demo.model.TestCaseResults;
import com.springboot.demo.model.TestPlanResults;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.logging.Logger;


@Controller
public class WelcomePageController {

    Logger log=Logger.getLogger("WelcomePageController.class");

    @Autowired
    TestCaseMapper testCaseMapper;

    @RequestMapping("/")
    public ModelAndView homepage(){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("WelcomePage");

        return modelAndView;
    }

    @RequestMapping(value = "/testcaseresults" ,method = RequestMethod.GET)
    @ResponseBody
    public List<TestCaseResults> getLatestRuns(HttpServletRequest request, HttpServletResponse response){
        String testcaseId=request.getParameter("");
        List<TestCaseResults> testCaseResults=testCaseMapper.getTestcases("20190125151933431");
        log.info("Testcase id is"+testCaseResults.get(0).getPlanid());
        log.info("Welcome Page Called");
        return  testCaseResults;
    }


    @RequestMapping(value = "/testplanresults" ,method = RequestMethod.GET)
    @ResponseBody
    public List<TestPlanResults> getTestPlans(HttpServletRequest request, HttpServletResponse response){
        List<TestPlanResults> testPlanResults=testCaseMapper.getTestPlans();
        log.info("Testcase id is"+testPlanResults.get(0).getPlanid());
        log.info("Welcome Page Called");
        return  testPlanResults;
    }
}
