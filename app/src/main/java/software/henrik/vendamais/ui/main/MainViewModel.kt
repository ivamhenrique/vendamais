package software.henrik.vendamais.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.text.DecimalFormat
import java.util.*

class MainViewModel : ViewModel() {

    private val _total = MutableLiveData<String>()
    val total: LiveData<String> get() = _total

    init {
        _total.value = formatForBrazilianCurrency(10023.21F)
    }

    private fun formatForBrazilianCurrency(value: Float): String {
        val brazilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt", "br"))
        return brazilianFormat.format(value)
    }
}