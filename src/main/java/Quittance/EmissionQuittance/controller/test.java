package Quittance.EmissionQuittance.controller;

import Quittance.EmissionQuittance.exception.ApiRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class test {

    @GetMapping()
    public  String show(){
        throw  new ApiRequestException("wrong  api");
       // return "This is a  test";
    }


}
