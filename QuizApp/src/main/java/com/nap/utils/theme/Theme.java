/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.nap.utils.theme;

/**
 *
 * @author admin
 */
public enum Theme {
    Default {
        @Override
        public void updateTheme() {
            ThemeManager.setThemeFactory(new DefaultThemeFactory());
        }
    }, Dark {
        @Override
        public void updateTheme() {
            ThemeManager.setThemeFactory(new DarkThemeFactory());
        }
    }, Light {
        @Override
        public void updateTheme() {
            ThemeManager.setThemeFactory(new LightThemeFactory());
        }
    };
    public abstract  void updateTheme();
}
