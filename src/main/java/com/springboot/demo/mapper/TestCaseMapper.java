package com.springboot.demo.mapper;

import com.springboot.demo.model.TestCaseResults;
import com.springboot.demo.model.TestPlanResults;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TestCaseMapper {

     List<TestCaseResults> getTestcases(String testPlanId);
     List<TestPlanResults> getTestPlans(@Param("currentdate") String currentdate, @Param("nextdate") String nextdate);
     List<String> getDistinctDates();

}
