package com.example.gitflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitFlowApplication

fun main(args: Array<String>) {
    runApplication<GitFlowApplication>(*args)
}
