package software.henrik.vendamais.util

import java.text.DecimalFormat
import java.util.*

object FormatNumber {
    fun forBrazilianCurrency(value: Float): String {
        val brazilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
        return brazilianFormat.format(value)
    }
}