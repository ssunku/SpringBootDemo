package com.springboot.demo.mapper;

import com.springboot.demo.model.TestCaseResults;
import com.springboot.demo.model.TestPlanResults;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestCaseMapper {

     List<TestCaseResults> getTestcases(String testPlanId);
     List<TestPlanResults> getTestPlans();

}
