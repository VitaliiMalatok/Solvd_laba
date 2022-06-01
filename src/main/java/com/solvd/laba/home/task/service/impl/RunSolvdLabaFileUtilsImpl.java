package com.solvd.laba.home.task.service.impl;

import com.solvd.laba.home.task.service.IRunSolvdLabaFileUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class RunSolvdLabaFileUtilsImpl implements IRunSolvdLabaFileUtils {
    private static final Logger LOGGER = LogManager.getLogger(RunSolvdLabaFileUtilsImpl.class);
    private static final String INPUT_PATH_FILE = "src/main/resources/input.txt";
    private static final String OUT_PATH_FILE = "src/main/resources/output.txt";
    private static final String REGEX_VALUE = "[^\\da-zA-Zа-яёА-ЯЁ ]";

    @Override
    public void runSolvdLabaFileUtils() {
        try {
            String s = StringUtils.lowerCase(FileUtils.readFileToString(new File(INPUT_PATH_FILE), StandardCharsets.UTF_8)).replaceAll(REGEX_VALUE, "");
            String[] arr = s.split(" ");
            Set<String> set = new HashSet(List.of(arr));
            List<String> lst = set.stream().map(x -> x + " " + StringUtils.countMatches(s, x)).collect(Collectors.toList());
            FileUtils.writeLines(new File(OUT_PATH_FILE), lst);
            LOGGER.info("File 'output.txt' was created");
        } catch (IOException e) {
            LOGGER.info(e);
        }
    }
}
