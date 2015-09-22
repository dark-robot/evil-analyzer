/*
 * The evil analyzer tool is a compiler based on Java which is composed of the lexical, syntax and semantic phases.
 *
 * Copyright (C) 2015 Dark Robot
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package dark.robot.analyzer.common.loader;

/**
 * Worker interface to load a file resource
 *
 * @param <R> the result type
 * @author dark.robot
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ILoader<R> {

  /**
   * Loads a file
   *
   * @param file the name of the file to read from
   * @return An array of lines
   * @throws LoaderException if the {@code file} is {@value null}, the file not exits, or {@code IOException} happened at read a line.
   * @since 1.0.0
   */
  R load(String file);
}