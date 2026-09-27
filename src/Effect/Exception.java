    public static Object showErrorImpl = (java.util.function.Function<Object, Object>) (err) -> {
        java.io.StringWriter writer = new java.io.StringWriter();
        ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
        return writer.toString();
    };

    // JavaScript errors carry the name "Error"; the Java port keeps that name
    // so `name`/`show` see the same value as the reference implementation.
    public static class Error extends RuntimeException {
        public Error(String message) { super(message); }
    }

    public static Object error = (java.util.function.Function<Object, Object>) (msg) -> new Error((String) msg);

    public static Object errorWithCause = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (cause) -> {
            RuntimeException err = new RuntimeException((String) msg);
            if (cause instanceof Throwable) err.initCause((Throwable) cause);
            return err;
        };

    public static Object errorWithName = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (name) ->
            new NamedError((String) msg, (String) name);

    public static class NamedError extends RuntimeException {
        private final String errorName;
        public NamedError(String message, String name) { super(message); errorName = name; }
        public String errorName() { return errorName; }
    }

    public static Object message = (java.util.function.Function<Object, Object>) (err) -> ((Throwable) err).getMessage();

    public static Object name = (java.util.function.Function<Object, Object>) (err) ->
        err instanceof NamedError
            ? ((NamedError) err).errorName()
            : ((Throwable) err).getClass().getSimpleName();

    // stackImpl(just)(nothing)(err): JavaScript exposes a .stack string when
    // present; a Java Throwable always has one.
    public static Object stackImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (err) -> {
            java.io.StringWriter writer = new java.io.StringWriter();
            ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
            return ((java.util.function.Function<Object, Object>) just).apply(writer.toString());
        };

    // JavaScript throws the value itself. Java only allows unchecked
    // exceptions in a lambda body, so a checked Throwable is wrapped and a
    // RuntimeException keeps its identity for catchException.
    private static RuntimeException __asRuntime(Throwable err) {
        return err instanceof RuntimeException ? (RuntimeException) err : new RuntimeException(err);
    }

    public static Object throwException = (java.util.function.Function<Object, Object>) (err) ->
        (java.util.function.Supplier<Object>) () -> { throw __asRuntime((Throwable) err); };

    public static Object catchException = (java.util.function.Function<Object, Object>) (handler) ->
        (java.util.function.Function<Object, Object>) (action) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                return ((java.util.function.Supplier<Object>) action).get();
            } catch (Throwable thrown) {
                return ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) handler).apply(thrown)).get();
            }
        };
