package example.com.routes

import example.com.factory.ProductsFactory
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.encodeToJsonElement

fun Route.listProducts() {
    get("/products-list") {
        call.respond(
            HttpStatusCode.OK,
            ProductsFactory.getAllProducts()
        )
    }

    get("/json/products-list") {
        val elements = ProductsFactory.getAllProducts()
        val jsonResponse = Json.encodeToJsonElement(elements)
        call.respond(
            HttpStatusCode.OK,
            jsonResponse
        )
    }

    get("/product-info") {
        call.parameters["productId"]?.let { productId ->
            call.respond(
                HttpStatusCode.OK,
                ProductsFactory.getProductById(productId)
            )
        }
    }

    get("/json/product-info") {
        call.parameters["productId"]?.let {productId ->
            val product = ProductsFactory.getProductById(productId)
            val response = Json.encodeToJsonElement(product)
            call.respond(
                HttpStatusCode.OK,
                response
            )
        }
    }
}