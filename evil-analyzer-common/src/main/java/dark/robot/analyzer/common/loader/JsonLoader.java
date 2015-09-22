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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dark.robot.analyzer.common.model.Lexeme;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

/**
 * JSON loader
 *
 * @author dark.robot
 * @version 1.0.0
 * @see ILoader
 * @since 1.0.0
 */
@Component(value = "jsonLoader")
public class JsonLoader implements ILoader<List<Lexeme>> {

  private ObjectMapper mapper;

  /**
   * Constructs a new {@code JsonLoader} without arguments
   * @since 1.0.0
   */
  public JsonLoader() {
    this.mapper = new ObjectMapper();
  }

  /**
   * {@inheritDoc}
   * @since 1.0.0
   */
  @Override
  public List<Lexeme> load(String file) {
    List<Lexeme> lexemes = new ArrayList<>();

    try {
      this.mapper.writeValue(new File(file), lexemes);
    } catch (JsonGenerationException e) {
      throw new LoaderException(e.getMessage(), e.getCause());
    } catch (JsonMappingException e) {
      throw new LoaderException(e.getMessage(), e.getCause());
    } catch (IOException e) {
      throw new LoaderException(e.getMessage(), e.getCause());
    }

    return lexemes;
  }
}