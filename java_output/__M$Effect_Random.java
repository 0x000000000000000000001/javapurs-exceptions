public class __M$Effect_Random {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Random"); }
    };
    // FFI provided by ../javapurs-random/src/Effect/Random.java
    // Math.random in JavaScript.
    public static Object random = (java.util.function.Supplier<Object>) () -> Math.random();


public static final Object randomRange = __init$randomRange();
    private static Object __init$randomRange() { return (java.util.function.Function<Object, Object>) (min_0_i0) -> { return (java.util.function.Function<Object, Object>) (max_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object n_2_i2 = ((java.util.function.Supplier) (Object)(__M$Effect_Random.random)).get(); return (((Double) ((((Double) (n_2_i2)) * ((Double) ((((Double) (max_1_i1)) - ((Double) (min_0_i0)))))))) + ((Double) (min_0_i0))); } }); }; }; }
public static final Object randomInt = __init$randomInt();
    private static Object __init$randomInt() { return (java.util.function.Function<Object, Object>) (low_0_i0) -> { return (java.util.function.Function<Object, Object>) (high_1_i1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object n_2_i2 = ((java.util.function.Supplier) (Object)(__M$Effect_Random.random)).get(); return ((java.util.function.Supplier) (Object)(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Applicative.pure)).apply(__M$Effect.applicativeEffect))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Int.floor)).apply((((Double) ((((Double) ((((Double) ((((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(high_1_i1))) - ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(low_0_i0)))))) + ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Semiring.one)).apply(__M$Data_Semiring.semiringNumber)))))) * ((Double) (n_2_i2))))) + ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(low_0_i0)))))))).get(); } }); }; }; }
public static final Object randomBool = __init$randomBool();
    private static Object __init$randomBool() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.Map<String, Object>) __M$Effect.functorEffect).get("map"))).apply((java.util.function.Function<Object, Object>) (v_0_i0) -> { return (((Double) (v_0_i0)) < ((Double) (0.5))); }))).apply(__M$Effect_Random.random); }
}
