public class __M$Data_String_Regex_Unsafe {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.String.Regex.Unsafe"); }
    };


public static final Object unsafeRegex = __init$unsafeRegex();
    private static Object __init$unsafeRegex() { return (java.util.function.Function<Object, Object>) (s_0$r0) -> { return (java.util.function.Function<Object, Object>) (f_1$r1) -> { Object __local_var_2$r2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Regex.regex)).apply(s_0$r0))).apply(f_1$r1); return ( ((Boolean) ((((Object) (__local_var_2$r2)) instanceof __M$Data_Either.Left))) ? ((java.util.function.Function<Object, Object>) (__M$Partial_Unsafe.unsafeCrashWith)).apply(((__M$Data_Either.Left) (Object)(__local_var_2$r2)).value0) : ( ((Boolean) ((((Object) (__local_var_2$r2)) instanceof __M$Data_Either.Right))) ? ((__M$Data_Either.Right) (Object)(__local_var_2$r2)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get())); }; }; }
}
