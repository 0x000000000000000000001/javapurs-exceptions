public class __M$Effect_Random {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Effect.Random"); }
    };
    // FFI provided by ../javapurs-random/src/Effect/Random.java
    // Math.random in JavaScript.
    public static Object random = (java.util.function.Supplier<Object>) () -> Math.random();


public static final Object randomRange = __init$randomRange();
    private static Object __init$randomRange() { return (java.util.function.Function<Object, Object>) (min_0$r0) -> { return (java.util.function.Function<Object, Object>) (max_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object n_2$r2 = ((java.util.function.Supplier) (Object)(__M$Effect_Random.random)).get(); return (((Double) ((((Double) (n_2$r2)) * ((Double) ((((Double) (max_1$r1)) - ((Double) (min_0$r0)))))))) + ((Double) (min_0$r0))); } }); }; }; }
public static final Object randomInt = __init$randomInt();
    private static Object __init$randomInt() { return (java.util.function.Function<Object, Object>) (low_0$r0) -> { return (java.util.function.Function<Object, Object>) (high_1$r1) -> { return (new java.util.function.Supplier<Object>() { public Object get() { Object n_2$r2 = ((java.util.function.Supplier) (Object)(__M$Effect_Random.random)).get(); return ((java.util.function.Function<Object, Object>) (__M$Data_Int.floor)).apply((((Double) ((((Double) ((((Double) ((((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(high_1$r1))) - ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(low_0$r0)))))) + ((Double) (1.0))))) * ((Double) (n_2$r2))))) + ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(low_0$r0))))); } }); }; }; }
public static final Object randomBool = __init$randomBool();
    private static Object __init$randomBool() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Applicative.liftA1)).apply(__M$Effect.applicativeEffect))).apply((java.util.function.Function<Object, Object>) (v_0$r0) -> { return (((Object) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Ord.ordNumberImpl)).apply(__M$Data_Ordering.__singleton$LT.value))).apply(__M$Data_Ordering.__singleton$EQ.value))).apply(__M$Data_Ordering.__singleton$GT.value))).apply(v_0$r0))).apply(0.5))) instanceof __M$Data_Ordering.LT); }))).apply(__M$Effect_Random.random); }
}
