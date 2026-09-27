public class __M$Data_String_CodeUnits {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.String.CodeUnits"); }
    };
    // FFI provided by ../javapurs-strings/src/Data/String/CodeUnits.java
    public static Object fromCharArray = (java.util.function.Function<Object, Object>) (a) -> {
        Object[] arr = (Object[]) a;
        StringBuilder sb = new StringBuilder(arr.length);
        for (Object o : arr) sb.append((String) o);
        return sb.toString();
    };

    public static Object toCharArray = (java.util.function.Function<Object, Object>) (s) -> {
        String str = (String) s;
        Object[] arr = new Object[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
        }
        return arr;
    };

    public static Object singleton = (java.util.function.Function<Object, Object>) (c) -> {
        return (String) c;
    };

    public static Object _charAt = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (i) -> (java.util.function.Function<Object, Object>) (s) -> {
        Integer idx = (Integer) i;
        String str = (String) s;
        if (idx >= 0 && idx < str.length()) {
            return ((java.util.function.Function<Object, Object>) just).apply(String.valueOf(str.charAt(idx)));
        } else {
            return nothing;
        }
    };

    public static Object _toChar = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (s) -> {
        String str = (String) s;
        if (str.length() == 1) {
            return ((java.util.function.Function<Object, Object>) just).apply(String.valueOf(str.charAt(0)));
        } else {
            return nothing;
        }
    };

    public static Object length = (java.util.function.Function<Object, Object>) (s) -> {
        return ((String) s).length();
    };

    public static Object countPrefix = (java.util.function.Function<Object, Object>) (p) -> (java.util.function.Function<Object, Object>) (s) -> {
        String str = (String) s;
        int i = 0;
        while (i < str.length() && (Boolean) ((java.util.function.Function<Object, Object>) p).apply(String.valueOf(str.charAt(i)))) {
            i++;
        }
        return i;
    };

    public static Object _indexOf = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (s) -> {
        int i = ((String) s).indexOf((String) x);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object _indexOfStartingAt = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (startAt) -> (java.util.function.Function<Object, Object>) (s) -> {
        int start = (Integer) startAt;
        String str = (String) s;
        if (start < 0 || start > str.length()) return nothing;
        int i = str.indexOf((String) x, start);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object _lastIndexOf = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (s) -> {
        int i = ((String) s).lastIndexOf((String) x);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object _lastIndexOfStartingAt = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (x) -> (java.util.function.Function<Object, Object>) (startAt) -> (java.util.function.Function<Object, Object>) (s) -> {
        // JavaScript clamps the starting position into [0, length].
        int start = (Integer) startAt;
        String str = (String) s;
        int from = Math.max(0, Math.min(start, str.length()));
        int i = str.lastIndexOf((String) x, from);
        return i == -1 ? nothing : ((java.util.function.Function<Object, Object>) just).apply(i);
    };

    public static Object take = (java.util.function.Function<Object, Object>) (n) -> (java.util.function.Function<Object, Object>) (s) -> {
        int num = (Integer) n;
        String str = (String) s;
        num = Math.max(0, Math.min(num, str.length()));
        return str.substring(0, num);
    };

    public static Object drop = (java.util.function.Function<Object, Object>) (n) -> (java.util.function.Function<Object, Object>) (s) -> {
        int num = (Integer) n;
        String str = (String) s;
        num = Math.max(0, Math.min(num, str.length()));
        return str.substring(num);
    };

    public static Object slice = (java.util.function.Function<Object, Object>) (b) -> (java.util.function.Function<Object, Object>) (e) -> (java.util.function.Function<Object, Object>) (s) -> {
        int begin = (Integer) b;
        int end = (Integer) e;
        String str = (String) s;
        if (begin < 0) begin = str.length() + begin;
        if (end < 0) end = str.length() + end;
        begin = Math.max(0, Math.min(begin, str.length()));
        end = Math.max(0, Math.min(end, str.length()));
        if (begin > end) return "";
        return str.substring(begin, end);
    };

    public static Object splitAt = (java.util.function.Function<Object, Object>) (i) -> (java.util.function.Function<Object, Object>) (s) -> {
        int idx = (Integer) i;
        String str = (String) s;
        idx = Math.max(0, Math.min(idx, str.length()));
        java.util.LinkedHashMap<String, Object> result = new java.util.LinkedHashMap<>();
        result.put("before", str.substring(0, idx));
        result.put("after", str.substring(idx));
        return result;
    };


public static final Object uncons = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return ( ((Boolean) (java.util.Objects.equals(v_0_i0, ""))) ? __M$Data_Maybe.__singleton$Nothing.value : new __M$Data_Maybe.Just((new java.util.function.Supplier<Object>() { public Object get() { java.util.Map<String, Object> __map = new java.util.LinkedHashMap<>(); __map.put("head", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Unsafe.charAt)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Semiring.zero)).apply(__M$Data_Semiring.semiringInt)))).apply(v_0_i0)); __map.put("tail", ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.drop)).apply(((java.util.function.Function<Object, Object>) (__M$Data_Semiring.one)).apply(__M$Data_Semiring.semiringInt)))).apply(v_0_i0));  return __map; } }).get())); };
public static final Object toChar = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits._toChar)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object takeWhile = (java.util.function.Function<Object, Object>) (p_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.take)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.countPrefix)).apply(p_0_i0))).apply(s_1_i1)))).apply(s_1_i1); }; };
public static final Object takeRight = (java.util.function.Function<Object, Object>) (i_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.drop)).apply((((int) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.length)).apply(s_1_i1))) - ((int) (i_0_i0)))))).apply(s_1_i1); }; };
public static final Object stripSuffix = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (str_1_i1) -> { Object v1_2_i2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.splitAt)).apply((((int) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.length)).apply(str_1_i1))) - ((int) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.length)).apply(v_0_i0))))))).apply(str_1_i1); return ( ((Boolean) (java.util.Objects.equals(__Record$61_66_74_65_72_O$62_65_66_6f_72_65_O.read0(v1_2_i2), v_0_i0))) ? new __M$Data_Maybe.Just(__Record$61_66_74_65_72_O$62_65_66_6f_72_65_O.read1(v1_2_i2)) : __M$Data_Maybe.__singleton$Nothing.value); }; };
public static final Object stripPrefix = (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (java.util.function.Function<Object, Object>) (str_1_i1) -> { Object v1_2_i2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.splitAt)).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.length)).apply(v_0_i0)))).apply(str_1_i1); return ( ((Boolean) (java.util.Objects.equals(__Record$61_66_74_65_72_O$62_65_66_6f_72_65_O.read1(v1_2_i2), v_0_i0))) ? new __M$Data_Maybe.Just(__Record$61_66_74_65_72_O$62_65_66_6f_72_65_O.read0(v1_2_i2)) : __M$Data_Maybe.__singleton$Nothing.value); }; };
public static final Object startsWith = (java.util.function.Function<Object, Object>) (pat_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.stripPrefix)).apply(pat_0_i0)); };
public static final Object lastIndexOfprime = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits._lastIndexOfStartingAt)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object lastIndexOf = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits._lastIndexOf)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object indexOfprime = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits._indexOfStartingAt)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object indexOf = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits._indexOf)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
public static final Object endsWith = (java.util.function.Function<Object, Object>) (pat_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.stripSuffix)).apply(pat_0_i0)); };
public static final Object dropWhile = (java.util.function.Function<Object, Object>) (p_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.drop)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.countPrefix)).apply(p_0_i0))).apply(s_1_i1)))).apply(s_1_i1); }; };
public static final Object dropRight = (java.util.function.Function<Object, Object>) (i_0_i0) -> { return (java.util.function.Function<Object, Object>) (s_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.take)).apply((((int) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.length)).apply(s_1_i1))) - ((int) (i_0_i0)))))).apply(s_1_i1); }; };
public static final Object contains = (java.util.function.Function<Object, Object>) (pat_0_i0) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply(pat_0_i0)); };
public static final Object charAt = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits._charAt)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value);
}
