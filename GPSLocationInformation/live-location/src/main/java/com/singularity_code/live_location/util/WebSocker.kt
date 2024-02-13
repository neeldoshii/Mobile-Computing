package com.singularity_code.live_location.util

import android.content.Context
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import okhttp3.*

fun websocket(
    context: Context,
    apiURL: String,
    headers: HashMap<String, String>
): Flow<WebSocket> {
    val error = MutableStateFlow("")

    val coroutineScope = CoroutineScope(Dispatchers.IO)

    val client = OkHttpClient.Builder()
        .addInterceptor(chuckerInterceptor(context))
        .build()

    val request = Request.Builder()
        .apply {
            url(apiURL)
            headers.forEach {
                addHeader(
                    it.key, it.value
                )
            }
        }
        .build()

    val listener = object : WebSocketListener() {
        override fun onOpen(webSocket: WebSocket, response: Response) {
            Log.d("TAG", "WebSocket: Opened")
            super.onOpen(webSocket, response)
        }

        override fun onFailure(webSocket: WebSocket, t: Throwable, response: Response?) {
            super.onFailure(webSocket, t, response)
            Log.d("TAG", "WebSocket: Failed $t")

            // IMPORTANT trigger recreate socket
            val errorLog = hashMapOf(
                "Error Time" to System.currentTimeMillis(),
                "Message" to t.stackTraceToString()
            )

            coroutineScope.launch {
                error.emit(errorLog.toString())
            }
        }

        override fun onClosed(webSocket: WebSocket, code: Int, reason: String) {
            Log.d("TAG", "WebSocket: Closed")
            super.onClosed(webSocket, code, reason)
        }

        override fun onMessage(webSocket: WebSocket, text: String) {
            Log.d("TAG", "WebSocket: Message $text")
            super.onMessage(webSocket, text)
        }
    }

    return error.map {
        client.newWebSocket(
            request,
            listener
        )
    }
}
