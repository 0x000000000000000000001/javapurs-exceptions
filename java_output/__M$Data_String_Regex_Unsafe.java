public class __M$Data_String_Regex_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.String.Regex.Unsafe"); }
    };


public static final Object unsafeRegex = __init$unsafeRegex();
    private static Object __init$unsafeRegex() { return (java.util.function.Function<Object, Object>) (s_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { Object __local_var_2_i2 = ((java.util.function.Function<Object, Object>) (__M$Control_Category.identity)).apply(__M$Control_Category.categoryFn); Object __local_var_3_i3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Regex.regex)).apply(s_0_i0))).apply(f_1_i1); return ( ((Boolean) ((((Object) (__local_var_3_i3)) instanceof __M$Data_Either.Left))) ? ((java.util.function.Function<Object, Object>) (__M$Partial_Unsafe.unsafeCrashWith)).apply(((__M$Data_Either.Left) (Object)(__local_var_3_i3)).value0) : ( ((Boolean) ((((Object) (__local_var_3_i3)) instanceof __M$Data_Either.Right))) ? ((java.util.function.Function<Object, Object>) (__local_var_2_i2)).apply(((__M$Data_Either.Right) (Object)(__local_var_3_i3)).value0) : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; }; }
}
