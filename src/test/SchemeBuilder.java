package test; 

import javax.persistence.Persistence;
public class SchemeBuilder { 
    public static void main(String[] args) {
        Persistence.generateSchema("ExamPrep_JPA1PU", null);
    }
}