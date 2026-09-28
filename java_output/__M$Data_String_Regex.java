public class __M$Data_String_Regex {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Data.String.Regex"); }
    };
    // FFI provided by ../javapurs-strings/src/Data/String/Regex.java
    public static Object showRegexImpl = (java.util.function.Function<Object, Object>) (r) -> {
        return r.toString();
    };

    public static Object regexImpl = (java.util.function.Function<Object, Object>) (left) -> (java.util.function.Function<Object, Object>) (right) -> (java.util.function.Function<Object, Object>) (s1) -> (java.util.function.Function<Object, Object>) (s2) -> {
        try {
            String pattern = (String) s1;
            String flags = (String) s2;
            int f = 0;
            if (flags.contains("i")) f |= java.util.regex.Pattern.CASE_INSENSITIVE;
            if (flags.contains("m")) f |= java.util.regex.Pattern.MULTILINE;
            if (flags.contains("s")) f |= java.util.regex.Pattern.DOTALL;
            java.util.regex.Pattern p = java.util.regex.Pattern.compile(pattern, f);
            java.util.LinkedHashMap<String, Object> map = new java.util.LinkedHashMap<>();
            map.put("pattern", p);
            map.put("flags", flags);
            return ((java.util.function.Function<Object, Object>) right).apply(map);
        } catch (Exception e) {
            return ((java.util.function.Function<Object, Object>) left).apply(e.getMessage());
        }
    };

    public static Object source = (java.util.function.Function<Object, Object>) (r) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        return p.pattern();
    };

    public static Object flagsImpl = (java.util.function.Function<Object, Object>) (r) -> {
        String flags = (String) ((java.util.LinkedHashMap<String, Object>) r).get("flags");
        java.util.LinkedHashMap<String, Object> map = new java.util.LinkedHashMap<>();
        map.put("multiline", flags.contains("m"));
        map.put("ignoreCase", flags.contains("i"));
        map.put("global", flags.contains("g"));
        map.put("dotAll", flags.contains("s"));
        map.put("sticky", flags.contains("y"));
        map.put("unicode", flags.contains("u"));
        return map;
    };

    public static Object test = (java.util.function.Function<Object, Object>) (r) -> (java.util.function.Function<Object, Object>) (s) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        return p.matcher((String) s).find();
    };

    public static Object _match = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (r) -> (java.util.function.Function<Object, Object>) (s) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        String flags = (String) ((java.util.LinkedHashMap<String, Object>) r).get("flags");
        java.util.regex.Matcher m = p.matcher((String) s);
        if (flags.contains("g")) {
            java.util.List<Object> list = new java.util.ArrayList<>();
            while (m.find()) {
                list.add(((java.util.function.Function<Object, Object>) just).apply(m.group()));
            }
            if (list.isEmpty()) return nothing;
            return ((java.util.function.Function<Object, Object>) just).apply(list.toArray(new Object[0]));
        } else {
            if (m.find()) {
                Object[] list = new Object[m.groupCount() + 1];
                for (int i = 0; i <= m.groupCount(); i++) {
                    String group = m.group(i);
                    list[i] = group == null ? nothing : ((java.util.function.Function<Object, Object>) just).apply(group);
                }
                return ((java.util.function.Function<Object, Object>) just).apply(list);
            }
            return nothing;
        }
    };

    public static Object replace = (java.util.function.Function<Object, Object>) (r) -> (java.util.function.Function<Object, Object>) (s1) -> (java.util.function.Function<Object, Object>) (s2) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        String flags = (String) ((java.util.LinkedHashMap<String, Object>) r).get("flags");
        java.util.regex.Matcher m = p.matcher((String) s2);
        String replacement = (String) s1;
        if (flags.contains("g")) {
            return m.replaceAll(replacement);
        } else {
            return m.replaceFirst(replacement);
        }
    };

    public static Object _replaceBy = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (r) -> (java.util.function.Function<Object, Object>) (f) -> (java.util.function.Function<Object, Object>) (s) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        String flags = (String) ((java.util.LinkedHashMap<String, Object>) r).get("flags");
        java.util.regex.Matcher m = p.matcher((String) s);
        StringBuffer sb = new StringBuffer();
        boolean global = flags.contains("g");
        while (m.find()) {
            Object[] groups = new Object[m.groupCount()];
            for (int i = 1; i <= m.groupCount(); i++) {
                String g = m.group(i);
                groups[i - 1] = g == null ? nothing : ((java.util.function.Function<Object, Object>) just).apply(g);
            }
            String replacement = (String) ((java.util.function.Function<Object, Object>) ((java.util.function.Function<Object, Object>) f).apply(m.group())).apply(groups);
            m.appendReplacement(sb, java.util.regex.Matcher.quoteReplacement(replacement));
            if (!global) break;
        }
        m.appendTail(sb);
        return sb.toString();
    };

    public static Object _search = (java.util.function.Function<Object, Object>) (just) -> (java.util.function.Function<Object, Object>) (nothing) -> (java.util.function.Function<Object, Object>) (r) -> (java.util.function.Function<Object, Object>) (s) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        java.util.regex.Matcher m = p.matcher((String) s);
        if (m.find()) {
            return ((java.util.function.Function<Object, Object>) just).apply(m.start());
        }
        return nothing;
    };

    public static Object split = (java.util.function.Function<Object, Object>) (r) -> (java.util.function.Function<Object, Object>) (s) -> {
        java.util.regex.Pattern p = (java.util.regex.Pattern) ((java.util.LinkedHashMap<String, Object>) r).get("pattern");
        String str = (String) s;
        if (str.isEmpty()) {
            // JavaScript yields [] when the separator matches the empty string.
            java.util.regex.Matcher matcher = p.matcher(str);
            boolean zeroWidthMatch = matcher.find() && matcher.start() == 0 && matcher.end() == 0;
            return zeroWidthMatch ? new Object[0] : new Object[]{""};
        }
        Object[] parts = p.split(str, -1);
        // JavaScript drops the trailing empty piece produced by a zero-width
        // match at the end ("abc".split(//) is ["a","b","c"]).
        if (parts.length > 1 && parts[parts.length - 1].equals("")) {
            java.util.regex.Matcher endMatcher = p.matcher(str);
            if (endMatcher.find(str.length()) && endMatcher.start() == str.length() && endMatcher.end() == str.length()) {
                parts = java.util.Arrays.copyOf(parts, parts.length - 1);
            }
        }
        return parts;
    };


public static final Object showRegex = __init$showRegex();
    private static Object __init$showRegex() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = __M$Data_String_Regex.showRegexImpl; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object search = __init$search();
    private static Object __init$search() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Regex._search)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object replaceprime = __init$replaceprime();
    private static Object __init$replaceprime() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Regex._replaceBy)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object renderFlags = __init$renderFlags();
    private static Object __init$renderFlags() { return (java.util.function.Function<Object, Object>) (v_0_i0) -> { return (((String) ((((String) ((((String) ((((String) ((((String) (( ((Boolean) (((java.util.Map<String, Object>) v_0_i0).get("global"))) ? "g" : ""))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) v_0_i0).get("ignoreCase"))) ? "i" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) v_0_i0).get("multiline"))) ? "m" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) v_0_i0).get("dotAll"))) ? "s" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) v_0_i0).get("sticky"))) ? "y" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) v_0_i0).get("unicode"))) ? "u" : "")))); }; }
public static final Object regex = __init$regex();
    private static Object __init$regex() { return (java.util.function.Function<Object, Object>) (s_0_i0) -> { return (java.util.function.Function<Object, Object>) (f_1_i1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Regex.regexImpl)).apply(__M$Data_Either.Left))).apply(__M$Data_Either.Right))).apply(s_0_i0))).apply((((String) ((((String) ((((String) ((((String) ((((String) (( ((Boolean) (((java.util.Map<String, Object>) f_1_i1).get("global"))) ? "g" : ""))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) f_1_i1).get("ignoreCase"))) ? "i" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) f_1_i1).get("multiline"))) ? "m" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) f_1_i1).get("dotAll"))) ? "s" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) f_1_i1).get("sticky"))) ? "y" : "")))))) + ((String) (( ((Boolean) (((java.util.Map<String, Object>) f_1_i1).get("unicode"))) ? "u" : ""))))); }; }; }
public static final Object parseFlags = __init$parseFlags();
    private static Object __init$parseFlags() { return (java.util.function.Function<Object, Object>) (s_0_i0) -> { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply("g")))).apply(s_0_i0); final Object __field1 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply("i")))).apply(s_0_i0); final Object __field2 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply("m")))).apply(s_0_i0); final Object __field3 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply("s")))).apply(s_0_i0); final Object __field4 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply("y")))).apply(s_0_i0); final Object __field5 = ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply(__M$Data_Maybe.isJust))).apply(((java.util.function.Function<Object, Object>) (__M$Data_String_CodeUnits.indexOf)).apply("u")))).apply(s_0_i0); return new __Record$64_6f_74_41_6c_6c_O$67_6c_6f_62_61_6c_O$69_67_6e_6f_72_65_43_61_73_65_O$6d_75_6c_74_69_6c_69_6e_65_O$73_74_69_63_6b_79_O$75_6e_69_63_6f_64_65_O(new String[]{"global", "ignoreCase", "multiline", "dotAll", "sticky", "unicode"}, __field3, __field0, __field1, __field2, __field4, __field5); } }).get(); }; }
public static final Object match = __init$match();
    private static Object __init$match() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_String_Regex._match)).apply(__M$Data_Maybe.Just))).apply(__M$Data_Maybe.__singleton$Nothing.value); }
public static final Object flags = __init$flags();
    private static Object __init$flags() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Semigroupoid.compose)).apply(__M$Control_Semigroupoid.semigroupoidFn))).apply((java.util.function.Function<Object, Object>) (x_0_i0) -> { return x_0_i0; }))).apply(__M$Data_String_Regex.flagsImpl); }
}
