package example.com.plugins

import example.com.routes.listProducts
import io.ktor.server.application.Application
import io.ktor.server.http.content.staticResources
import io.ktor.server.routing.routing

fun Application.configureRouting() {
    routing {
        listProducts()

        // Static plugin. Try to access `/static/index.html`
        staticResources("/", "static")
    }
}
