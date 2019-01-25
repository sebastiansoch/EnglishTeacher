/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss.englishteacher.repository;

import java.util.List;
import ss.englishteacher.lessonpreparation.Requirement;
import ss.englishteacher.lessonpreparation.XXComponent;


/**
 *
 * @author ssoch
 */
public interface EnglishPolishTranslationRepo {

    public List<XXComponent> getXXComponents(Requirement requirement);
    
}
