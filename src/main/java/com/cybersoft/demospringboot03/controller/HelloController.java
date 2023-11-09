package com.cybersoft.demospringboot03.controller;

import com.cybersoft.demospringboot03.payload.request.LoginRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
    *@Controller:  Dùng để định nghĩa đường dẫn mà nội dung đường dẫn trả ra html
    * @ResponeBody:  Giúp cho @Controller có thể trả ra kiểu String dùng để viết API
 *
    * @RestController: Là sự kết hợp giữa @Controller và @ResponeBody => viết API
 *
    */
@RestController
@RequestMapping("/hello")
public class HelloController {

    // tham số truyền trên trình duyệt : @RequestParam
    // tham số truyền ngầm: @RequestParam
    // tham số đóng vai trò như là một đường dẫn: @PathVariable
    // tham số truyền ngầm nhưng là đối tượng : @RequestBody



    @GetMapping("")
    public String hello(@RequestParam  String hoten, @RequestParam int tuoi){
        return "Hello Spring boot " + hoten + "- tuoi: " + tuoi;
    }
    @PostMapping ("/cybersoft")
    public String helloCybersoft(@RequestBody LoginRequest loginRequest ){
        return "Hello Spring Cybersoft "+ loginRequest.getUsername() + " - " + loginRequest.getPassword();
    }
    @PutMapping ("/update/{id}")
    public ResponseEntity <String> update (@PathVariable int id ){
            return new ResponseEntity<>("Update" + id, HttpStatus.OK);
    }
}
