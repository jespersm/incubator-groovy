/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.codehaus.groovy.parser.antlr4.builders.nodes;

import org.codehaus.groovy.ast.stmt.BreakStatement;
import org.codehaus.groovy.ast.stmt.ContinueStatement;
import org.codehaus.groovy.ast.stmt.Statement;
import org.codehaus.groovy.parser.antlr4.GroovyParser;
import org.codehaus.groovy.parser.antlr4.builders.ASTBuilder;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.asBoolean;

/**
 * Created by Daniel on 2016/4/9.
 */
public class BuildableControlStatementContext extends BuildableBaseNode {
    private GroovyParser.ControlStatementContext ctx;

    public BuildableControlStatementContext(ASTBuilder astBuilder, GroovyParser.ControlStatementContext ctx) {
        super(astBuilder);

        this.ctx = ctx;
    }

    @Override
    public Statement build() {
        // TODO check validity. Labeling support.
        // Fake inspection result should be suppressed.
        //noinspection GroovyConditionalWithIdenticalBranches
        return astBuilder.setupNodeLocation(asBoolean(ctx.KW_BREAK())
                ? new BreakStatement()
                : new ContinueStatement(), ctx);
    }
}
