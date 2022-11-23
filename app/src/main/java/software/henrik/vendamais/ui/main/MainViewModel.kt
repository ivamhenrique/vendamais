package software.henrik.vendamais.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import software.henrik.vendamais.util.FormatNumber

class MainViewModel : ViewModel() {

    private val _total = MutableLiveData<String>()
    val total: LiveData<String> get() = _total

    init {
        _total.value = FormatNumber.forBrazilianCurrency(10023.21F)
    }
}