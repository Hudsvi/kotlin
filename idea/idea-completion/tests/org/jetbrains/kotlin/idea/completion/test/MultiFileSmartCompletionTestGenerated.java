/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.completion.test;

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
@TestMetadata("idea/idea-completion/testData/smartMultiFile")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class MultiFileSmartCompletionTestGenerated extends AbstractMultiFileSmartCompletionTest {
    public void testAllFilesPresentInSmartMultiFile() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/idea-completion/testData/smartMultiFile"), Pattern.compile("^([^\\.]+)$"), TargetBackend.ANY, false);
    }

    @TestMetadata("AnonymousObjectGenericJava")
    public void testAnonymousObjectGenericJava() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/AnonymousObjectGenericJava/", this::doTest);
    }

    @TestMetadata("CallableReferenceNotImported")
    public void testCallableReferenceNotImported() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/CallableReferenceNotImported/", this::doTest);
    }

    @TestMetadata("CallablesInExcludedPackage")
    public void testCallablesInExcludedPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/CallablesInExcludedPackage/", this::doTest);
    }

    @TestMetadata("FunctionFromAnotherPackage")
    public void testFunctionFromAnotherPackage() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/FunctionFromAnotherPackage/", this::doTest);
    }

    @TestMetadata("GenericInheritors1")
    public void testGenericInheritors1() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/GenericInheritors1/", this::doTest);
    }

    @TestMetadata("GenericInheritors2")
    public void testGenericInheritors2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/GenericInheritors2/", this::doTest);
    }

    @TestMetadata("GenericInheritors3")
    public void testGenericInheritors3() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/GenericInheritors3/", this::doTest);
    }

    @TestMetadata("GenericInheritors4")
    public void testGenericInheritors4() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/GenericInheritors4/", this::doTest);
    }

    @TestMetadata("InheritorInTheSameFile")
    public void testInheritorInTheSameFile() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/InheritorInTheSameFile/", this::doTest);
    }

    @TestMetadata("Inheritors")
    public void testInheritors() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/Inheritors/", this::doTest);
    }

    @TestMetadata("InheritorsAndMultipleExpectedTypes")
    public void testInheritorsAndMultipleExpectedTypes() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/InheritorsAndMultipleExpectedTypes/", this::doTest);
    }

    @TestMetadata("JavaStaticMethodArgument")
    public void testJavaStaticMethodArgument() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/JavaStaticMethodArgument/", this::doTest);
    }

    @TestMetadata("JavaStaticMethodArgument2")
    public void testJavaStaticMethodArgument2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/JavaStaticMethodArgument2/", this::doTest);
    }

    @TestMetadata("KT_8751")
    public void testKT_8751() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/KT_8751/", this::doTest);
    }

    @TestMetadata("KT_8751_2")
    public void testKT_8751_2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/KT_8751_2/", this::doTest);
    }

    @TestMetadata("NestedClassAfterAs")
    public void testNestedClassAfterAs() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/NestedClassAfterAs/", this::doTest);
    }

    @TestMetadata("NoObjectDuplication")
    public void testNoObjectDuplication() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/NoObjectDuplication/", this::doTest);
    }

    @TestMetadata("NotImportedContains")
    public void testNotImportedContains() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/NotImportedContains/", this::doTest);
    }

    @TestMetadata("NotImportedGetValue")
    public void testNotImportedGetValue() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/NotImportedGetValue/", this::doTest);
    }

    @TestMetadata("StaticMembers1")
    public void testStaticMembers1() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/StaticMembers1/", this::doTest);
    }

    @TestMetadata("StaticMembers2")
    public void testStaticMembers2() throws Exception {
        KotlinTestUtils.runTest("idea/idea-completion/testData/smartMultiFile/StaticMembers2/", this::doTest);
    }
}
