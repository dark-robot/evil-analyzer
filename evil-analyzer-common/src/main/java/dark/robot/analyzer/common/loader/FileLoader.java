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

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * File loader
 *
 * @author dark.robot
 * @version 1.0.0
 * @see ILoader
 * @since 1.0.0
 */
@Service(value = "fileLoader")
public class FileLoader implements ILoader<String[]> {

  /**
   * System line separator
   */
  private final static String LineSeparator = System.getProperty("line.separator");

  /**
   * Constructs a file loader without arguments
   * @since 1.0.0
   */
  public FileLoader() {
    super();
  }

  /**
   * {@inheritDoc}
   * @since 1.0.0
   */
  @Override
  public String[] load(String file) {
    BufferedReader source = this.openFile(file);

    return this.load(source);
  }

  /**
   * Open the file resource to read the file
   *
   * @param file the name of the file to read from
   * @return the text input source
   * @throws LoaderException if the {@code file} is {@value null} or the file not exits
   * @since 1.0.0
   */
  private BufferedReader openFile(String file) {
    try {
      return new BufferedReader(new FileReader(file));
    } catch (FileNotFoundException | NullPointerException e) {
      throw new LoaderException(e.getMessage());
    }
  }

  /**
   * Returns all the lines in the input source
   *
   * @param source text input source
   * @return An array of lines
   * @throws LoaderException if an {@code IOException} happened at read a line
   * @since 1.0.0
   */
  protected String[] load(BufferedReader source) {
    StringBuilder content = new StringBuilder();
    String line;

    try {
      try {
        while ((line = source.readLine()) != null) {
          content.append(line);
          content.append(LineSeparator);
        }

      } finally {
        source.close();
      }
    } catch (IOException e) {
      throw new LoaderException(e.getMessage(), e.getCause());
    }

    return content.toString().split(LineSeparator);
  }
}