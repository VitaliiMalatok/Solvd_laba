package com.solvd.laba;

import com.solvd.laba.service.IRunSolvdLaba;
import com.solvd.laba.service.impl.RunSolvdLabaImpl;

class Main {
    public static void main(String[] args) {
        IRunSolvdLaba solvdLaba = new RunSolvdLabaImpl();
        solvdLaba.runProject();
    }
}
