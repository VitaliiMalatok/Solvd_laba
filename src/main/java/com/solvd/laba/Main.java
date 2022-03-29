package com.solvd.laba;

import com.solvd.laba.service.IRunSolvdLabaBaseClasses;
import com.solvd.laba.service.IRunSolvdLabaCollection;
import com.solvd.laba.service.IRunSolvdLabaException;
import com.solvd.laba.service.impl.RunSolvdLabaBaseClassesImpl;
import com.solvd.laba.service.impl.RunSolvdLabaCollectionImpl;
import com.solvd.laba.service.impl.RunSolvdLabaExceptionImpl;

class Main {
    public static void main(String[] args) {
//        IRunSolvdLabaBaseClasses solvdLabaBaseClasses = new RunSolvdLabaBaseClassesImpl();
//        solvdLabaBaseClasses.runProjectBaseClasses();
//        IRunSolvdLabaException solvdLabaException = new RunSolvdLabaExceptionImpl();
//        solvdLabaException.runSolvdLabaException();
        IRunSolvdLabaCollection solvdLabaCollection = new RunSolvdLabaCollectionImpl();
        solvdLabaCollection.runSolvdLabaCollection();

    }
}
