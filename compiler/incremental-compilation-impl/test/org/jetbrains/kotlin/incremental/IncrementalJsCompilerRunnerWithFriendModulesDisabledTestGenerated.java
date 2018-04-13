/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.incremental;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps-plugin/testData/incremental/js/friendsModuleDisabled")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IncrementalJsCompilerRunnerWithFriendModulesDisabledTestGenerated extends AbstractIncrementalJsCompilerRunnerWithFriendModulesDisabledTest {
    public void testAllFilesPresentInFriendsModuleDisabled() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("jps-plugin/testData/incremental/js/friendsModuleDisabled"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("internalInlineFunctionIsChanged")
    public void testInternalInlineFunctionIsChanged() throws Exception {
        KotlinTestUtils.runTest("jps-plugin/testData/incremental/js/friendsModuleDisabled/internalInlineFunctionIsChanged/", this::doTest);
    }
}
