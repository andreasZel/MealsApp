package eu.tutorial.mealsapp

data class Category(
    val idCategory: String,
    val strCategory: String,
    val strCategoryThumb: String,
    val strCategoryDescription: String
)

data class CatrgoriesResponse(val categories: List<Category>)

