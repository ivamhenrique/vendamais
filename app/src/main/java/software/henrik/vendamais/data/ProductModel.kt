package software.henrik.vendamais.data

data class ProductModel(
    var name: String,
    var number: Int,
    var unitaryValue: Float,
    var amount: Float,
) {
    init {
        amount = unitaryValue * number
    }
}