/*
 * Copyright 2015 the original author or authors.
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

package org.grails.gradle.plugin.model

/**
 * Gradle ToolingModel class that is used to return Classpath to Grails cli
 *
 * this file is also in grails-shell project
 */
interface GrailsClasspath extends Serializable {
    /**
     * @return All Grails dependencies, pull from 'testRuntime' scope
     */
    List<URL> getDependencies()

    /**
     * @return The profile dependencies
     */
    List<URL> getProfileDependencies()
    /**
     * @return The error message if one occurred
     */
    String getError()
}
