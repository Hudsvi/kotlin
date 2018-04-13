/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.imports;

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
public class JsOptimizeImportsTestGenerated extends AbstractJsOptimizeImportsTest {
    @TestMetadata("idea/testData/editor/optimizeImports/js")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Js extends AbstractJsOptimizeImportsTest {
        public void testAllFilesPresentInJs() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/js"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("DefaultJsImports.kt")
        public void testDefaultJsImports() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/js/DefaultJsImports.kt", this::doTest);
        }
    }

    @TestMetadata("idea/testData/editor/optimizeImports/common")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Common extends AbstractJsOptimizeImportsTest {
        public void testAllFilesPresentInCommon() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/common"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
        }

        @TestMetadata("ArrayAccessExpression.kt")
        public void testArrayAccessExpression() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/ArrayAccessExpression.kt", this::doTest);
        }

        @TestMetadata("ClassMemberImported.kt")
        public void testClassMemberImported() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/ClassMemberImported.kt", this::doTest);
        }

        @TestMetadata("ComponentFunction.kt")
        public void testComponentFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/ComponentFunction.kt", this::doTest);
        }

        @TestMetadata("CurrentPackage.kt")
        public void testCurrentPackage() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/CurrentPackage.kt", this::doTest);
        }

        @TestMetadata("DefaultObjectReference.kt")
        public void testDefaultObjectReference() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/DefaultObjectReference.kt", this::doTest);
        }

        @TestMetadata("Enums.kt")
        public void testEnums() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/Enums.kt", this::doTest);
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObject.kt")
        public void testExtensionFunctionalTypeValFromCompanionObject() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObject.kt", this::doTest);
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion.kt")
        public void testExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObjectCallOnCompanion.kt", this::doTest);
        }

        @TestMetadata("ExtensionFunctionalTypeValFromCompanionObjectNonExtCall.kt")
        public void testExtensionFunctionalTypeValFromCompanionObjectNonExtCall() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/ExtensionFunctionalTypeValFromCompanionObjectNonExtCall.kt", this::doTest);
        }

        @TestMetadata("InvokeFunction.kt")
        public void testInvokeFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/InvokeFunction.kt", this::doTest);
        }

        @TestMetadata("IteratorFunction.kt")
        public void testIteratorFunction() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/IteratorFunction.kt", this::doTest);
        }

        @TestMetadata("KT11640.kt")
        public void testKT11640() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/KT11640.kt", this::doTest);
        }

        @TestMetadata("KT11640_1.kt")
        public void testKT11640_1() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/KT11640_1.kt", this::doTest);
        }

        @TestMetadata("KT13689.kt")
        public void testKT13689() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/KT13689.kt", this::doTest);
        }

        @TestMetadata("KT9875.kt")
        public void testKT9875() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/KT9875.kt", this::doTest);
        }

        @TestMetadata("KeywordNames.kt")
        public void testKeywordNames() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/KeywordNames.kt", this::doTest);
        }

        @TestMetadata("Kt2488EnumEntry.kt")
        public void testKt2488EnumEntry() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/Kt2488EnumEntry.kt", this::doTest);
        }

        @TestMetadata("Kt2709.kt")
        public void testKt2709() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/Kt2709.kt", this::doTest);
        }

        @TestMetadata("MemberImports.kt")
        public void testMemberImports() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/MemberImports.kt", this::doTest);
        }

        @TestMetadata("MembersInScope.kt")
        public void testMembersInScope() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/MembersInScope.kt", this::doTest);
        }

        @TestMetadata("NestedClassReferenceOutsideClassBody.kt")
        public void testNestedClassReferenceOutsideClassBody() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/NestedClassReferenceOutsideClassBody.kt", this::doTest);
        }

        @TestMetadata("Overloads.kt")
        public void testOverloads() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/Overloads.kt", this::doTest);
        }

        @TestMetadata("TwoConstructors.kt")
        public void testTwoConstructors() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/TwoConstructors.kt", this::doTest);
        }

        @TestMetadata("TypeAliasUsage.kt")
        public void testTypeAliasUsage() throws Exception {
            KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/TypeAliasUsage.kt", this::doTest);
        }

        @TestMetadata("idea/testData/editor/optimizeImports/common/kt21515")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Kt21515 extends AbstractJsOptimizeImportsTest {
            public void testAllFilesPresentInKt21515() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports/common/kt21515"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
            }

            @TestMetadata("callableReferenceOnClass.kt")
            public void testCallableReferenceOnClass() throws Exception {
                KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/kt21515/callableReferenceOnClass.kt", this::doTest);
            }

            @TestMetadata("callableReferenceOnClassWithCompanion.kt")
            public void testCallableReferenceOnClassWithCompanion() throws Exception {
                KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/kt21515/callableReferenceOnClassWithCompanion.kt", this::doTest);
            }

            @TestMetadata("callableReferenceOnObject.kt")
            public void testCallableReferenceOnObject() throws Exception {
                KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/kt21515/callableReferenceOnObject.kt", this::doTest);
            }

            @TestMetadata("constructor.kt")
            public void testConstructor() throws Exception {
                KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/kt21515/constructor.kt", this::doTest);
            }

            @TestMetadata("typeReference.kt")
            public void testTypeReference() throws Exception {
                KotlinTestUtils.runTest("idea/testData/editor/optimizeImports/common/kt21515/typeReference.kt", this::doTest);
            }
        }
    }
}
