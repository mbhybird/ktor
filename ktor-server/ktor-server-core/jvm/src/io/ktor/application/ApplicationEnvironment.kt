package io.ktor.application

import io.ktor.config.*
import org.slf4j.*
import kotlin.coroutines.*

/**
 * Represents an environment in which [Application] runs
 */
interface ApplicationEnvironment {
    /**
     * Parent coroutine context for an application
     */
    val parentCoroutineContext: CoroutineContext

    /**
     * [ClassLoader] used to load application.
     *
     * Useful for various reflection-based services, like dependency injection.
     */
    val classLoader: ClassLoader

    /**
     * Instance of [Logger] to be used for logging.
     */
    val log: Logger

    /**
     * Configuration for the [Application]
     */
    val config: ApplicationConfig

    /**
     * Provides events on Application lifecycle
     */
    val monitor: ApplicationEvents
}
