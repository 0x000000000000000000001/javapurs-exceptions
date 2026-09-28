public class __M$Foreign_Keys {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Foreign.Keys"); }
    };
    // FFI provided by ../javapurs-foreign/src/Foreign/Keys.java
    // Port of Foreign/Keys.js.
    public static Object unsafeKeys = (java.util.function.Function<Object, Object>) (value) ->
        value instanceof java.util.Map
            ? ((java.util.Map<String, Object>) value).keySet().toArray(new Object[0])
            : new Object[0];


public static final Object keys = __init$keys();
    private static Object __init$keys() { return (java.util.function.Function<Object, Object>) (dictMonad_0_i0) -> { Object fail_1_i1 = ((java.util.function.Function<Object, Object>) (__M$Foreign.fail)).apply(dictMonad_0_i0); Object pure_2_i2 = ((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(((java.util.function.Function<Object, Object>) (__M$Control_Monad_Except_Trans.applicativeExceptT)).apply(dictMonad_0_i0)); return (java.util.function.Function<Object, Object>) (value_3_i3) -> { return ( ((Boolean) (((java.util.function.Function<Object, Object>) (__M$Foreign.isNull)).apply(value_3_i3))) ? ((java.util.function.Function<Object, Object>) (fail_1_i1)).apply(new __M$Foreign.TypeMismatch("object", "null")) : ( ((Boolean) (((java.util.function.Function<Object, Object>) (__M$Foreign.isUndefined)).apply(value_3_i3))) ? ((java.util.function.Function<Object, Object>) (fail_1_i1)).apply(new __M$Foreign.TypeMismatch("object", "undefined")) : ( ((Boolean) (java.util.Objects.equals(((java.util.function.Function<Object, Object>) (__M$Foreign.typeOf)).apply(value_3_i3), "object"))) ? ((java.util.function.Function<Object, Object>) (pure_2_i2)).apply(((java.util.function.Function<Object, Object>) (__M$Foreign_Keys.unsafeKeys)).apply(value_3_i3)) : ((java.util.function.Function<Object, Object>) (fail_1_i1)).apply(new __M$Foreign.TypeMismatch("object", ((java.util.function.Function<Object, Object>) (__M$Foreign.typeOf)).apply(value_3_i3)))))); }; }; }
}
