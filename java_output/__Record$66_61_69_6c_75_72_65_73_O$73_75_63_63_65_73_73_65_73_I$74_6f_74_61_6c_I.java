public final class __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final int field1;
    public final int field2;
    __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I(String[] order, Object field0, int field1, int field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I copy(__Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I original, Object field0, int field1, int field2) {
        return new __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I(original.__order, field0, field1, field2);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I) return ((__Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I) value).field0;
        return ((java.util.Map<?, ?>) value).get("failures");
    }
    public static int read1(Object value) {
        if (value instanceof __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I) return ((__Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I) value).field1;
        return ((Integer) (((java.util.Map<?, ?>) value).get("successes"))).intValue();
    }
    public static int read2(Object value) {
        if (value instanceof __Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I) return ((__Record$66_61_69_6c_75_72_65_73_O$73_75_63_63_65_73_73_65_73_I$74_6f_74_61_6c_I) value).field2;
        return ((Integer) (((java.util.Map<?, ?>) value).get("total"))).intValue();
    }
    @Override public Object get(Object key) {
        if ("failures".equals(key)) return field0;
        if ("successes".equals(key)) return field1;
        if ("total".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "failures".equals(key) || "successes".equals(key) || "total".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
