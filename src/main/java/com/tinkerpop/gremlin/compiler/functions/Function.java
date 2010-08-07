package com.tinkerpop.gremlin.compiler.functions;

import com.tinkerpop.gremlin.compiler.context.GremlinScriptContext;
import com.tinkerpop.gremlin.compiler.operations.Operation;
import com.tinkerpop.gremlin.compiler.types.Atom;

import java.util.List;

/**
 * @author Pavel A. Yaskevich
 */
public interface Function<T> {

    public Atom<T> compute(List<Operation> parameters, GremlinScriptContext context) throws RuntimeException;

    public String getFunctionName();

}
