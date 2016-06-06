/*
 * Copyright 2014 the original author or authors.
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
package grails.databinding

import groovy.transform.CompileStatic

@CompileStatic
class SimpleMapDataBindingSource implements DataBindingSource {

    protected Map map
    boolean dataSourceAware = true

    SimpleMapDataBindingSource(Map map) {
        this.map = map
    }

    Set<String> getPropertyNames() {
        map.keySet()
    }

    Object getPropertyValue(String propertyName) {
        map.get propertyName
    }

    Object getAt(String propertyName) {
        getPropertyValue propertyName
    }

    boolean containsProperty(String propertyName) {
        map.containsKey propertyName
    }

    boolean hasIdentifier() {
        map.containsKey('id')
    }

    def getIdentifierValue() {
        map['id']
    }

    int size() {
        map.size()
    }
}
