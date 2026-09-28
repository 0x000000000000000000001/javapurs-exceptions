public class __M$Foreign_Object_ST {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Foreign.Object.ST"); }
    };
    // FFI provided by ../javapurs-foreign-object/src/Foreign/Object/ST.java
    // Port of Foreign/Object/ST.js over LinkedHashMaps.
    public static Object $new = (java.util.function.Supplier<Object>) () -> new java.util.LinkedHashMap<String, Object>();

    public static Object peekImpl = (java.util.function.Function<Object, Object>) (just) ->
        (java.util.function.Function<Object, Object>) (nothing) ->
        (java.util.function.Function<Object, Object>) (k) ->
        (java.util.function.Function<Object, Object>) (m) ->
            (java.util.function.Supplier<Object>) () -> {
                java.util.Map<String, Object> map = (java.util.Map<String, Object>) m;
                String key = (String) k;
                return map.containsKey(key)
                    ? ((java.util.function.Function<Object, Object>) just).apply(map.get(key))
                    : nothing;
            };

    public static Object poke = (java.util.function.Function<Object, Object>) (k) ->
        (java.util.function.Function<Object, Object>) (v) ->
        (java.util.function.Function<Object, Object>) (m) ->
            (java.util.function.Supplier<Object>) () -> {
                ((java.util.Map<String, Object>) m).put((String) k, v);
                return m;
            };

    public static Object delete = (java.util.function.Function<Object, Object>) (k) ->
        (java.util.function.Function<Object, Object>) (m) ->
            (java.util.function.Supplier<Object>) () -> {
                ((java.util.Map<String, Object>) m).remove((String) k);
                return m;
            };


public static final Object peek = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Foreign_Object_ST.peekImpl)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
}
