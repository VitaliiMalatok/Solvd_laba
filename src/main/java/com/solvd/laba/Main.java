package com.solvd.laba;

import com.solvd.laba.home.task.IRunSolvdLabaBaseClasses;
import com.solvd.laba.home.task.IRunSolvdLabaCollection;
import com.solvd.laba.home.task.IRunSolvdLabaException;
import com.solvd.laba.home.task.IRunSolvdLabaFileUtils;
import com.solvd.laba.home.task.impl.RunSolvdLabaBaseClassesImpl;
import com.solvd.laba.home.task.impl.RunSolvdLabaCollectionImpl;
import com.solvd.laba.home.task.impl.RunSolvdLabaExceptionImpl;
import com.solvd.laba.home.task.impl.RunSolvdLabaFileUtilsImpl;

class Main {
    public static void main(String[] args) {
//        IRunSolvdLabaBaseClasses solvdLabaBaseClasses = new RunSolvdLabaBaseClassesImpl();
//        solvdLabaBaseClasses.runProjectBaseClasses();
//        IRunSolvdLabaException solvdLabaException = new RunSolvdLabaExceptionImpl();
//        solvdLabaException.runSolvdLabaException();
//        IRunSolvdLabaCollection solvdLabaCollection = new RunSolvdLabaCollectionImpl();
//        solvdLabaCollection.runSolvdLabaCollection();
        IRunSolvdLabaFileUtils solvdLabaFileUtils = new RunSolvdLabaFileUtilsImpl();
        solvdLabaFileUtils.runSolvdLabaFileUtils();

    }
}
