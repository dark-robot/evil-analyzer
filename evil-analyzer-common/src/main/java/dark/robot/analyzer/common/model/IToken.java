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
package dark.robot.analyzer.common.model;

import java.util.ArrayList;

/**
 * Token representation interface
 *
 * @author dark.robot
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IToken {

  /**
   * Returns the token name
   *
   * @return the token name
   * @since 1.0.0
   */
  String getName();

  /**
   * Sets the token name
   *
   * @param name the token name
   * @since 1.0.0
   */
  void setName(String name);

  /**
   * Returns the attribute value
   *
   * @return the attribute value
   * @since 1.0.0
   */
  String getValue();

  /**
   * Sets the attribute value
   *
   * @param value the attribute value
   * @since 1.0.0
   */
  void setValue(String value);

  /**
   * Returns the parent token
   *
   * @return the parent token
   * @since 1.0.0
   */
  IToken getParent();

  /**
   * Sets the parent token
   *
   * @param parent the parent token
   * @since 1.0.0
   */
  void setParent(IToken parent);

  /**
   * Adds a child token
   *
   * @param token the child token to add
   * @since 1.0.0
   */
  void addChild(IToken token);

  /**
   * Remove a child token
   *
   * @param token the child token to remove
   * @since 1.0.0
   */
  void removeChild(IToken token);

  /**
   * Returns the children tokens
   *
   * @return the children tokens
   * @since 1.0.0
   */
  ArrayList<IToken> getChildren();

  /**
   * Returns a child token with the given index
   *
   * @param index the child token index
   * @return the child token found
   * @since 1.0.0
   */
  IToken getChild(Integer index);
}