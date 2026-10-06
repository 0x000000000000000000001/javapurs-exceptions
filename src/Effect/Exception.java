    public static Object showErrorImpl = (java.util.function.Function<Object, Object>) (err) -> {
        java.io.StringWriter writer = new java.io.StringWriter();
        ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
        return writer.toString();
    };

    // Keep the JavaScript error header; printStackTrace still supplies native
    // frames, causes and suppressed exceptions through this toString method.
    public static class Error extends RuntimeException {
        public Error(String message) { super(message); }
        public String errorName() { return "Error"; }
        @Override public String toString() {
            String name = errorName();
            String message = getMessage();
            if (name == null) name = "Error";
            if (message == null) message = "";
            if (name.isEmpty()) return message;
            return message.isEmpty() ? name : name + ": " + message;
        }
    }

    public static Object error = (java.util.function.Function<Object, Object>) (msg) -> new Error((String) msg);

    public static Object errorWithCause = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (cause) -> {
            Error err = new Error((String) msg);
            if (cause instanceof Throwable) err.initCause((Throwable) cause);
            return err;
        };

    public static Object errorWithName = (java.util.function.Function<Object, Object>) (msg) ->
        (java.util.function.Function<Object, Object>) (name) ->
            new NamedError((String) msg, (String) name);

    public static class NamedError extends Error {
        private final String errorName;
        public NamedError(String message, String name) { super(message); errorName = name; }
        @Override public String errorName() { return errorName; }
    }

    public static Object message = (java.util.function.Function<Object, Object>) (err) -> {
        String message = ((Throwable) err).getMessage();
        return message == null ? "" : message;
    };

    public static Object name = (java.util.function.Function<Object, Object>) (err) -> {
        String name = err instanceof Error
            ? ((Error) err).errorName()
            : ((Throwable) err).getClass().getSimpleName();
        return name == null || name.isEmpty() ? "Error" : name;
    };

    // stackImpl(just)(nothing)(err): JavaScript exposes a .stack string when
    // present; a Java Throwable always has one.
    public static Object stackImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (err) -> {
            java.io.StringWriter writer = new java.io.StringWriter();
            ((Throwable) err).printStackTrace(new java.io.PrintWriter(writer));
            return ((java.util.function.Function<Object, Object>) just).apply(writer.toString());
        };

    // Supplier cannot declare checked exceptions. The erased generic throw
    // preserves every Throwable, including checked exceptions and JVM Errors,
    // instead of changing the identity/message seen by catch, Aff or Promise.
    @SuppressWarnings("unchecked")
    private static <E extends Throwable> RuntimeException __rethrow(Throwable err) throws E {
        throw (E) err;
    }

    public static Object throwException = (java.util.function.Function<Object, Object>) (err) ->
        (java.util.function.Supplier<Object>) () -> { throw __rethrow((Throwable) err); };

    public static Object catchException = (java.util.function.Function<Object, Object>) (handler) ->
        (java.util.function.Function<Object, Object>) (action) ->
        (java.util.function.Supplier<Object>) () -> {
            try {
                return ((java.util.function.Supplier<Object>) action).get();
            } catch (Throwable thrown) {
                return ((java.util.function.Supplier<Object>) ((java.util.function.Function<Object, Object>) handler).apply(thrown)).get();
            }
        };
