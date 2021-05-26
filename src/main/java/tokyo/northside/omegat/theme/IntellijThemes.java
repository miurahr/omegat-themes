/**************************************************************************
 OmegaT - Computer Assisted Translation (CAT) tool
          with fuzzy matching, translation memory, keyword search,
          glossaries, and translation leveraging into updated projects.

 Copyright (C) 2021 Hiroshi Miura
               Home page: http://www.omegat.org/

 This file is part of OmegaT.

 OmegaT is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 OmegaT is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 **************************************************************************/

package tokyo.northside.omegat.theme;

import org.omegat.util.gui.UIDesignManager;
import org.omegat.gui.theme.IThemeInitializer;

import javax.swing.UIManager;


public class IntellijThemes {

	private IntellijThemes() {
	}

	static final CustomTheme[] customThemes = {
			new CustomTheme("Arc", "com.formdev.flatlaf.intellijthemes.FlatArcIJTheme"),
			new CustomTheme("Arc - Orange", "com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme"),
			new CustomTheme("Arc Dark", "com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme"),
			new CustomTheme("Arc Dark - Orange", "com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme"),
			new CustomTheme("Carbon", "com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme"),
			new CustomTheme("Cobalt 2", "com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme"),
			new CustomTheme("Cyan light", "com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme"),
			new CustomTheme("Dark Flat", "com.formdev.flatlaf.intellijthemes.FlatDarkCustomTheme"),
			new CustomTheme("Dark purple", "com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme"),
			new CustomTheme("Dracula", "com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme"),
			new CustomTheme("Gradianto Dark Fuchsia", "com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme"),
			new CustomTheme("Gradianto Deep Ocean", "com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme"),
			new CustomTheme("Gradianto Midnight Blue", "com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme"),
			new CustomTheme("Gradianto Nature Green", "com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme"),
			new CustomTheme("Gray", "com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme"),
			new CustomTheme("Gruvbox Dark Hard", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme"),
			new CustomTheme("Gruvbox Dark Medium", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkMediumIJTheme"),
			new CustomTheme("Gruvbox Dark Soft", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkSoftIJTheme"),
			new CustomTheme("Hiberbee Dark", "com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme"),
			new CustomTheme("High contrast", "com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme"),
			new CustomTheme("Light Flat", "com.formdev.flatlaf.intellijthemes.FlatLightCustomTheme"),
			new CustomTheme("Material Design Dark", "com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme"),
			new CustomTheme("Monocai", "com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme"),
			new CustomTheme("Nord", "com.formdev.flatlaf.intellijthemes.FlatNordIJTheme"),
			new CustomTheme("One Dark", "com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme"),
			new CustomTheme("Solarized Dark", "com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme"),
			new CustomTheme("Solarized Light", "com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme"),
			new CustomTheme("Spacegray", "com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme"),
			new CustomTheme("Vuesion", "com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme"),
			new CustomTheme("Arc Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme"),
			new CustomTheme("Arc Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme"),
			new CustomTheme("Atom One Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme"),
			new CustomTheme("Atom One Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme"),
			new CustomTheme("Atom One Light (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme"),
			new CustomTheme("Atom One Light Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme"),
			new CustomTheme("Dracula (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaIJTheme"),
			new CustomTheme("Dracula Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme"),
			new CustomTheme("GitHub (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme"),
			new CustomTheme("GitHub Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubContrastIJTheme"),
			new CustomTheme("GitHub Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme"),
			new CustomTheme("GitHub Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme"),
			new CustomTheme("Light Owl (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme"),
			new CustomTheme("Light Owl Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlContrastIJTheme"),
			new CustomTheme("Material Darker (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme"),
			new CustomTheme("Material Darker Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme"),
			new CustomTheme("Material Deep Ocean (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme"),
			new CustomTheme("Material Deep Ocean Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanContrastIJTheme"),
			new CustomTheme("Material Lighter (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme"),
			new CustomTheme("Material Lighter Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterContrastIJTheme"),
			new CustomTheme("Material Oceanic (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme"),
			new CustomTheme("Material Oceanic Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicContrastIJTheme"),
			new CustomTheme("Material Palenight (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme"),
			new CustomTheme("Material Palenight Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightContrastIJTheme"),
			new CustomTheme("Monokai Pro (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProIJTheme"),
			new CustomTheme("Monokai Pro Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProContrastIJTheme"),
			new CustomTheme("Moonlight (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme"),
			new CustomTheme("Moonlight Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightContrastIJTheme"),
			new CustomTheme("Night Owl (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme"),
			new CustomTheme("Night Owl Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlContrastIJTheme"),
			new CustomTheme("Solarized Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkIJTheme"),
			new CustomTheme("Solarized Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkContrastIJTheme"),
			new CustomTheme("Solarized Light (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme"),
			new CustomTheme("Solarized Light Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightContrastIJTheme"),
	};

    public static void loadPlugins() {
		for (CustomTheme customTheme : customThemes) {
			UIDesignManager.registerTheme(customTheme);
		}

	}

    public static void unloadPlugins() {
    }

    public static class CustomTheme extends UIManager.LookAndFeelInfo implements IThemeInitializer {

        public CustomTheme(String name, String className) {
            super(name, className);
        }
        public void setup() {}
    }

}
