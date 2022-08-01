package com.example.loginapi.controller;

import com.example.loginapi.dto.TestDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Minwoo Kim
 * @date 2022/08/02
 */
@RestController
public class TestController {

    @GetMapping("/")
    public @ResponseBody TestDTO test(){
        TestDTO testDTO = new TestDTO();
        testDTO.setTitle("A");
        testDTO.setContent("B");
        testDTO.setCategory("C");
        return testDTO;
    }

}
