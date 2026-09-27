public final class __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final int field0;
    public final Object field1;
    public final int field2;
    __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I(String[] order, int field0, Object field1, int field2) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
    }
    public static __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I copy(__Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I original, int field0, Object field1, int field2) {
        return new __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I(original.__order, field0, field1, field2);
    }
    public static int read0(Object value) {
        if (value instanceof __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I) return ((__Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I) value).field0;
        return ((Integer) (((java.util.Map<?, ?>) value).get("index"))).intValue();
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I) return ((__Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I) value).field1;
        return ((java.util.Map<?, ?>) value).get("results");
    }
    public static int read2(Object value) {
        if (value instanceof __Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I) return ((__Record$69_6e_64_65_78_I$72_65_73_75_6c_74_73_O$73_65_65_64_I) value).field2;
        return ((Integer) (((java.util.Map<?, ?>) value).get("seed"))).intValue();
    }
    @Override public Object get(Object key) {
        if ("index".equals(key)) return field0;
        if ("results".equals(key)) return field1;
        if ("seed".equals(key)) return field2;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "index".equals(key) || "results".equals(key) || "seed".equals(key); }
    @Override public int size() { return 3; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
