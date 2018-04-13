/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.jvm.compiler;

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
@RunWith(JUnit3RunnerWithInners.class)
public class LoadJava8TestGenerated extends AbstractLoadJava8Test {
    @TestMetadata("compiler/testData/loadJava8/compiledJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class CompiledJava extends AbstractLoadJava8Test {
        public void testAllFilesPresentInCompiledJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/compiledJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("InnerClassTypeAnnotation.java")
        public void testInnerClassTypeAnnotation() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/compiledJava/InnerClassTypeAnnotation.java", this::doTestCompiledJava);
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/compiledJava/MapRemove.java", this::doTestCompiledJava);
        }

        @TestMetadata("TypeAnnotations.java")
        public void testTypeAnnotations() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/compiledJava/TypeAnnotations.java", this::doTestCompiledJava);
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/compiledJava/TypeParameterAnnotations.java", this::doTestCompiledJava);
        }
    }

    @TestMetadata("compiler/testData/loadJava8/sourceJava")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class SourceJava extends AbstractLoadJava8Test {
        public void testAllFilesPresentInSourceJava() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/loadJava8/sourceJava"), Pattern.compile("^(.+)\\.java$"), TargetBackend.ANY, true);
        }

        @TestMetadata("MapRemove.java")
        public void testMapRemove() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/sourceJava/MapRemove.java", this::doTestSourceJava);
        }

        @TestMetadata("TypeAnnotations.java")
        public void testTypeAnnotations() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/sourceJava/TypeAnnotations.java", this::doTestSourceJava);
        }

        @TestMetadata("TypeParameterAnnotations.java")
        public void testTypeParameterAnnotations() throws Exception {
            KotlinTestUtils.runTest("compiler/testData/loadJava8/sourceJava/TypeParameterAnnotations.java", this::doTestSourceJava);
        }
    }
}
