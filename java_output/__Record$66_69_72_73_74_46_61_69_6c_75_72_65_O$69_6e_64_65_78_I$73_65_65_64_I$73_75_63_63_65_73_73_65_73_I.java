public final class __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final int field1;
    public final int field2;
    public final int field3;
    __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I(String[] order, Object field0, int field1, int field2, int field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I copy(__Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I original, Object field0, int field1, int field2, int field3) {
        return new __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) return ((__Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) value).field0;
        return ((java.util.Map<?, ?>) value).get("firstFailure");
    }
    public static int read1(Object value) {
        if (value instanceof __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) return ((__Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) value).field1;
        return ((Integer) (((java.util.Map<?, ?>) value).get("index"))).intValue();
    }
    public static int read2(Object value) {
        if (value instanceof __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) return ((__Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) value).field2;
        return ((Integer) (((java.util.Map<?, ?>) value).get("seed"))).intValue();
    }
    public static int read3(Object value) {
        if (value instanceof __Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) return ((__Record$66_69_72_73_74_46_61_69_6c_75_72_65_O$69_6e_64_65_78_I$73_65_65_64_I$73_75_63_63_65_73_73_65_73_I) value).field3;
        return ((Integer) (((java.util.Map<?, ?>) value).get("successes"))).intValue();
    }
    @Override public Object get(Object key) {
        if ("firstFailure".equals(key)) return field0;
        if ("index".equals(key)) return field1;
        if ("seed".equals(key)) return field2;
        if ("successes".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "firstFailure".equals(key) || "index".equals(key) || "seed".equals(key) || "successes".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
