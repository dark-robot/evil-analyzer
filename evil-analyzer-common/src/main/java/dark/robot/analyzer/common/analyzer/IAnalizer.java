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
package dark.robot.analyzer.common.analyzer;

/**
 * Worker phase interface to process the input source into a phase result, that will be used as input in the next compiler phase
 *
 * @author dark.robot
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IAnalizer<S, R> {

  /**
   * Phase analyzer
   *
   * @param input the set to analyze
   * @return the analysis result
   * @since 1.0.0
   */
  R analyze(S input);
}