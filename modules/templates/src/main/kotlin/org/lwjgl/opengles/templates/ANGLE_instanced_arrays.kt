/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*
import org.lwjgl.opengles.BufferType.*

val ANGLE_instanced_arrays = "ANGLEInstancedArrays".nativeClassGLES("ANGLE_instanced_arrays", postfix = ANGLE) {
	nativeImport (
		"OpenGLES.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		A common use case in GL for some applications is to be able to draw the same object, or groups of similar objects that share vertex data, primitive
		count and type, multiple times. This extension provides a means of accelerating such use cases while restricting the number of API calls, and keeping
		the amount of duplicate data to a minimum.

		This extension introduces an array "divisor" for generic vertex array attributes, which when non-zero specifies that the attribute is "instanced." An
		instanced attribute does not advance per-vertex as usual, but rather after every &lt;divisor&gt; conceptual draw calls.

		(Attributes which aren't instanced are repeated in their entirety for every conceptual draw call.)

		By specifying transform data in an instanced attribute or series of instanced attributes, vertex shaders can, in concert with the instancing draw
		calls, draw multiple instances of an object with one draw call.

		Requires ${GLES20.core}.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameters of GetVertexAttribfv and GetVertexAttribiv.",

		"VERTEX_ATTRIB_ARRAY_DIVISOR_ANGLE" _ 0x88FE
	)

	void(
		"DrawArraysInstancedANGLE",
		"",

		GLenum.IN("mode", ""),
		GLint.IN("first", ""),
		GLsizei.IN("count", ""),
		GLsizei.IN("primcount", "")
	)

	void(
		"DrawElementsInstancedANGLE",
		"",

		GLenum.IN("mode", ""),
		AutoSize("indices") shr "GLESChecks.typeToByteShift(type)" _ GLsizei.IN("count", ""),
		AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT) _ GLenum.IN("type", ""),
		ELEMENT_ARRAY_BUFFER _ const _ void_p.IN("indices", ""),
		GLsizei.IN("primcount", "")
	)

	void(
		"VertexAttribDivisorANGLE",
		"",

		GLuint.IN("index", ""),
		GLuint.IN("divisor", "")
	)
}