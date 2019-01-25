/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss.englishteacher.lessonpreparation;


import java.util.ArrayList;
import java.util.List;
import ss.englishteacher.repository.EnglishPolishTranslationRepo;
import ss.englishteacher.repository.EnglishPolishTranslationRepoFile;

/**
 *
 * @author ssoch
 */
class Lesson {
    private Requirement requirement;
    private final EnglishPolishTranslationRepo repository;

    public Lesson(Requirement requirement, EnglishPolishTranslationRepo repository) {
        this.requirement = requirement;
        this.repository = repository;
    }

    public List<LessonComponent> prepareLessonComponets(Requirement requirement) {
        List<LessonComponent> lessonComponents = new ArrayList<>();
        
        List<XXComponent> xxComponents = repository.getXXComponents(requirement);

        for (XXComponent xxComponent : xxComponents) {
            XXBuilder xxBuilder = new XXBuilder();
            lessonComponents.add(xxBuilder.getLessonComponent(xxComponent, requirement));
        }

        return lessonComponents;
    }

}
