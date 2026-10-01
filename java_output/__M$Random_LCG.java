public class __M$Random_LCG {
    public static final Object FFI_STUB = new java.util.function.Function<Object, Object>() {
        public Object apply(Object arg) { throw new UnsupportedOperationException("Missing Java FFI in Random.LCG"); }
    };


public static final Object unSeed = __init$unSeed();
    private static Object __init$unSeed() { return (__IntFn) (v_0$r0) -> ((int) (v_0$r0)); }
public static final Object showSeed = __init$showSeed();
    private static Object __init$showSeed() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (v_0$r0) -> { return (((String) ("Seed ")) + ((String) (((java.util.function.Function<Object, Object>) (__M$Data_Show.showIntImpl)).apply(v_0$r0)))); }; return new __Record$73_68_6f_77_O(new String[]{"show"}, __field0); } }).get(); }
public static final Object lcgM = __init$lcgM();
    private static Object __init$lcgM() { return 2147483647; }
public static final Object mkSeed = __init$mkSeed();
    private static Object __init$mkSeed() { return (__IntFn) (x_0$r0) -> { int n_prime__1$r1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object __mod_l$r2 = x_0$r0; Object __mod_r$r3 = 2147483645; return (((Integer) __mod_r$r3) == 0 ? 0 : (int) Math.floorMod((long) ((Integer) __mod_l$r2), Math.abs((long) ((Integer) __mod_r$r3)))); } }).get())); return ((int) (( ((Boolean) ((((int) (n_prime__1$r1)) < ((int) (1))))) ? (((int) (n_prime__1$r1)) + ((int) (2147483646))) : n_prime__1$r1))); }; }
public static final Object randomSeed = __init$randomSeed();
    private static Object __init$randomSeed() { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Control_Applicative.liftA1)).apply(__M$Effect.applicativeEffect))).apply((__IntFn) (x_0$r0) -> { int n_prime__1$r1 = ((int) ((new java.util.function.Supplier<Object>() { public Object get() { Object __mod_l$r2 = x_0$r0; Object __mod_r$r3 = 2147483645; return (((Integer) __mod_r$r3) == 0 ? 0 : (int) Math.floorMod((long) ((Integer) __mod_l$r2), Math.abs((long) ((Integer) __mod_r$r3)))); } }).get())); return ((int) (( ((Boolean) ((((int) (n_prime__1$r1)) < ((int) (1))))) ? (((int) (n_prime__1$r1)) + ((int) (2147483646))) : n_prime__1$r1))); }))).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Effect_Random.randomInt)).apply(1))).apply(2147483646)); }
public static final Object lcgC = __init$lcgC();
    private static Object __init$lcgC() { return 0; }
public static final Object lcgA = __init$lcgA();
    private static Object __init$lcgA() { return 48271; }
public static final Object lcgPerturb = __init$lcgPerturb();
    private static Object __init$lcgPerturb() { return (java.util.function.Function<Object, Object>) (d_0$r0) -> { return (__IntFn) (v_1$r1) -> { Object __local_var_2$r2 = ((java.util.function.Function<Object, Object>) (__M$Data_Int.fromNumber)).apply(((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Number.remainder)).apply((((Double) ((((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(48271))) * ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(v_1$r1)))))) + ((Double) (((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(d_0$r0))))))).apply(((java.util.function.Function<Object, Object>) (__M$Data_Int.toNumber)).apply(2147483647))); return ((int) (( ((Boolean) ((((Object) (__local_var_2$r2)) instanceof __M$Data_Maybe.Just))) ? ((__M$Data_Maybe.Just) (Object)(__local_var_2$r2)).value0 : (new java.util.function.Supplier<Object>() { public Object get() { throw new RuntimeException("Failed pattern match"); } }).get()))); }; }; }
public static final Object lcgNext = __init$lcgNext();
    private static Object __init$lcgNext() { return ((java.util.function.Function<Object, Object>) (__M$Random_LCG.lcgPerturb)).apply(0); }
public static final Object eqSeed = __init$eqSeed();
    private static Object __init$eqSeed() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0$r0) -> { return (java.util.function.Function<Object, Object>) (y_1$r1) -> { return (((int) (x_0$r0)) == ((int) (y_1$r1))); }; }; return new __Record$65_71_O(new String[]{"eq"}, __field0); } }).get(); }
public static final Object ordSeed = __init$ordSeed();
    private static Object __init$ordSeed() { return (new java.util.function.Supplier<Object>() { public Object get() { final Object __field0 = (java.util.function.Function<Object, Object>) (x_0$r0) -> { return (java.util.function.Function<Object, Object>) (y_1$r1) -> { return ((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (((java.util.function.Function<Object, Object>) (__M$Data_Ord.ordIntImpl)).apply(__M$Data_Ordering.__singleton$LT.value))).apply(__M$Data_Ordering.__singleton$EQ.value))).apply(__M$Data_Ordering.__singleton$GT.value))).apply(x_0$r0))).apply(y_1$r1); }; }; final Object __field1 = (java.util.function.Function<Object, Object>) (_dollar___unused_0$r2) -> { return __M$Random_LCG.eqSeed; }; return new __Record$45_71_30_O$63_6f_6d_70_61_72_65_O(new String[]{"compare", "Eq0"}, __field1, __field0); } }).get(); }
}
