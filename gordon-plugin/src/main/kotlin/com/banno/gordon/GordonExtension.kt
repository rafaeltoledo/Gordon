package com.banno.gordon

import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.property
import javax.inject.Inject

abstract class GordonExtension @Inject constructor(
    objects: ObjectFactory
) {

    val poolingStrategy: Property<PoolingStrategy> = objects.property()
    val retryQuota: Property<Int> = objects.property()
    val testTimeoutMillis: Property<Long> = objects.property()
    val testFilter: Property<String> = objects.property()

    init {
        poolingStrategy.convention(PoolingStrategy.EachDevice)
        retryQuota.convention(0)
        testTimeoutMillis.convention(120_000)
        testFilter.convention("")
    }
}
