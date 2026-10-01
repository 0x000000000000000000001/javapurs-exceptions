public class __M$Record_Builder {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Record.Builder"); }
    };
    // FFI provided by ../javapurs-record/src/Record/Builder.java
    // Port of Record/Builder.js. Records are maps (the typed-record classes
    // extend AbstractMap, so the map operations keep working).
    public static Object copyRecord = (java.util.function.Function<Object, Object>) (rec) ->
        new java.util.LinkedHashMap<>((java.util.Map<String, Object>) rec);

    public static Object unsafeInsert = (java.util.function.Function<Object, Object>) (l) ->
        (java.util.function.Function<Object, Object>) (a) ->
        (java.util.function.Function<Object, Object>) (rec) -> {
            ((java.util.Map<String, Object>) rec).put((String) l, a);
            return rec;
        };

    public static Object unsafeModify = (java.util.function.Function<Object, Object>) (l) ->
        (java.util.function.Function<Object, Object>) (f) ->
        (java.util.function.Function<Object, Object>) (rec) -> {
            java.util.Map<String, Object> map = (java.util.Map<String, Object>) rec;
            map.put((String) l, ((java.util.function.Function<Object, Object>) f).apply(map.get((String) l)));
            return rec;
        };

    public static Object unsafeDelete = (java.util.function.Function<Object, Object>) (l) ->
        (java.util.function.Function<Object, Object>) (rec) -> {
            ((java.util.Map<String, Object>) rec).remove((String) l);
            return rec;
        };

    public static Object unsafeRename = (java.util.function.Function<Object, Object>) (l1) ->
        (java.util.function.Function<Object, Object>) (l2) ->
        (java.util.function.Function<Object, Object>) (rec) -> {
            java.util.Map<String, Object> map = (java.util.Map<String, Object>) rec;
            map.put((String) l2, map.remove((String) l1));
            return rec;
        };


public static final Object union = __init$union();
    private static Object __init$union() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (r1_1$r1) -> { return (java.util.function.Function<Object, Object>) (r2_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe_Union.unsafeUnionFn)).apply(r1_1$r1))).apply(r2_2$r2); }; }; }; }
public static final Object semigroupoidBuilder = __init$semigroupoidBuilder();
    private static Object __init$semigroupoidBuilder() { return __M$Control_Semigroupoid.semigroupoidFn; }
public static final Object rename = __init$rename();
    private static Object __init$rename() { return (java.util.function.Function<Object, Object>) (dictIsSymbol_0$r0) -> { return (java.util.function.Function<Object, Object>) (dictIsSymbol1_1$r1) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_2$r2) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_3$r3) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_4$r4) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_5$r5) -> { return (java.util.function.Function<Object, Object>) (l1_6$r6) -> { return (java.util.function.Function<Object, Object>) (l2_7$r7) -> { return (java.util.function.Function<Object, Object>) (r1_8$r8) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Builder.unsafeRename)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0$r0).get("reflectSymbol"))).apply(l1_6$r6)))).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol1_1$r1).get("reflectSymbol"))).apply(l2_7$r7)))).apply(r1_8$r8); }; }; }; }; }; }; }; }; }; }
public static final Object nub = __init$nub();
    private static Object __init$nub() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return __M$Unsafe_Coerce.unsafeCoerce; }; }
public static final Object modify = __init$modify();
    private static Object __init$modify() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictIsSymbol_2$r2) -> { return (java.util.function.Function<Object, Object>) (l_3$r3) -> { return (java.util.function.Function<Object, Object>) (f_4$r4) -> { return (java.util.function.Function<Object, Object>) (r1_5$r5) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Builder.unsafeModify)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_2$r2).get("reflectSymbol"))).apply(l_3$r3)))).apply(f_4$r4))).apply(r1_5$r5); }; }; }; }; }; }; }
public static final Object merge = __init$merge();
    private static Object __init$merge() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (r1_2$r2) -> { return (java.util.function.Function<Object, Object>) (r2_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe_Union.unsafeUnionFn)).apply(r1_2$r2))).apply(r2_3$r3); }; }; }; }; }
public static final Object insert = __init$insert();
    private static Object __init$insert() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (dictIsSymbol_2$r2) -> { return (java.util.function.Function<Object, Object>) (l_3$r3) -> { return (java.util.function.Function<Object, Object>) (a_4$r4) -> { return (java.util.function.Function<Object, Object>) (r1_5$r5) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Builder.unsafeInsert)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_2$r2).get("reflectSymbol"))).apply(l_3$r3)))).apply(a_4$r4))).apply(r1_5$r5); }; }; }; }; }; }; }
public static final Object disjointUnion = __init$disjointUnion();
    private static Object __init$disjointUnion() { return (java.util.function.Function<Object, Object>) (_dollar___unused_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (r1_2$r2) -> { return (java.util.function.Function<Object, Object>) (r2_3$r3) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Unsafe_Union.unsafeUnionFn)).apply(r1_2$r2))).apply(r2_3$r3); }; }; }; }; }
public static final Object delete = __init$delete();
    private static Object __init$delete() { return (java.util.function.Function<Object, Object>) (dictIsSymbol_0$r0) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_1$r1) -> { return (java.util.function.Function<Object, Object>) (_dollar___unused_2$r2) -> { return (java.util.function.Function<Object, Object>) (l_3$r3) -> { return (java.util.function.Function<Object, Object>) (r2_4$r4) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Record_Builder.unsafeDelete)).apply(((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) dictIsSymbol_0$r0).get("reflectSymbol"))).apply(l_3$r3)))).apply(r2_4$r4); }; }; }; }; }; }
public static final Object categoryBuilder = __init$categoryBuilder();
    private static Object __init$categoryBuilder() { return __M$Control_Category.categoryFn; }
public static final Object build = __init$build();
    private static Object __init$build() { return (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (java.util.function.Function<Object, Object>) (r1_1$r1) -> { return __M$Record_Builder.__direct$10(v_0$r0, r1_1$r1); }; }; }
private static Object __direct$10(Object v_0$r0, Object r1_1$r1) { return ((java.util.function.Function<Object, Object>) (v_0$r0)).apply(((java.util.function.Function<Object, Object>) (__M$Record_Builder.copyRecord)).apply(r1_1$r1)); }
public static final Object buildFromScratch = __init$buildFromScratch();
    private static Object __init$buildFromScratch() { return (java.util.function.Function<Object, Object>) (a_0$r0) -> { return __M$Record_Builder.__direct$10(a_0$r0, (new java.util.function.Supplier<Object>() { public Object get() { return new __Record$(new String[]{}); } }).get()); }; }
public static final Object flip = __init$flip();
    private static Object __init$flip() { return (java.util.function.Function<Object, Object>) (f_0$r0) -> { return (java.util.function.Function<Object, Object>) (b_1$r1) -> { return (java.util.function.Function<Object, Object>) (a_2$r2) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (f_0$r0)).apply(a_2$r2))).apply(((java.util.function.Function<Object, Object>) (__M$Record_Builder.copyRecord)).apply(b_1$r1)); }; }; }; }
}
