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

import org.omegat.util.Log;
import org.omegat.util.gui.UIDesignManager;

import javax.swing.UIManager.LookAndFeelInfo;


public class IntellijThemes {

	private IntellijThemes() {
	}

	static final LookAndFeelInfo[] customThemes = {
			new LookAndFeelInfo("Arc", "com.formdev.flatlaf.intellijthemes.FlatArcIJTheme"),
			new LookAndFeelInfo("Arc - Orange", "com.formdev.flatlaf.intellijthemes.FlatArcOrangeIJTheme"),
			new LookAndFeelInfo("Arc Dark", "com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme"),
			new LookAndFeelInfo("Arc Dark - Orange", "com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme"),
			new LookAndFeelInfo("Carbon", "com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme"),
			new LookAndFeelInfo("Cobalt 2", "com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme"),
			new LookAndFeelInfo("Cyan light", "com.formdev.flatlaf.intellijthemes.FlatCyanLightIJTheme"),
			new LookAndFeelInfo("Dark Flat", "com.formdev.flatlaf.intellijthemes.FlatDarkCustomTheme"),
			new LookAndFeelInfo("Dark purple", "com.formdev.flatlaf.intellijthemes.FlatDarkPurpleIJTheme"),
			new LookAndFeelInfo("Dracula", "com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme"),
			new LookAndFeelInfo("Gradianto Dark Fuchsia", "com.formdev.flatlaf.intellijthemes.FlatGradiantoDarkFuchsiaIJTheme"),
			new LookAndFeelInfo("Gradianto Deep Ocean", "com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme"),
			new LookAndFeelInfo("Gradianto Midnight Blue", "com.formdev.flatlaf.intellijthemes.FlatGradiantoMidnightBlueIJTheme"),
			new LookAndFeelInfo("Gradianto Nature Green", "com.formdev.flatlaf.intellijthemes.FlatGradiantoNatureGreenIJTheme"),
			new LookAndFeelInfo("Gray", "com.formdev.flatlaf.intellijthemes.FlatGrayIJTheme"),
			new LookAndFeelInfo("Gruvbox Dark Hard", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkHardIJTheme"),
			new LookAndFeelInfo("Gruvbox Dark Medium", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkMediumIJTheme"),
			new LookAndFeelInfo("Gruvbox Dark Soft", "com.formdev.flatlaf.intellijthemes.FlatGruvboxDarkSoftIJTheme"),
			new LookAndFeelInfo("Hiberbee Dark", "com.formdev.flatlaf.intellijthemes.FlatHiberbeeDarkIJTheme"),
			new LookAndFeelInfo("High contrast", "com.formdev.flatlaf.intellijthemes.FlatHighContrastIJTheme"),
			new LookAndFeelInfo("Light Flat", "com.formdev.flatlaf.intellijthemes.FlatLightCustomTheme"),
			new LookAndFeelInfo("Material Design Dark", "com.formdev.flatlaf.intellijthemes.FlatMaterialDesignDarkIJTheme"),
			new LookAndFeelInfo("Monocai", "com.formdev.flatlaf.intellijthemes.FlatMonocaiIJTheme"),
			new LookAndFeelInfo("Nord", "com.formdev.flatlaf.intellijthemes.FlatNordIJTheme"),
			new LookAndFeelInfo("One Dark", "com.formdev.flatlaf.intellijthemes.FlatOneDarkIJTheme"),
			new LookAndFeelInfo("Solarized Dark", "com.formdev.flatlaf.intellijthemes.FlatSolarizedDarkIJTheme"),
			new LookAndFeelInfo("Solarized Light", "com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme"),
			new LookAndFeelInfo("Spacegray", "com.formdev.flatlaf.intellijthemes.FlatSpacegrayIJTheme"),
			new LookAndFeelInfo("Vuesion", "com.formdev.flatlaf.intellijthemes.FlatVuesionIJTheme"),
			new LookAndFeelInfo("Arc Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkIJTheme"),
			new LookAndFeelInfo("Arc Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme"),
			new LookAndFeelInfo("Atom One Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme"),
			new LookAndFeelInfo("Atom One Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme"),
			new LookAndFeelInfo("Atom One Light (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightIJTheme"),
			new LookAndFeelInfo("Atom One Light Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneLightContrastIJTheme"),
			new LookAndFeelInfo("Dracula (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaIJTheme"),
			new LookAndFeelInfo("Dracula Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatDraculaContrastIJTheme"),
			new LookAndFeelInfo("GitHub (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme"),
			new LookAndFeelInfo("GitHub Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubContrastIJTheme"),
			new LookAndFeelInfo("GitHub Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkIJTheme"),
			new LookAndFeelInfo("GitHub Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme"),
			new LookAndFeelInfo("Light Owl (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme"),
			new LookAndFeelInfo("Light Owl Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlContrastIJTheme"),
			new LookAndFeelInfo("Material Darker (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerIJTheme"),
			new LookAndFeelInfo("Material Darker Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDarkerContrastIJTheme"),
			new LookAndFeelInfo("Material Deep Ocean (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme"),
			new LookAndFeelInfo("Material Deep Ocean Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanContrastIJTheme"),
			new LookAndFeelInfo("Material Lighter (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme"),
			new LookAndFeelInfo("Material Lighter Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterContrastIJTheme"),
			new LookAndFeelInfo("Material Oceanic (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme"),
			new LookAndFeelInfo("Material Oceanic Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicContrastIJTheme"),
			new LookAndFeelInfo("Material Palenight (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightIJTheme"),
			new LookAndFeelInfo("Material Palenight Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialPalenightContrastIJTheme"),
			new LookAndFeelInfo("Monokai Pro (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProIJTheme"),
			new LookAndFeelInfo("Monokai Pro Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMonokaiProContrastIJTheme"),
			new LookAndFeelInfo("Moonlight (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightIJTheme"),
			new LookAndFeelInfo("Moonlight Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMoonlightContrastIJTheme"),
			new LookAndFeelInfo("Night Owl (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme"),
			new LookAndFeelInfo("Night Owl Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlContrastIJTheme"),
			new LookAndFeelInfo("Solarized Dark (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkIJTheme"),
			new LookAndFeelInfo("Solarized Dark Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedDarkContrastIJTheme"),
			new LookAndFeelInfo("Solarized Light (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightIJTheme"),
			new LookAndFeelInfo("Solarized Light Contrast (Material)", "com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatSolarizedLightContrastIJTheme"),
	};

    public static void loadPlugins() {
		try {
			// OmegaT 5.6.0 and later has a method, when launching older OmegaT, ignored.
			UIDesignManager.class.getDeclaredMethod("registerTheme", String.class, String.class);
			for (LookAndFeelInfo info : customThemes) {
				UIDesignManager.registerTheme(info.getName(), info.getClassName());
			}
		} catch (NoSuchMethodException e) {
			Log.log("Theme plugin: OmegaT version seems to be too old to support theme plugin.");
		}
	}

    public static void unloadPlugins() {
    }
}
