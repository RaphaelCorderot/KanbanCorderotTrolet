package com.example.Controller;

import com.example.Models.User;
import com.example.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path="/user/AddUser",consumes = "application/json", produces = "application/json") // Map ONLY POST Requests
    public @ResponseBody
    User addNewUser (@RequestBody User user ) {
        return this.userService.SaveUser(user);
    }

    @PostMapping(path="/user/addUserByName") // Map ONLY POST Requests
    public @ResponseBody
    User addNewUser (@RequestParam String firstname, @RequestParam String lastname) {
        User n = new User();
        n.setFirstname(firstname);
        n.setLastname(lastname);
        var val = this.userService.SaveUser(n);
        return val;
    }
    @DeleteMapping("/user/{id}")
    public boolean deleteEmployee(@PathVariable(value = "id") Long userId)
    {
     if(userId==null)
     {
         return false;
     }
     return this.userService.deleteUser(userId);
    }
}
