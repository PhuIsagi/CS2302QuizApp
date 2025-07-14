/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nap.utils;

import com.nap.services.CategoryServices;
import com.nap.services.LevelServices;
import com.nap.services.UpdateQuestionServices;
import com.nap.services.question.BaseQuestionServices;
import com.nap.services.question.QuestionServices;

/**
 *
 * @author anphu
 */
public class Configs {
    public static final CategoryServices cateService = new CategoryServices();
    public static final LevelServices levelService = new LevelServices();
    public static BaseQuestionServices questionService = new QuestionServices();
    public static UpdateQuestionServices uQService = new UpdateQuestionServices();
}