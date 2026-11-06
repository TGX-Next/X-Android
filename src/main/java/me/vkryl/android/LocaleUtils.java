/*
 * This file is a part of X-Android
 * Copyright © Vyacheslav Krylov 2014
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.vkryl.android;

import android.os.Build;

import java.util.Locale;

public final class LocaleUtils {
  private LocaleUtils () { }

  /**
   * Modified from:
   * https://github.com/apache/cordova-plugin-globalization/blob/master/src/android/Globalization.java
   *
   * Returns a well-formed ITEF BCP 47 language tag representing this locale string
   * identifier for the client's current locale
   *
   * @return String: The BCP 47 language tag for the current locale
   */
  public static String toBcp47Language (Locale loc) {
    return loc.toLanguageTag();
  }
}
