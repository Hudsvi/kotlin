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
@TestMetadata("compiler/testData/compileKotlinAgainstJava")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CompileKotlinAgainstJavaTestGenerated extends AbstractCompileKotlinAgainstJavaTest {
    @TestMetadata("AbstractClass.kt")
    public void testAbstractClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/AbstractClass.kt", this::doTest);
    }

    @TestMetadata("AbstractEnum.kt")
    public void testAbstractEnum() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/AbstractEnum.kt", this::doTest);
    }

    public void testAllFilesPresentInCompileKotlinAgainstJava() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/compileKotlinAgainstJava"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("AnnotationWithArguments.kt")
    public void testAnnotationWithArguments() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/AnnotationWithArguments.kt", this::doTest);
    }

    @TestMetadata("AnnotationWithField.kt")
    public void testAnnotationWithField() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/AnnotationWithField.kt", this::doTest);
    }

    @TestMetadata("AsteriskInImport.kt")
    public void testAsteriskInImport() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/AsteriskInImport.kt", this::doTest);
    }

    @TestMetadata("CheckKotlinStub.kt")
    public void testCheckKotlinStub() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/CheckKotlinStub.kt", this::doTest);
    }

    @TestMetadata("CheckNotNull.kt")
    public void testCheckNotNull() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/CheckNotNull.kt", this::doTest);
    }

    @TestMetadata("Class.kt")
    public void testClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Class.kt", this::doTest);
    }

    @TestMetadata("ClassWithNestedEnum.kt")
    public void testClassWithNestedEnum() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ClassWithNestedEnum.kt", this::doTest);
    }

    @TestMetadata("ClassWithTypeParameter.kt")
    public void testClassWithTypeParameter() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ClassWithTypeParameter.kt", this::doTest);
    }

    @TestMetadata("CyclicDependencies.kt")
    public void testCyclicDependencies() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/CyclicDependencies.kt", this::doTest);
    }

    @TestMetadata("DefaultModifier.kt")
    public void testDefaultModifier() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/DefaultModifier.kt", this::doTest);
    }

    @TestMetadata("EnclosingClassInner.kt")
    public void testEnclosingClassInner() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/EnclosingClassInner.kt", this::doTest);
    }

    @TestMetadata("Enum.kt")
    public void testEnum() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Enum.kt", this::doTest);
    }

    @TestMetadata("EnumName.kt")
    public void testEnumName() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/EnumName.kt", this::doTest);
    }

    @TestMetadata("EnumValues.kt")
    public void testEnumValues() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/EnumValues.kt", this::doTest);
    }

    @TestMetadata("Inheritance.kt")
    public void testInheritance() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Inheritance.kt", this::doTest);
    }

    @TestMetadata("InheritedInner.kt")
    public void testInheritedInner() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InheritedInner.kt", this::doTest);
    }

    @TestMetadata("InnerCanonicalName.kt")
    public void testInnerCanonicalName() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InnerCanonicalName.kt", this::doTest);
    }

    @TestMetadata("InnerClass.kt")
    public void testInnerClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InnerClass.kt", this::doTest);
    }

    @TestMetadata("InnerClassFromAsteriskImport.kt")
    public void testInnerClassFromAsteriskImport() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InnerClassFromAsteriskImport.kt", this::doTest);
    }

    @TestMetadata("InnerClassFromImport.kt")
    public void testInnerClassFromImport() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InnerClassFromImport.kt", this::doTest);
    }

    @TestMetadata("InnerWithGenericOuter.kt")
    public void testInnerWithGenericOuter() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InnerWithGenericOuter.kt", this::doTest);
    }

    @TestMetadata("Interface.kt")
    public void testInterface() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Interface.kt", this::doTest);
    }

    @TestMetadata("InterfaceField.kt")
    public void testInterfaceField() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InterfaceField.kt", this::doTest);
    }

    @TestMetadata("InterfaceMemberClass.kt")
    public void testInterfaceMemberClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InterfaceMemberClass.kt", this::doTest);
    }

    @TestMetadata("InterfaceWithDefault.kt")
    public void testInterfaceWithDefault() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/InterfaceWithDefault.kt", this::doTest);
    }

    @TestMetadata("JavaLangClass.kt")
    public void testJavaLangClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/JavaLangClass.kt", this::doTest);
    }

    @TestMetadata("ListImpl.kt")
    public void testListImpl() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ListImpl.kt", this::doTest);
    }

    @TestMetadata("MapExample.kt")
    public void testMapExample() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/MapExample.kt", this::doTest);
    }

    @TestMetadata("Method.kt")
    public void testMethod() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Method.kt", this::doTest);
    }

    @TestMetadata("MethodWithArgument.kt")
    public void testMethodWithArgument() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/MethodWithArgument.kt", this::doTest);
    }

    @TestMetadata("MethodWithSeveralTypeParameters.kt")
    public void testMethodWithSeveralTypeParameters() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/MethodWithSeveralTypeParameters.kt", this::doTest);
    }

    @TestMetadata("MethodWithTypeParameter.kt")
    public void testMethodWithTypeParameter() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/MethodWithTypeParameter.kt", this::doTest);
    }

    @TestMetadata("MethodWithWildcard.kt")
    public void testMethodWithWildcard() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/MethodWithWildcard.kt", this::doTest);
    }

    @TestMetadata("Nesting.kt")
    public void testNesting() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Nesting.kt", this::doTest);
    }

    @TestMetadata("RawReturnType.kt")
    public void testRawReturnType() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/RawReturnType.kt", this::doTest);
    }

    @TestMetadata("ReturnEnum.kt")
    public void testReturnEnum() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnEnum.kt", this::doTest);
    }

    @TestMetadata("ReturnInnerClass.kt")
    public void testReturnInnerClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnInnerClass.kt", this::doTest);
    }

    @TestMetadata("ReturnInnerInInner.kt")
    public void testReturnInnerInInner() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnInnerInInner.kt", this::doTest);
    }

    @TestMetadata("ReturnInnerInner.kt")
    public void testReturnInnerInner() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnInnerInner.kt", this::doTest);
    }

    @TestMetadata("ReturnNested.kt")
    public void testReturnNested() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnNested.kt", this::doTest);
    }

    @TestMetadata("ReturnNestedFQ.kt")
    public void testReturnNestedFQ() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnNestedFQ.kt", this::doTest);
    }

    @TestMetadata("ReturnType.kt")
    public void testReturnType() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnType.kt", this::doTest);
    }

    @TestMetadata("ReturnTypeResolution.kt")
    public void testReturnTypeResolution() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/ReturnTypeResolution.kt", this::doTest);
    }

    @TestMetadata("SeveralInnerClasses.kt")
    public void testSeveralInnerClasses() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/SeveralInnerClasses.kt", this::doTest);
    }

    @TestMetadata("SimpleAnnotation.kt")
    public void testSimpleAnnotation() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/SimpleAnnotation.kt", this::doTest);
    }

    @TestMetadata("SimpleWildcard.kt")
    public void testSimpleWildcard() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/SimpleWildcard.kt", this::doTest);
    }

    @TestMetadata("Singleton.kt")
    public void testSingleton() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Singleton.kt", this::doTest);
    }

    @TestMetadata("StaticNestedClass.kt")
    public void testStaticNestedClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/StaticNestedClass.kt", this::doTest);
    }

    @TestMetadata("TypeArgumentInSuperType.kt")
    public void testTypeArgumentInSuperType() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/TypeArgumentInSuperType.kt", this::doTest);
    }

    @TestMetadata("TypeParameter.kt")
    public void testTypeParameter() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/TypeParameter.kt", this::doTest);
    }

    @TestMetadata("UseKtClass.kt")
    public void testUseKtClass() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/UseKtClass.kt", this::doTest);
    }

    @TestMetadata("Vararg.kt")
    public void testVararg() throws Exception {
        KotlinTestUtils.runTest("compiler/testData/compileKotlinAgainstJava/Vararg.kt", this::doTest);
    }
}
