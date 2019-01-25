/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss.englishteacher.lessonpreparation;

import java.util.Objects;

/**
 *
 * @author ssoch
 */
class LessonComponent {

    private final String question;
    private final String answer;

    
    LessonComponent(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.question);
        hash = 79 * hash + Objects.hashCode(this.answer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LessonComponent other = (LessonComponent) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LessonComponent{" + "question=" + question + ", answer=" + answer + '}';
    }
}
