<<<<<<< HEAD
package com.example.demo.Controller;

import com.example.demo.annotation.Decode;
import com.example.demo.annotation.Timer;
import com.example.demo.dto.User;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){

        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){



        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {


        Thread.sleep(1000*2);

    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.println("put");
        System.out.println(user);
        return user;
    }


}
=======
package com.example.demo.Controller;

import com.example.demo.annotation.Decode;
import com.example.demo.annotation.Timer;
import com.example.demo.dto.User;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id, @RequestParam String name){

        return id + " " + name;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user){



        return user;
    }

    @Timer
    @DeleteMapping("/delete")
    public void delete() throws InterruptedException {


        Thread.sleep(1000*2);

    }

    @Decode
    @PutMapping("/put")
    public User put(@RequestBody User user){
        System.out.println("put");
        System.out.println(user);
        return user;
    }


}
>>>>>>> 9e00205c9a868278d2cee905d8ff0d37ecbb88a6