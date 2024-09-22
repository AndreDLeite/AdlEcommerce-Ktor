package example.com.routes

import example.com.factory.ProductsFactory
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get

fun Route.listProducts() {
    get("/products-list") {
        call.respond(
            HttpStatusCode.OK,
            ProductsFactory.getAllProducts()
        )
    }

    get("/product-info") {
        call.parameters["productId"]?.let {productId ->
            call.respond(
                HttpStatusCode.OK,
                ProductsFactory.getProductById(productId)
            )
        }
    }
}