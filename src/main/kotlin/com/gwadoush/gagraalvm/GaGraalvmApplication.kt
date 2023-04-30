package com.gwadoush.gagraalvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GaGraalvmApplication

fun main(args: Array<String>) {
    runApplication<GaGraalvmApplication>(*args)
}
