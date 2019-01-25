package ss.englishteacher.lessonpreparation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mock;
import ss.englishteacher.repository.EnglishPolishTranslationRepoFile;

/**
 *
 * @author ssoch
 */
public class LessonPreparationTest {

    private Requirement requirement;
    private Lesson lesson;

    public LessonPreparationTest() {
    }
    
    @Mock
    private EnglishPolishTranslationRepoFile englishPolishTranslationRepoFile;
    
    @Test
    public void shouldPrepareNotEmptyNewLesson() {
        requirement = new Requirement();
        lesson = new Lesson(requirement, null);
        List<LessonComponent> lessonComponents = lesson.prepareLessonComponets(requirement);
    
        assertTrue(!lessonComponents.isEmpty());
    }

    @Test
    public void shouldPrepareEmptyNewLesson() {
        requirement = new Requirement();
        lesson = new Lesson(requirement, null);
        List<LessonComponent> lessonComponents = lesson.prepareLessonComponets(requirement);
    
        assertTrue(lessonComponents.isEmpty());
    }
    
    @Test
    public void sholdLessonForRequirement() {
        requirement = new Requirement(LanguageMode.VERB);
        lesson = new Lesson(requirement, englishPolishTranslationRepoFile);
        
        List<LessonComponent> lessonComponents = lesson.prepareLessonComponets(requirement);

        List<LessonComponent> expecteds = new ArrayList<>();
        String question = "go";
        String answer = "iść";
        
        expecteds.add(new LessonComponent(question, answer));
     
        assertEquals(expecteds, lessonComponents);
    }
}
