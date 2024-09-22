package example.com

import example.com.factory.ProductsFactory
import example.com.plugins.configureMonitoring
import example.com.plugins.configureRouting
import example.com.plugins.configureSerialization
import io.ktor.server.application.Application

fun main(args: Array<String>) {
    ProductsFactory.generateProducts()
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
