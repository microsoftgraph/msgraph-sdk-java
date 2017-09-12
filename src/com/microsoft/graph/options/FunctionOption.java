package com.microsoft.graph.options;


public class FunctionOption extends Option {

    /**
     * Creates an option object.
     *
     * @param name  The name of the option.
     * @param value The value of the option.
     */
    public FunctionOption(final String name, final Object value) {
        super(name, value != null ? value : null);
    }
}
