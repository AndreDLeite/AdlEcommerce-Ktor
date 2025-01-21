package example.com.factory

import example.com.BASE_URL
import example.com.data.model.Product
import example.com.data.model.ProductListResponse
import java.util.UUID

object ProductsFactory {

    private lateinit var productResponse: ProductListResponse

    fun getAllProducts() = productResponse

    fun generateProducts() {
        productResponse = ProductListResponse(
            products = listOf(
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product1.jpg",
                    name = "Sea Salt",
                    description = "Blame it on Bezos. These were a strong “meh” and they certainly presented as healthy with an off-putting stale aftertaste. I also didn’t like the somewhat cardboard-esque texture, which also resulted in a lack of crunch and size consistency. I suppose these are a good option for those who are more mindful of their diets, but I’m going to need to dunk these in a French onion dip or queso if I’m caving in to a carb craving.",
                    price = "$6,59",
                    rating = 4,
                    latitude = -19.900092,
                    longitude = -43.927783,
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product2.jpg",
                    name = "Avocado Oil",
                    description = "I appreciated the brand’s commitment to using avocado oil instead of canola, but it definitely tasted like these were made in “good health.” And when I have a hankering for binging on a Friday night while watching Netflix and crying about not having a boyfriend, health does not take priority. It does taste potatoey, though, and the texture was a welcome and unexpected hybrid between a regular chip and a kettle-cooked one. But is avocado even trendy anymore? Asking for, uh, a friend.",
                    price = "$7,79",
                    rating = 2,
                    latitude = -19.908242,
                    longitude = -43.919147
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product3.jpg",
                    name = "Dirty Deli Style",
                    description = "I really dug the air bubbles that made them taste and feel more small-batch and artisanal, but these were oilier than my forehead. And I’m a third-generation Sicilian if that helps to put things in perspective. The flavor was there, the crunch was delightful, but it’s not a bag you’re going to want to finish in one sitting (unless nausea is your thing, in which case, have a ball!).",
                    price = "$4,79",
                    rating = 3,
                    latitude = -19.905053,
                    longitude = -43.928144,
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product4.jpg",
                    name = "Original Potato Chips",
                    description = "If you’re in a pinch and want to save money, Walmart’s take on the original potato chip is surprisingly a great buy. Sure, it may be Lay’s less attractive cousin, but it maintains the same greasiness, soft texture and sodium punch as its predecessor. My only gripe was that these weren’t as sturdy and, as a result, quite cumbersome to pick up and scoop into my mouth. Otherwise, they’re let’s-stay-in-and-have-a-movie-night-and-avoid-all-humans-approved.",
                    price = "$8,99",
                    rating = 4,
                    latitude = -19.900800,
                    longitude = -43.918311,
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product5.jpg",
                    name = "Lays Kattle Cooked",
                    description = "I am not entirely sure how this was ranked No. 1 by the Washington Post, seeing as I found this chip to be the most bland of the bunch. There were no redeeming qualities other than its hardy crunch (which was fantastic!). Let me reiterate by saying that not a single chip from this assortment was “awful” and I’d happily house an entire bag of these bad boys in one sitting, but it was the one I was least excited about. And they needed more salt — a deal breaker. ",
                    price = "$9,99",
                    rating = 1,
                    latitude = -19.899013,
                    longitude = -43.915149,
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product6.jpg",
                    name = "Utz Original Potato Chips",
                    description = "Here is where I’m going to receive the most hate because Utz is a beloved brand with diehard fans. But please don’t come to my doorstep with torches when I say that these were just OK for me. I’ll admit that the girl on the bag is adorable and the chip is sturdy enough to stand up to most dips, but it genuinely tasted more like a crumbly cracker than a chip. They also made my mouth a bit dry. I’d be curious to see how they fare when coating chicken breast to make fingers or nuggets, so stand by as I embark on this culinary endeavor.",
                    price = "$3,89",
                    rating = 5,
                    latitude = -19.896733,
                    longitude = -43.922785,
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product7.jpg",
                    name = "Wise Golden Original Potato Chips\n",
                    description = "Investing in Wise is a wise choice, but maybe not your best one. While the flavor was superior to most (super potato-forward and an ideal amount of oil and salt), the texture and size inconsistencies were what really threw me. It was as if I got leftover potato slices that happened to be turned into chips (which, ironically, is how Earl Wise kind of created his multi-million dollar company to begin with: by using extra potatoes).",
                    price = "$12,99",
                    rating = 3,
                    latitude = -19.912988,
                    longitude = -43.925587,
                ),
                Product(
                    id = UUID.randomUUID().toString(),
                    image = "$BASE_URL/products/product8.jpg",
                    name = "Lay’s Classic Potato Chips",
                    description = "Come through, grease bomb. Light, airy, salty and just straight-up addictive, it’s one of those nibbles where you look down after 10 minutes and then realize why your doctor has warned you about high cholesterol during every annual physical. They’re simply irresistible and obviously tap into the element of nostalgia, which also makes them comforting. Consider these the gold standard, which is why the bag is yellow.",
                    price = "$15,90",
                    rating = 2,
                    latitude = -19.909459,
                    longitude = -43.9348479,
                ),
            )
        )
    }

    fun getProductById(id: String): Product {
        return productResponse.products.first { it.id == id }
    }

}