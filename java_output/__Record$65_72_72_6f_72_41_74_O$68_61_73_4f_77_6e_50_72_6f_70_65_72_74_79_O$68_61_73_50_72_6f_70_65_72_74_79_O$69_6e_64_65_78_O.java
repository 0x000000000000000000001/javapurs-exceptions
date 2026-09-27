public final class __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final Object field0;
    public final Object field1;
    public final Object field2;
    public final Object field3;
    __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O(String[] order, Object field0, Object field1, Object field2, Object field3) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }
    public static __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O copy(__Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O original, Object field0, Object field1, Object field2, Object field3) {
        return new __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O(original.__order, field0, field1, field2, field3);
    }
    public static Object read0(Object value) {
        if (value instanceof __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) return ((__Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) value).field0;
        return ((java.util.Map<?, ?>) value).get("errorAt");
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) return ((__Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("hasOwnProperty");
    }
    public static Object read2(Object value) {
        if (value instanceof __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) return ((__Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) value).field2;
        return ((java.util.Map<?, ?>) value).get("hasProperty");
    }
    public static Object read3(Object value) {
        if (value instanceof __Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) return ((__Record$65_72_72_6f_72_41_74_O$68_61_73_4f_77_6e_50_72_6f_70_65_72_74_79_O$68_61_73_50_72_6f_70_65_72_74_79_O$69_6e_64_65_78_O) value).field3;
        return ((java.util.Map<?, ?>) value).get("index");
    }
    @Override public Object get(Object key) {
        if ("errorAt".equals(key)) return field0;
        if ("hasOwnProperty".equals(key)) return field1;
        if ("hasProperty".equals(key)) return field2;
        if ("index".equals(key)) return field3;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "errorAt".equals(key) || "hasOwnProperty".equals(key) || "hasProperty".equals(key) || "index".equals(key); }
    @Override public int size() { return 4; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
