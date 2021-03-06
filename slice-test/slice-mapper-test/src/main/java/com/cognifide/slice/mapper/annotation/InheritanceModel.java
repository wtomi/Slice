/*-
 * #%L
 * Slice - Mapper Tests
 * %%
 * Copyright (C) 2012 Cognifide Limited
 * %%
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
 * #L%
 */
package com.cognifide.slice.mapper.annotation;

/**
 * @author Mariusz Kubiś Date: 15.04.15
 */
@SliceResource(MappingStrategy.ANNOTATED)
class InheritanceModelAnnotated extends AbstractInheritanceModelAnnotated {

	@JcrProperty
	private String field2;

	private String field3;

	public String getField2() {
		return field2;
	}

	public String getField3() {
		return field3;
	}
}

@SliceResource(MappingStrategy.ANNOTATED)
class InheritanceModelAnnotatedAll extends AbstractInheritanceModelAll {

	@JcrProperty
	private String field2;

	private String field3;

	public String getField2() {
		return field2;
	}

	public String getField3() {
		return field3;
	}
}

@SliceResource(MappingStrategy.ANNOTATED)
class InheritanceModelAnnotatedWithout extends AbstractInheritanceModelWithout {

	@JcrProperty
	private String field2;

	private String field3;

	public String getField2() {
		return field2;
	}

	public String getField3() {
		return field3;
	}
}

@SliceResource(MappingStrategy.ALL)
class InheritanceModelAll extends AbstractInheritanceModelAll {

	private String field2;

	public String getField2() {
		return field2;
	}
}

@SliceResource(MappingStrategy.ALL)
class InheritanceModelAllAnnotated extends AbstractInheritanceModelAnnotated {

	private String field2;

	public String getField2() {
		return field2;
	}
}

@SliceResource(MappingStrategy.ALL)
class InheritanceModelAllWithout extends AbstractInheritanceModelWithout {

	private String field2;

	public String getField2() {
		return field2;
	}
}

class InheritanceModelWithoutAll extends AbstractInheritanceModelAll {

	private String field2;

	public String getField2() {
		return field2;
	}
}

class InheritanceModelWithoutAnnotated extends AbstractInheritanceModelAnnotated {

	private String field2;

	public String getField2() {
		return field2;
	}
}
