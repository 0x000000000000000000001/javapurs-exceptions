public class __M$Record_Unsafe_Union {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Record.Unsafe.Union"); }
    };
    // FFI provided by ../javapurs-record/src/Record/Unsafe/Union.java
    // Port of Record/Unsafe/Union.js: r2 first, then r1 overrides its keys.
    public static Object unsafeUnionFn = (java.util.function.Function<Object, Object>) (r1) ->
        (java.util.function.Function<Object, Object>) (r2) -> {
            java.util.Map<String, Object> copy = new java.util.LinkedHashMap<>((java.util.Map<String, Object>) r2);
            copy.putAll((java.util.Map<String, Object>) r1);
            return copy;
        };


public static final Object unsafeUnion = (java.util.function.Function<Object, Object>) (__local_var_0_i0) -> { return (java.util.function.Function<Object, Object>) (__local_var_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe_Union.unsafeUnionFn)).apply(__local_var_0_i0))).apply(__local_var_1_i1); }; };
}
