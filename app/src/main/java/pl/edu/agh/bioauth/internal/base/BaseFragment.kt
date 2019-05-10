package pl.edu.agh.bioauth.internal.base

import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
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

    protected inline fun proceedOrRequestPermissions(permissionsRequestCode: Int,
                                                             vararg permissions: String,
                                                             onPermissionsGranted: () -> Unit) {
        val permissionsGranted = activity?.let { activity ->
            permissions
                .map { ContextCompat.checkSelfPermission(activity, it) == PackageManager.PERMISSION_GRANTED }
                .fold(true, Boolean::and)
        }

        if (permissionsGranted == true) {
            onPermissionsGranted()
        } else {
            requestPermissions(permissionsRequestCode, *permissions)
        }
    }

    protected fun requestPermissions(requestCode: Int, vararg permissions: String) {
        activity?.let { ActivityCompat.requestPermissions(it, permissions, requestCode) }
    }
}