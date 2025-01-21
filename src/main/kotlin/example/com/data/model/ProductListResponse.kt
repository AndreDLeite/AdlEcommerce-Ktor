package example.com.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ProductListResponse(
    val products: List<Product>
)
