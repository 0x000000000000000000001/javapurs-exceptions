public final class __Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O extends java.util.AbstractMap<String, Object> {
    private final String[] __order;
    public final int field0;
    public final Object field1;
    __Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O(String[] order, int field0, Object field1) {
        this.__order = order;
        this.field0 = field0;
        this.field1 = field1;
    }
    public static __Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O copy(__Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O original, int field0, Object field1) {
        return new __Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O(original.__order, field0, field1);
    }
    public static int read0(Object value) {
        if (value instanceof __Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O) return ((__Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O) value).field0;
        return ((Integer) (((java.util.Map<?, ?>) value).get("newSeed"))).intValue();
    }
    public static Object read1(Object value) {
        if (value instanceof __Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O) return ((__Record$6e_65_77_53_65_65_64_I$73_69_7a_65_O) value).field1;
        return ((java.util.Map<?, ?>) value).get("size");
    }
    @Override public Object get(Object key) {
        if ("newSeed".equals(key)) return field0;
        if ("size".equals(key)) return field1;
        return null;
    }
    @Override public boolean containsKey(Object key) { return "newSeed".equals(key) || "size".equals(key); }
    @Override public int size() { return 2; }
    @Override public java.util.Set<java.util.Map.Entry<String, Object>> entrySet() {
        java.util.LinkedHashSet<java.util.Map.Entry<String, Object>> entries = new java.util.LinkedHashSet<>();
        for (String key : __order) entries.add(new java.util.AbstractMap.SimpleImmutableEntry<>(key, get(key)));
        return java.util.Collections.unmodifiableSet(entries);
    }
}
