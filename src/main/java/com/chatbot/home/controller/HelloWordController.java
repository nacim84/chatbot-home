package com.chatbot.home.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admnrabi on 11/07/2018.
 */

@RestController
@RequestMapping(value={"/api"})
public class HelloWordController {

    @ApiOperation(value = "/api/home/helloword", notes = "Get helloworld")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Get helloworld")})
    @GetMapping("/helloword")
    @ResponseStatus(HttpStatus.OK)
    public String helloWorld() {
        return "Hello World !";
    }
}
