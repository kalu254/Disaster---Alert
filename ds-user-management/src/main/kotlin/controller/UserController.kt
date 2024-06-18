package com.disaster.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Exposes APIs for user management for disaster app
 * All endpoints for user management should be declared here
 * Lets ensure users are properly taken care of
 * @author KaluDev - kaluarichama@gmail.com
 */

@RestController
@RequestMapping("/api/v1/user")
class UserController {

    @GetMapping("/test")
    fun test(): String { return "welcome to disasters mando"}
}