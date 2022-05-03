package com.solvd.laba;

import com.solvd.laba.home.task.service.*;
import com.solvd.laba.home.task.service.impl.*;

class Main {
    public static void main(String[] args) {
        IRunSolvdLabaBaseClasses solvdLabaBaseClasses = new RunSolvdLabaBaseClassesImpl();
        solvdLabaBaseClasses.runProjectBaseClasses();
        IRunSolvdLabaException solvdLabaException = new RunSolvdLabaExceptionImpl();
        solvdLabaException.runSolvdLabaException();
        IRunSolvdLabaCollection solvdLabaCollection = new RunSolvdLabaCollectionImpl();
        solvdLabaCollection.runSolvdLabaCollection();
        IRunSolvdLabaFileUtils solvdLabaFileUtils = new RunSolvdLabaFileUtilsImpl();
        solvdLabaFileUtils.runSolvdLabaFileUtils();
        IRunSolvdLabaEnums solvdLabaEnums = new RunSolvdLabaEnumsImpl();
        solvdLabaEnums.runSolvdLabaEnums();
        IRunSolvdLabaFunctionalInterface solvdLabaFunctionalInterface = new RunSolvdLabaFunctionalInterfaceImpl();
        solvdLabaFunctionalInterface.runSolvdLabaFunctionalInterface();
        IRunSolvdLabaThreads solvdLabaThreads = new RunSolvdLabaThreadsImpl();
        solvdLabaThreads.runSolvdLabaThreads();
        IRunSolvdLabaReflection solvdLabaReflection = new RunSolvdLabaReflectionImpl();
        solvdLabaReflection.runSolvdLabaReflection();
    }
}
