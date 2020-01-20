package dev.ricardoantolin.multiplatform.shared

import com.squareup.sqldelight.db.SqlDriver
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

// This works on iOS only.
actual fun getDriver(): SqlDriver? {
    return null
}

actual val mainDispatcher = Dispatchers.Main as CoroutineDispatcher
actual val backgroundDispatcher = Dispatchers.Default