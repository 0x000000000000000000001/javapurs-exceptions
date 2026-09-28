public class __M$Data_String_CaseInsensitive {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.String.CaseInsensitive"); }
    };


public static final Object CaseInsensitiveString = __init$CaseInsensitiveString();
    private static Object __init$CaseInsensitiveString() { return (java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }; }
public static final Object showCaseInsensitiveString = __init$showCaseInsensitiveString();
    private static Object __init$showCaseInsensitiveString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (((String) ((((String) ("(CaseInsensitiveString ")) + ((String) (((java.util.function.Function<Object, Object>) (__M$Data_Show.showStringImpl)).apply(v_0_i0)))))) + ((String) (")"))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object newtypeCaseInsensitiveString = __init$newtypeCaseInsensitiveString();
    private static Object __init$newtypeCaseInsensitiveString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i0) -> { return null /* TODO: PrimUndefined */; }; return new __Record$43_6f_65_72_63_69_62_6c_65_30_O(new String[]{"Coercible0"}, __field0); } }).get(); }
public static final Object eqCaseInsensitiveString = __init$eqCaseInsensitiveString();
    private static Object __init$eqCaseInsensitiveString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return java.util.Objects.equals(((java.util.function.Function<Object, Object>) (__M$Data_String_Common.toLower)).apply(v_0_i0), ((java.util.function.Function<Object, Object>) (__M$Data_String_Common.toLower)).apply(v1_1_i1)); }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object ordCaseInsensitiveString = __init$ordCaseInsensitiveString();
    private static Object __init$ordCaseInsensitiveString() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (v1_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Data_Ord.ordString).get("compare"))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_Common.toLower)).apply(v_0_i0)))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_Common.toLower)).apply(v1_1_i1)); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0_i2) -> { return __M$Data_String_CaseInsensitive.eqCaseInsensitiveString; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get(); }
}
