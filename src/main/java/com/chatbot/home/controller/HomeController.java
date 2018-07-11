package com.chatbot.home.controller;

import com.chatbot.home.dto.ParametersDto;
import com.chatbot.home.dto.QueryDto;
import com.chatbot.home.dto.QueryResultDto;
import com.chatbot.home.dto.ResponseDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by admnrabi on 10/07/2018.
 */

@RestController
@RequestMapping(value="/api/home")
public class HomeController {

    @ApiOperation(value = "/api/home/calc", notes = "Get calcul")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Get calcul")})
    @PostMapping("/calc")
    @ResponseStatus(HttpStatus.OK)
    public ResponseDto getCalcul(@Valid @RequestBody QueryDto queryDto) {

        ResponseDto response = new ResponseDto();

        QueryResultDto queryResult = queryDto.getQueryResultDto();

        ParametersDto parameters = queryResult.getParametersDto();

        String session = queryDto.getSession();

        String operation = parameters.getOperation();
        Long a = parameters.getA();
        Long b = parameters.getB();
        Long result = new Long(0);

        switch (operation) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;
        }

        //Preparation de la réponse
        response.setFulfillmentText("The result is : " + result);

//        OutputContextsDto context = new OutputContextsDto();
//        context.setName(session+"/contexts/");
//
//        List<OutputContextsDto> contexts = new ArrayList<OutputContextsDto>();
//        contexts.add(context);
//
//        response.setOutputContexts(contexts);

    return response;
    }
}
