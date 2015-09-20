
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
package dark.robot.analyzer.semantic;

/**
 * TODO
 *
 * @author dark.robot
 * @version 1.0.0
 * @since 1.0.0
 */
public class SemanticException extends RuntimeException {

  /**
   * <p>
   * Constructs a new {@code SemanticException} with the specified detail message.
   * </p>
   * <p>
   * The cause is not initialized, and may subsequently be initialized by a call to {@link #initCause}.
   * </p>
   *
   * @param message the detail message. The detail message is saved for later retrieval by the {@link #getMessage()} method.
   * @since 1.0.0
   */
  public SemanticException(String message) {
    super(message);
  }

  /**
   * <p>
   * Constructs a new {@code SemanticException} with the specified detail message and cause.
   * </p>
   * <p>Note that the detail message associated with {@code cause} is <i>not</i> automatically incorporated in
   * this runtime exception's detail message.
   * </p>
   *
   * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
   * @param cause   the cause (which is saved for later retrieval by the {@link #getCause()} method).
   *                (A <tt>null</tt> value is permitted, and indicates that the cause is nonexistent or unknown.)
   * @since 1.0.0
   */
  public SemanticException(String message, Throwable cause) {
    super(message, cause);
  }
}