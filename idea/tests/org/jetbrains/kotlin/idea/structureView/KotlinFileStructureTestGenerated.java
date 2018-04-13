/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.structureView;

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
@TestMetadata("idea/testData/structureView/fileStructure")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinFileStructureTestGenerated extends AbstractKotlinFileStructureTest {
    public void testAllFilesPresentInFileStructure() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/structureView/fileStructure"), Pattern.compile("^([^.]+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("AnonymousObjectMembers.kt")
    public void testAnonymousObjectMembers() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/AnonymousObjectMembers.kt", this::doTest);
    }

    @TestMetadata("CheckLocationForKotlin.kt")
    public void testCheckLocationForKotlin() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/CheckLocationForKotlin.kt", this::doTest);
    }

    @TestMetadata("CheckMemberLocationForJava.kt")
    public void testCheckMemberLocationForJava() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/CheckMemberLocationForJava.kt", this::doTest);
    }

    @TestMetadata("DoNotShowParentsInLocationJava.kt")
    public void testDoNotShowParentsInLocationJava() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/DoNotShowParentsInLocationJava.kt", this::doTest);
    }

    @TestMetadata("EmptyFile.kt")
    public void testEmptyFile() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/EmptyFile.kt", this::doTest);
    }

    @TestMetadata("InheritedDelegationMethods.kt")
    public void testInheritedDelegationMethods() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedDelegationMethods.kt", this::doTest);
    }

    @TestMetadata("InheritedInnerClasses.kt")
    public void testInheritedInnerClasses() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedInnerClasses.kt", this::doTest);
    }

    @TestMetadata("InheritedJavaMembers.kt")
    public void testInheritedJavaMembers() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedJavaMembers.kt", this::doTest);
    }

    @TestMetadata("InheritedLocalKotlin.kt")
    public void testInheritedLocalKotlin() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedLocalKotlin.kt", this::doTest);
    }

    @TestMetadata("InheritedMembers.kt")
    public void testInheritedMembers() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedMembers.kt", this::doTest);
    }

    @TestMetadata("InheritedMembersOfEnum.kt")
    public void testInheritedMembersOfEnum() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedMembersOfEnum.kt", this::doTest);
    }

    @TestMetadata("InheritedMembersWithSubstitutedTypes.kt")
    public void testInheritedMembersWithSubstitutedTypes() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedMembersWithSubstitutedTypes.kt", this::doTest);
    }

    @TestMetadata("InheritedSAMConversion.kt")
    public void testInheritedSAMConversion() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedSAMConversion.kt", this::doTest);
    }

    @TestMetadata("InheritedSynthesizedFromDataClass.kt")
    public void testInheritedSynthesizedFromDataClass() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/InheritedSynthesizedFromDataClass.kt", this::doTest);
    }

    @TestMetadata("LocalElements.kt")
    public void testLocalElements() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/LocalElements.kt", this::doTest);
    }

    @TestMetadata("Render.kt")
    public void testRender() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/Render.kt", this::doTest);
    }

    @TestMetadata("SeveralClasses.kt")
    public void testSeveralClasses() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/SeveralClasses.kt", this::doTest);
    }

    @TestMetadata("Simple.kt")
    public void testSimple() throws Exception {
        KotlinTestUtils.runTest("idea/testData/structureView/fileStructure/Simple.kt", this::doTest);
    }
}
