    public static Object showErrorImpl = (java.util.function.Function<Object, Object>) (err) -> {
        java.io.StringWriter writer = new java.io.StringWriter();
        ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
        return writer.toString();
    };

    public static Object error = (java.util.function.Function<Object, Object>) (msg) -> new RuntimeException((String) msg);

    public static Object errorWithCause = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (cause) -> {
            RuntimeException err = new RuntimeException((String) msg);
            if (cause instanceof Throwable) err.initCause((Throwable) cause);
            return err;
        };

    public static Object errorWithName = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (name) -> {
            RuntimeException err = new RuntimeException((String) msg) {
                @Override public String toString() { return ((String) name) + ": " + getMessage(); }
            };
            return err;
        };

    public static Object message = (java.util.function.Function<Object, Object>) (err) -> ((Throwable) err).getMessage();

    public static Object name = (java.util.function.Function<Object, Object>) (err) -> ((Throwable) err).getClass().getSimpleName();

    public static Object stackImpl = (java.util.function.Function<Object, Object>) (err) -> {
        java.io.StringWriter writer = new java.io.StringWriter();
        ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
        return writer.toString();
    };

    public static Object throwException = (java.util.function.Function<Object, Object>) (err) ->
        (java.util.function.Supplier<Object>) () -> { throw (Throwable) ((Throwable) err); };

    public static Object catchException = (java.util.function.Function<Object, Object>) (handler) ->
        (java.util.function.Function<Object, Object>) (action) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                return ((java.util.function.Supplier<Object>) action).get();
            } catch (Throwable thrown) {
                return ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) handler).apply(thrown)).get();
            }
        };
