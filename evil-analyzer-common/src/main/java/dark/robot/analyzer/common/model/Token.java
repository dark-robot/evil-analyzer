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
 * Token representation
 *
 * @author dark.robot
 * @version 1.0.0
 * @since 1.0.0
 */
public class Token implements IToken {

  /**
   * Token name
   */
  private String name;

  /**
   * attribute value
   */
  private String value;

  /**
   * {@code Token} parent reference
   */
  private IToken parent;

  /**
   * {@code Token} children reference
   */
  private ArrayList<IToken> tokens = new ArrayList<>();

  /**
   * Constructs a {@code Token} without arguments
   */
  public Token() {
    super();
  }

  /**
   * Constructs a {@code Token} with the given token name and attribute value
   */
  public Token(String name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   * Constructs a {@code Token} with the given token name, attribute value and parent reference
   */
  public Token(String name, IToken parent, String value) {
    this.name = name;
    this.parent = parent;
    this.value = value;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public String getName() {
    return this.name;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public void setName(String name) {
    this.name = name;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public String getValue() {
    return this.value;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public IToken getParent() {
    return this.parent;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public void setParent(IToken parent) {
    this.parent = parent;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public void addChild(IToken token) {
    this.tokens.add(token);
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public void removeChild(IToken token) {
    this.tokens.remove(token);
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public ArrayList<IToken> getChildren() {
    return this.tokens;
  }

  /**
   * {@inheritDoc}
   *
   * @since 1.0.0
   */
  @Override
  public IToken getChild(Integer index) {
    return this.tokens.get(index);
  }
}