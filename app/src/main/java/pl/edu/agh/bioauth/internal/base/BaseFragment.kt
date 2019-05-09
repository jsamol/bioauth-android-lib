package pl.edu.agh.bioauth.internal.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import pl.edu.agh.bioauth.internal.di.Injectable

internal abstract class BaseFragment<T: BaseViewModel> : Fragment(), Injectable {

    protected abstract val viewModelType: Class<T>
    protected abstract val layoutId: Int

    protected val viewModel: T by lazy {
        ViewModelProviders.of(this).get(viewModelType)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!viewModel.isInitialized) {
            viewModel.onInitialized()
        }

        initDependencies()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(layoutId, container, false)

    override fun onDestroy() {
        cleanDependencies()
        super.onDestroy()
    }
}