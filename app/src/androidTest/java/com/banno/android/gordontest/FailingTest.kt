package com.banno.android.gordontest

import junit.framework.Assert.fail
import org.junit.Test

class FailingTest {
    @Test fun failure1() = fail()
    @Test fun failure2() = fail()
    @Test fun failure3() = fail()
}