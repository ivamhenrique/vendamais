package software.henrik.vendamais.data

data class ClientModel(
    var name: String,
    var demandId: Int,
    var demandAmount: Float,
    var listProducts: ArrayList<ProductModel>
)
