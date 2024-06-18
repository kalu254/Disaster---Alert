package com.disaster

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class UserManagementApplication

fun main(args: Array<String>) {
    runApplication<UserManagementApplication>(*args)
}